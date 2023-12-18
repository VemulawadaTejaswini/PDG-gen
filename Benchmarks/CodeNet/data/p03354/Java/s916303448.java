import java.util.Scanner;
import java.util.TreeSet;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] pArray = new int[N];
		int[] x = new int[M];
		int[] y = new int[M];
		for(int i = 0;i < N;i++){
			pArray[i] = scan.nextInt()-1;
		}
		UnionFind uf = new UnionFind(N);
		for(int i = 0;i < M;i++){
			x[i] = scan.nextInt()-1;
			y[i] = scan.nextInt()-1;
			uf.unite(x[i], y[i]);
		}
		int count = 0;
		for(int i = 0;i < N;i++){
			if(uf.same(i, pArray[i])){
				count++;
			}
		}
		System.out.println(count);

	}


}

class UnionFind{
	int[] parent;
	public UnionFind(int N){
		this.parent = new int[N];
		for(int i = 0; i < N;i++){
			parent[i] = i;
		}
	}
	public int root(int x){			//根要素を取得
		if(parent[x] == x){			//初期状態
			return x;
		}else{
			return parent[x] = root(parent[x]);    	//再帰によって根を取得
		}
	}
	public void unite(int x,int y){ 	//統合メソッド
		if(same(x,y)){					//同じ根なら終了
			return;
		}
		int xroot = root(x);
		int yroot = root(y);
		parent[xroot] = yroot;			//統合
		return;

	}
	
	public boolean same(int x,int y){			//根が同じか（同じグループに属しているか）を判定
		return(root(x) == root(y));
	}
}




