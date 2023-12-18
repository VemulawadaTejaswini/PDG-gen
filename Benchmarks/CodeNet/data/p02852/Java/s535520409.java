import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt()+1;
		int m = sc.nextInt(); //largest step
		
		OAVL con = new OAVL();
		
		String s = sc.next();
		
		boolean[] hole = new boolean[n];
		for(int i = 0; i < n; i++)
		{
			if(s.charAt(i) == '1')hole[i] = true;
		}
		
		int[] dp = new int[n];
		int[] step = new int[n];
		
		int[] minid = new int[n]; //smallest id for each step-to-fin
		
		for(int i = n-2; i >= 0; i--)
		{
			//remove i+m+1 from consideration
			if(i+m+1 < n-1 && !hole[i+m+1])
			{
				con.remove(dp[i+m+1]);
			}
			if(hole[i])continue;
			
			//n-1 is already finish!
			//1 step from fin?
			if(i+m >= n-1)
			{
				dp[i] = 1;
				step[i] = n-1;
			}
			else
			{
				//step into one of the considered places
				if(con.getSmallest(con.root) == null || con.getSmallest(con.root).value >= 999999999)
				{ //no way from here!!
					dp[i] = 999999999;
					step[i] = n-1;
				}
				else
				{
					int cur = (int)con.getSmallest(con.root).value;
					dp[i] = cur+1;
					step[i] = minid[cur];
				}
			}
			
//			System.out.println(i + ": " + dp[i] + ", step " + step[i]);
			//add to consideration
			con.add(dp[i]);
			
			if(dp[i] < 999999999)
				minid[dp[i]] = i;
		}
