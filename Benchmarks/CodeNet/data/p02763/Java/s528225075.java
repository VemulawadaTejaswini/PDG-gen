import java.util.Scanner;

public class Main 
{
	static boolean debug = false;
	static int up = 0;

	static class AVLTree
	{ //AVL TREE!!!
		Node root = null;
		int nodes = 0;
		
		//I think this was O(log n)
		int getNumberOfEqualOrGreater(int val)
		{
			return getNumberOfEqualOrGreater(val, root);
		}
		
		private int getNumberOfEqualOrGreater(int val, Node pos)
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
		int getNumberOfEqualOrLesser(int val)
		{
			return getNumberOfEqualOrLesser(val, root);
		}
		
		private int getNumberOfEqualOrLesser(int val, Node pos)
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
		
		void add(int i)
		{
			root = insert(root, i);
		}
		
		private Node insert(Node pos, int i)
		{
			if(pos == null)
			{ //place here
				nodes++;
				return new Node(i);
			}
			if(pos.value == i)return pos; //already here!
			
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
		
		Node getSmallest(Node pos)
		{
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
		
		void remove(int i)
		{
			root = delete(root, i);
		}
		
		private Node delete(Node pos, int i)
		{
			if(pos == null)
			{ //already non-existent
				return null;
			}
			if(pos.value == i)
			{
				//delete this
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
			int value;
			
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
			
			public Node(int i)
			{
				value = i;
			}
		}
		
		
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String s = sc.next();
		int q = sc.nextInt();
		int[] st = new int[n];
		
		AVLTree[] avl = new AVLTree[26];
		for(int i = 0; i < 26; i++)
			avl[i] = new AVLTree();
		
		//initial string
		{
			for(int i = 0; i < s.length(); i++)
			{
				int ch = s.charAt(i) - 'a';
				st[i] = ch;
				
				avl[ch].add(i);
			}
		}
		if(debug)System.out.println("Done");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < q; i++)
		{ //take queries
//			System.out.println("up " + up);
			
			int t = sc.nextInt();
			if(t == 1)
			{
				int pos = sc.nextInt()-1;
				//change character
				int ori = st[pos];
				int nw = sc.next().charAt(0) - 'a';
				st[pos] = nw;
				
				if(debug)System.out.println("Ori " + ori + ", new " + nw + ", pos " + pos);
				
				avl[ori].remove(pos);
				avl[nw].add(pos);
			}
			else if(t == 2)
			{
				int l = sc.nextInt()-1;
				int r = sc.nextInt()-1;
				
				int an = 0;
				for(int k = 0; k < 26; k++)
				{
					int right = avl[k].getNumberOfEqualOrLesser(r);
					int minl = avl[k].getNumberOfEqualOrLesser(l-1);
//					System.out.println("Right " + right + ", minl " + minl);
					
					int count = right - minl;
					
					if(count > 0)an++;
					if(count >0)
					{
//						if(debug)
//							System.out.println("There are " + count + " of " + (char)('a'+k));
					}
				}
				
				sb.append(an);
				sb.append('\n');
				if(debug)System.out.println(an);
				
			}
		}
		
		if(debug)System.out.println("ZZ");
		
		System.out.print(sb);
		
		
	}

}
