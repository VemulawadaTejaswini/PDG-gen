import java.util.*;

class E implements Comparable<E>{
    int x,y;
    long c;
    E(int x,int y,long c){
        this.x=x;this.y=y;this.c=c;
    }
    @Override
    public int compareTo(E o){
        return Long.compare(c,o.c);
    }
}

class UnionFind {
    int[] parent;
    int[] rank;
    UnionFind(int n) {
	this.parent = new int[n];
	this.rank = new int[n];
	this.clear();
    }
    void clear() {
	int n = this.parent.length;
	for (int i = 0; i < n; ++i) {
	    this.parent[i] = i;
	    this.rank[i] = 0;
	}
    }
    void unify(int x, int y) {
	int rootX = this.root(x);
	int rootY = this.root(y);
	if (rootX == rootY) {
	    return;
	}
	if (this.rank[rootX] < this.rank[rootY]) {
	    this.parent[rootX] = rootY;
	} else {
	    this.parent[rootY] = rootX;
	    if (this.rank[rootX] == this.rank[rootY]) {
		this.rank[rootX]++;
	    }
	}
    }
    int root(int x) {
	if (this.parent[x] == x) {
	    return x;
	}
	return this.parent[x] = this.root(this.parent[x]);
    }
}


class Main {
    static final long I=(1L<<62)-1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.next());
        int q=Integer.parseInt(scan.next());
        List<E>e=new ArrayList<E>();
        long[]adj=new long[n];
        Arrays.fill(adj,I);
        for(int i=0;i<q;++i){
            int a=Integer.parseInt(scan.next());
            int b=Integer.parseInt(scan.next());
            long c=Integer.parseInt(scan.next());
            e.add(new E(a,b,c));
            adj[a]=Math.min(adj[a],c+1);
            adj[b]=Math.min(adj[b],c+2);
        }
        for(int i=0;i<2;++i)
            for(int j=0;j<n;++j)
                adj[j]=Math.min(adj[j],adj[(j+n-1)%n]+2);
        for(int i=0;i<n;++i)
            e.add(new E(i,(i+1)%n,adj[i]));
        Collections.sort(e);
        UnionFind u=new UnionFind(n);
        long t=0;
        for(E ee:e){
            int x=ee.x;
            int y=ee.y;
            long c=ee.c;
            if(u.root(x)!=u.root(y)){
                u.unify(x,y);
                t+=c;
            }
        }
        System.out.println(t);
    }
}
