import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);


	public void run() {
		while(true){
			int n=sc.nextInt(),m=sc.nextInt();
			Node[] nodes=new Node[m];
			for(int i=0;i<m;i++){
				String[] str=sc.next().split(",");
				nodes[i]=new Node(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]));
			}
			UnionFind uf=new UnionFind(n);
			Arrays.sort(nodes);
			int res=0;int node=0;
			for(int i=0;i<m;i++){
				if(!uf.find(nodes[i].p1,nodes[i].p2)){
					uf.unite(nodes[i].p1,nodes[i].p2);
					res+= nodes[i].dist;
					node++;
				}
			}
			ln(res/100-node);
		}

	}
	class Node implements Comparable<Node>{
		int p1,p2,dist;

		@Override
		public int compareTo(Node o) {
			return dist-o.dist;
		}
		Node(int a,int b,int c){
			p1=a;p2=b;dist=c;
		}
	}
	public class UnionFind {
	    private int[] id;
	    private int[] sz;
	    private int components;

	    public UnionFind(int N) {
	        id = new int[N];
	        sz = new int[N];
	        components = N;
	        for (int i = 0; i < N; i++) {
	            id[i] = i;
	            sz[i] = 1;
	        }
	    }
	    public int find(int x) {
	        while (x != id[x])
	            x = id[x];
	        return x;
	    }
	    public int components() {
	        return components;
	    }
	    public boolean find(int p, int q) {
	        return find(p) == find(q);
	    }
	    public void unite(int p, int q) {
	        int i = find(p);
	        int j = find(q);
	        if (i == j) return;
	        if   (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
	        else                 { id[j] = i; sz[i] += sz[j]; }
	        components--;
	    }
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}