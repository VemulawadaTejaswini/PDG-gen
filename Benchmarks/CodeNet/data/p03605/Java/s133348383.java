import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
     
    public class Main {
    	public static void main(String[] args) throws NumberFormatException, IOException {
    		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		Main m = new Main();
    		int n = Integer.valueOf(in.readLine());
    		int e;
    		Node root = null;
    		for(int i = 0; i < n; i++) {
    			e = Integer.valueOf(in.readLine());
    			if(root==null) {
    				root=BSTFactory.createBinarySearchTree(m, e);
    			}
    			Node f = root.search(e);
    			if(f==null) {
    				root.insert(e);
    			}else {
    				f.del();
    			}
    		}
    		System.out.println(root.count());
    	}
    	public class Node{
    		public int v;
    		public Node p;
    		public Node r;
    		public Node l;
    		public boolean isEmpty = false;
    		public int layer;
    		private Node(Node n) {
    			p = n;
    			layer = n.layer+1;
    		}
    		private Node(int i) {
    			v = i;
    			layer = 0;
    		}
    		public Node search(int e) {
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
    		public Node searchMin() {
    			if(l!=null) {
    				return l.searchMax();
    			}else {
    				return this;
    			}
    		}
    		public Node searchMax() {
    			if(r!=null) {
    				return r.searchMax();
    			}else {
    				return this;
    			}
    		}
    		public void insert(int i) {
    			if(isEmpty) {
    				v=i;
    				isEmpty = false;
    				return;
    			}
    			if(i<v) {
    				if(l==null) {
    					l=new Node(this);
    					l.v=i;
    				}else {
    					l.insert(i);
    				}
    			}else {
    				if(r==null) {
    					r=new Node(this);
    					r.v=i;
    				}else {
    					r.insert(i);
    				}
    			}
    		}
    		public void del() {
    			if(l==null&&r==null) {
    				if(p!=null) {
    					if(p.l!=null&&p.l.equals(this)) {
    						p.l = null;
    					}else {
    						p.r = null;
    					}
    				}else {
    					isEmpty = true;
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
    				exp = exp.l;
    			}
    		}
    		public int count() {
    			return (!isEmpty?1:0) + (l!=null?l.count():0) + (r!=null?r.count():0);
    		}
    		private void swap(Node n) {
    			n.v ^= v;
    	        v ^= n.v;
    	        n.v ^= v;
    		}
    	}
    	public static class BSTFactory{
    		public static Node createBinarySearchTree(Main m, int i) {
    			return m.new Node(i);
    		}
    	}
    }