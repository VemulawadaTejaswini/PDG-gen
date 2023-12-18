import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int M=sc.nextInt();


    	int[] A=new int[M];
    	int[] B=new int[M];

    	for(int i=0;i<M;i++) {
    		A[i]=sc.nextInt()-1;
    		B[i]=sc.nextInt()-1;
    	}

    	int ans=0;
    	for(int i=0;i<M;i++) {
    		UnionFind uf=new UnionFind(N);

    		for(int j=0;j<M;j++) {

    			if(i!=j) {
    				uf.unite(A[j], B[j]);
    			}

    		}

    		int counter=0;
    		for(int j=0;j<M;j++) {

    			if(j==uf.par[j]) {
    				counter++;
    			}

    		}

    		if(counter>1) {
    			ans++;
    		}

    	}

    	System.out.println(ans);
    }
}

class UnionFind {

	int[] par;
	int[] rank;

	public UnionFind(int MaxN){
		par=new int[MaxN];
		rank=new int[MaxN];
		init(MaxN);
	}

	//ｎ個の要素で初期化。
	void init(int n) {
		for(int i=0;i<n;i++) {
			par[i]=i;
			rank[i]=0;
		}
	}

	//木の根を求める
	public int root(int x) {

		//根までたどりついたので返させる。
		if(par[x]==x) {
			return x;
		}else {
			//経路圧縮
			return par[x]=root(par[x]);
		}

	}

	//xとyの根を比べて、同じ集合に属するかどうかを返す。
	public boolean same(int x,int y) {
		return root(x)==root(y);
	}

	//xとyの属する集合を併合
	public void unite(int x,int y) {
		x=root(x);
		y=root(y);

		if(x==y) {
			return;
		}

		if(rank[x]<rank[y]) {
			par[x]=y;
		}else {
			par[y]=x;

			if(rank[x]==rank[y]) {
				rank[x]++;
			}
		}
	}

	public void printJudge(int x,int y) {
		if(same(x,y)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	public int getNumOfSet() {
		Set<Integer>set=new TreeSet<Integer>();

		for(int i=0;i<par.length;i++) {
			set.add(par[i]);
		}

		return set.size();
	}
}



