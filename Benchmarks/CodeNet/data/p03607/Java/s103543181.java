import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();
		int n = Integer.valueOf(in.readLine());
		int e;
		BST tree = null;
		for(int i = 0; i < n; i++) {
			e = Integer.valueOf(in.readLine());
			if(tree==null) {
				tree=m.new BST();
				tree.insert(e);
				//System.out.println("op "+i+"	: create \""+e+"\"	: "+tree.count()+" elements");
				continue;
			}
			Node f = tree.search(e);
			if(f==null) {
				tree.insert(e);
				//System.out.println("op "+i+"	: insert \""+e+"\"	: "+tree.count()+" elements");
			}else {
				tree.del(f);
				//System.out.println("op "+i+"	: delete \""+e+"\"	: "+tree.count()+" elements");
			}
		}
		System.out.println(tree.count());
	}
	public class BST{
		public Node root;
		public BST() {
		}
		public void insert(int e) {
			if(this.root == null) {
				root = new Node(e);
			}else {
				root.insert(e);
			}
		}
		public Node search(int e) {
			if(root==null) {
				return null;
			}else {
				return root.search(e);
			}
		}
		public void del(Node n) {
			if(root.equals(n)) {
				if(root.l==null&&root.r==null) {
					root = null;
				}else if(root.l!=null) {
					root.swap(root.l);
					root.l.del();
				}else if(root.r!=null) {
					root.swap(root.r);
					root.r.del();
				}else {
					Node exp=root.l.searchMax();
					root.swap(exp);
					exp = exp.l.clone();
					exp.l.del();
				}
			}else {
				n.del();
			}
		}
		public int count() {
			if(root==null) {
				return 0;
			}else {
				return root.count();
			}
		}
	}
	public class Node{
		private int v;
		private Node p;
		private Node r;
		private Node l;
		private int layer;
		private Node(Node n, int i) {
			p = n;
			v = i;
			layer = n.layer+1;
		}
		private Node(int i) {
			v = i;
			layer = 0;
		}
		private void insert(int i) {
			if(i<v) {
				if(l==null) {
					l=new Node(this, i);
				}else {
					l.insert(i);
				}
			}else {
				if(r==null) {
					r=new Node(this, i);
				}else {
					r.insert(i);
				}
			}
		}
		public void del() {
			if(l==null&&r==null) {
				if(p.l!=null&&p.l.equals(this)) {
					p.l = null;
				}else {
					p.r = null;
				}
			}else if(l!=null){
				swap(l);
				l.del();
			}else if(r!=null) {
				swap(r);
				r.del();
			}else {
				Node exp=l.searchMax();
				swap(exp);
				exp = exp.l.clone();
				exp.l.del();
			}
		}
		private Node search(int e) {
			if(e<v) {
				if(l!=null) {
					return l.search(e);
				}else {
					return null;
				}
			}else if(v<e) {
				if(r!=null) {
					return r.search(e);
				}else {
					return null;
				}
			}else {
				return this;
			}
		}
		private Node searchMax() {
			if(r!=null) {
				return r.searchMax();
			}else {
				return this;
			}
		}
		private int count() {
			return 1 + (l!=null?l.count():0) + (r!=null?r.count():0);
		}
		private void swap(Node n) {
			n.v ^= v;
			v ^= n.v;
			n.v ^= v;
		}
		@Override
		public Node clone() {
			Node clone;
			if(p==null) {
				clone = new Node(v);
				clone.l = l;
				clone.r = r;
				return clone;
			}else {
				clone = new Node(this, v);
				clone.l = l;
				clone.r = r;
				clone.layer = layer;
				return clone;
			}
		}
	}
	public static class BSTFactory{
		public static Node createBinarySearchTree(Main m, int i) {
			return m.new Node(i);
		}
	}
}
