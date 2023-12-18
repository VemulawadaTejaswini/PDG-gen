import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] x =new int[n];
		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i = 0;i < n;i++){
			x[i] = sc.nextInt();
			data.add(x[i]);
		}
		Collections.sort(data);		

		for(int i = 0;i < n;i++){
			if(x[i] <= data.get((data.size()/2) -1)){
				System.out.println(data.get(data.size()/2));

				//			System.out.println();
				//			for(int j = 0;j < n;j++){
				//				System.out.print (data.get(j)+" ");
				//			}
				//			System.out.println();

			}else{
				System.out.println(data.get((data.size()/2) -1));
			}



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
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

