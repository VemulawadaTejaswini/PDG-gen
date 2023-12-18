import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();


		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0;i < n;i++){
			b[i] = sc.nextInt();
		}
		int[] data = new int[n*n];
		int c = 0;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				data[c] = a[i]+b[j];
				c++;
			}
		}

		long ans = 0;
		for(int i = 0;i < n*n;i++){
			ans = ans^data[i];; 
		}
		System.out.println(ans);



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



class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

