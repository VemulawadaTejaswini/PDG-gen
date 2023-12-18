import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] A = new int[n+2];
		A[0] = 0;				//始点
		A[n+1] = 0;				//終点
		for(int i = 1;i <= n;i++){
			A[i] = sc.nextInt();
		}
		long sum = 0;
		for(int i = 0;i <= n;i++){
			sum +=Math.abs(A[i+1]-A[i]);
		}
		
	//	System.out.println(sum);
		for(int i = 1;i <= n;i++){
			long dis = 0;
			if((A[i] >= A[i-1] && A[i] <= A[i+1]) ||(A[i] <= A[i-1] && A[i] >= A[i+1])){
				dis = 0;
			}else{
				long near = Math.min(Math.abs(A[i]-A[i-1]),Math.abs(A[i]-A[i+1]));
				dis = 2*near;
			}
			System.out.println(sum - dis);
		}
		
		
		

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
	long from;		//p
	long end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return num - otherpair.num;
	}
}

