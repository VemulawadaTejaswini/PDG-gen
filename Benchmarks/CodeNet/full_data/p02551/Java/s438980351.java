import java.util.*;

public class Main {

	private static class Node implements Comparable<Node> {
		int rs;
		int cs;
		int re;
		int ce;
		Node right=null;
		Node left=null;

		public Node(int rs, int cs, int re,int ce) {
			this.rs=rs;
			this.cs=cs;
			this.re=re;
			this.ce=ce;
		}

		public int compareTo(Node x) {
			return 1;
		}

		public String toString() {
			return "("+rs+","+cs+") -> ("+re+","+ce+")";
		}

	}

	static long find(Node t,int x,int y) {
        if(t.left==null&&t.right==null) {
        	if(x==1) {
        		t.left=new Node(t.rs,t.cs,t.re,y);
        		t.right=new Node(t.rs,y+1,t.re,t.ce);
        		return t.re-t.rs-1;
        	}
        	else if(y==1) {
        		t.left=new Node(x+1,t.cs,t.re,t.ce);
        		t.right=new Node(t.rs,t.cs,x,t.ce);
        		return t.ce-t.cs-1;
        	}
        }
        if(t.left.rs<=x&&t.left.re>x&&t.left.cs<=y&&t.left.ce>y) {
        	return find(t.left,x,y);
        }
        else if(t.right.rs<=x&&t.right.re>x&&t.right.cs<=y&&t.right.ce>y) {
        	return find(t.right,x,y);
        }
        else {
        	return 0;
        }
    }

    public static void printTree(Node t) {
    	if(t!=null) {
	    	System.out.println(t);
	    	printTree(t.left);
	    	printTree(t.right);
	    }
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		Node tree=new Node(1,1,n,n);
		long ans=0;
		while(q-->0) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			long xx=find(tree,x==1?x:y,x==1?y:1);
			// printTree(tree);
			// System.out.println(xx);
			ans+=xx;
		}
		System.out.println(((long)(n-2)*(n-2))-ans);
	}
}