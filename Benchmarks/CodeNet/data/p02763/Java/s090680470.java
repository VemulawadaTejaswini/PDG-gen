import java.util.Scanner;


public class Main 
{
	static boolean debug = false;
	static int up = 0;
	
	static class AVLTree
	{ //AVL TREE!!!
		Node root = null;
		int nodes = 0;
		
		int getNumberOfEqualOrGreater(int val)
		{
			return getNumberOfEqualOrGreater(val, root);
		}
		
		int getNumberOfEqualOrLesser(int val)
		{
			return getNumberOfEqualOrLesser(val, root);
		}
		
		int getNumberOfEqualOrGreater(int val, Node pos)
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
		
		int getNumberOfEqualOrLesser(int val, Node pos)
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
		
		
		Node add(int i)
		{
			root = insert(root, i);
			return root;
		}
		
		Node insert(Node pos, int i)
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
	static class Node
	{ //Segment Tree.
		//range
		int rangel;
		int ranger;
		
		int val = 0;
		
		Node l = null;
		Node r = null;
		
		int check(int ql, int qr)
		{
			up++;
			
			int lin = Math.max(ql, rangel);
			int rin = Math.min(qr, ranger);
			
			if(rin < lin) return 0;
			if(lin == rangel && rin == ranger)
			{
				return val;
			}
			else
			{
				return l.check(lin, rin) + r.check(lin, rin);
			}
			
		}
		
		void update(int pos, int add)
		{
			up++;
			if(rangel <= pos && pos <= ranger)
			{
				val += add;
				if(l != null)l.update(pos, add);
				if(r != null)r.update(pos, add);
//				if(l != null)l.lazy+=add;
//				if(r != null)r.lazy+=add;
			}
		}
		
		public Node(int l0, int r0)
		{
			rangel = l0;
			ranger = r0;
			
			if(rangel != ranger)
			{ //make children
				int mid = (rangel + ranger)/2;
				//l child
				l = new Node(l0, mid);
				r = new Node(mid+1, r0);
			}
		}
	}
	
//	static int[][] orig;
	
	static int getOrig(int x, int c)
	{
		if(x < 0)return 0;
		return avl[c].getNumberOfEqualOrLesser(x);
	}
	
	static AVLTree[] avl;

	public static void main(String[] args) 
	{
		avl = new AVLTree[26];
		for(int i = 0; i < 26; i++)
			avl[i] = new AVLTree();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String s = sc.next();
		int q = sc.nextInt();
		//make 26 segment trees
		Node[] seg = new Node[26];
		int[] st = new int[n];
		
		for(int i = 0; i < 26; i++)
			seg[i] = new Node(0, n-1);
		
		//initial string
		{
			int[] count = new int[26];
			for(int i = 0; i < s.length(); i++)
			{
				int ch = s.charAt(i) - 'a';
				st[i] = ch;
				count[ch]++;
				
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
				seg[ori].update(pos, -1);
				seg[nw].update(pos, 1);
			}
			else if(t == 2)
			{
				int l = sc.nextInt()-1;
				int r = sc.nextInt()-1;
				
				int an = 0;
				for(int k = 0; k < 26; k++)
				{
					int count = seg[k].check(l, r) + (getOrig(r, k) - getOrig(l-1, k));
					int seger = seg[k].check(l, r);
					
					if(count > 0)an++;
					if(count >0)
					{
						if(debug)System.out.println("There are " + count + " of " + (char)('a'+k) + ", seger " + seger);
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