//		System.out.println(dp[0] + " steps");
		int steps = dp[0];
		
		if(steps >= 999999999)
		{
			System.out.println(-1);
			return;
		}
		
		int pos = 0;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < steps; i++)
		{
			if(i>0)sb.append(' ');
			sb.append((step[pos]-pos));
			pos = step[pos];
		}
		System.out.println(sb);
	}
	
	
	static class OAVL
	{ //Occurrence AVL Tree!
		Node root = null;
		int nodes = 0;
		
		//I think this was O(log n)
		int getNumberOfEqualOrGreater(long val)
		{
			return getNumberOfEqualOrGreater(val, root);
		}
		
		private int getNumberOfEqualOrGreater(long val, Node pos)
		{
			if(pos==null)return 0;
			if(val == pos.value)
			{
				if(pos.r != null)return pos.r.subsize+1;
				else return 1;
			}
			else if(val < pos.value)
			{
				int fromR = 0;
				if(pos.r != null)fromR = pos.r.subsize;
				return getNumberOfEqualOrGreater(val, pos.l) + fromR + 1;
			}
			else if(val > pos.value)
			{
				return getNumberOfEqualOrGreater(val, pos.r);
			}
			
			return 0;
		}
		
		//I think this was O(log n)
		int getNumberOfEqualOrLesser(long val)
		{
			return getNumberOfEqualOrLesser(val, root);
		}
		
		private int getNumberOfEqualOrLesser(long val, Node pos)
		{
			if(pos==null)return 0;
			if(val == pos.value)
			{
				if(pos.l != null)return pos.l.subsize+1;
				else return 1;
			}
			else if(val > pos.value)
			{
				int fromL = 0;
				if(pos.l != null)fromL = pos.l.subsize;
				return getNumberOfEqualOrLesser(val, pos.r) + fromL + 1;
			}
			else if(val < pos.value)
			{
				return getNumberOfEqualOrLesser(val, pos.l);
			}
			
			return 0;
		}
		
		void add(long i)
		{
			root = insert(root, i);
		}
		
		private Node insert(Node pos, long i)
		{
			if(pos == null)
			{ //place here
				nodes++;
				return new Node(i);
			}
			if(pos.value == i)
			{
				pos.number++;
				return pos; //already here!
			}
			
			if(i < pos.value)
			{ //go left
				pos.l = insert(pos.l, i);
			}
			else
			{
				pos.r = insert(pos.r, i);
			}
			
			pos.update();
			return balance(pos);
		}
		
		long getSmallestThatIsBiggerThan(long val)
		{
			return getSmallestThatIsBiggerThan(root, val);
		}
		
		private long getSmallestThatIsBiggerThan(Node pos, long val)
		{
//			if(pos == null)System.out.println("Pos null");
//			System.out.println("Searching at " + pos.value);
			if(pos.value <= val)
			{ //need bigger
				if(pos.r != null)
					return getSmallestThatIsBiggerThan(pos.r, val);
				else 
				{
					return 999999999;
				}
			}
			else
			{ //this or smaller
				if(pos.l != null)
				{
					return Math.min(pos.value, getSmallestThatIsBiggerThan(pos.l, val));
				}
				else return pos.value;
			}
		}
		
		long getBiggestThatIsSmallerThan(long val)
		{
			return getBiggestThatIsSmallerThan(root, val);
		}
		
		private long getBiggestThatIsSmallerThan(Node pos, long val)
		{
			if(pos.value >= val)
			{ //need smaller
				if(pos.l != null)
					return getBiggestThatIsSmallerThan(pos.l, val);
				else 
				{
					return -999999999;
				}
			}
			else
			{ //this or bigger
				if(pos.r != null)
				{
					return Math.max(pos.value, getBiggestThatIsSmallerThan(pos.r, val));
				}
				else return pos.value;
			}
		}		
		Node getSmallest(Node pos)
		{
			if(pos == null)return pos;
			if(pos.l == null)
				return pos;
			else return getSmallest(pos.l);
		}
		
		Node getLargest(Node pos)
		{
			if(pos.r == null)
				return pos;
			else return getLargest(pos.r);
		}
		
		void remove(long i)
		{
			root = delete(root, i);
		}
		
		private Node delete(Node pos, long i)
		{
			if(pos == null)
			{ //already non-existent
				return null;
			}
			if(pos.value == i)
			{
				//delete this
				if(pos.number > 1) //when there's only 1 left, delete.
				{
					pos.number--;
					return pos;
				}
				//MARK
				
				
				if(pos.l != null && pos.r != null)
				{
					//you can do either but let's remove from the subtree with bigger height.
					if(pos.l.height >= pos.r.height)
					{
						Node dum = getLargest(pos.l); //return largest of left subtree
						pos.value = dum.value; //copy its value
						pos.l = delete(pos.l, dum.value); //then remove that, while updating all nodes necessary
					}
					else
					{
						Node dum = getSmallest(pos.r); //return smallest of right subtree
						pos.value = dum.value; //copy its value
						pos.r = delete(pos.r, dum.value); //then remove that, while updating all nodes necessary
					}
				}
				else if(pos.l != null)
				{
					pos = pos.l;
				}
				else if(pos.r != null)pos = pos.r;
				else //both are null
				{
					return null;
				}
			}
			
			else if(i < pos.value)
			{ //go left
				pos.l = delete(pos.l, i);
			}
			else
			{
				pos.r = delete(pos.r, i);
			}
			
			pos.update();
			return balance(pos);
		}
		
		Node leftRotate(Node node)
		{
			Node b = node.r;
			node.subsize -= b.subsize;
			node.r = b.l;
			if(b.l!=null)node.subsize += b.l.subsize;
			
			if(b.l!=null)b.subsize -= b.l.subsize;
			b.l = node;
			b.subsize += node.subsize;
			
			node.update();
			b.update();
			return b;
		}
		
		Node rightRotate(Node node)
		{
			Node b = node.l;
			node.subsize -= b.subsize;
			node.l = b.r;
			if(b.r!=null)node.subsize += b.r.subsize;
			
			if(b.r!=null)b.subsize -= b.r.subsize;
			b.r = node;
			b.subsize += node.subsize;
			
			node.update();
			b.update();
			return b;
		}
		
		Node llCase(Node node)
		{
			return rightRotate(node);
		}
		
		Node lrCase(Node node)
		{
			node.l = leftRotate(node.l);
			return rightRotate(node);
		}
		
		Node rrCase(Node node)
		{
			return leftRotate(node);
		}
		
		Node rlCase(Node node)
		{
			node.r = rightRotate(node.r);
			return leftRotate(node);
		}
		
		Node balance(Node node)
		{
			if(node.balance <= -2)
			{
				if(node.l.balance <= 0)
					return llCase(node);
				else
					return lrCase(node);
			}
			else if(node.balance >= 2)
			{
				if(node.r.balance >= 0)
					return rrCase(node);
				else
					return rlCase(node);
			}
			
			return node; //already balanced!
		}
		
		void printout(Node pos)
		{
			if(pos == null)return;
			pos.printout();
			if(pos.l != null)System.out.println(pos.value + "'s L");
			printout(pos.l);
			if(pos.r != null)System.out.println(pos.value + "'s R");
			printout(pos.r);
		}
		
		static class Node
		{
			int balance = 0;
			int height = 0;
			long value;
			
			int number = 1;
			
			int subsize = 1; //size of subtree rooted here, i.e. descendants + 1 (self)
			
			Node l = null;
			Node r = null;
			
			void printout()
			{
				System.out.println("Value " + value + " height " + height + " subsize " + subsize + " balance " + balance);
			}
			
			void update()
			{ //leaf has height of 0.
				subsize = 1;
				if(l != null)subsize += l.subsize;
				if(r != null)subsize += r.subsize;
				
				int lh = -1;
				int rh = -1;
				if(l!=null)lh = l.height;
				if(r!=null)rh = r.height;
				height = 1 + Math.max(lh, rh);
				
				balance = rh - lh;
			}
			
			public Node(long i)
			{
				value = i;
			}
		}
	}


}
