import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a =new int[n];
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int max = 0;
		int min = 0;
		long ans = 0;
		int center = (a[n-1]+1)/2;

		int mm = 0;				//i/2に近い値
		if(Math.abs(center-a[lowerbond(center,a)]) < Math.abs(center-a[Math.max(lowerbond(center,a)-1,0)])){
			mm = a[lowerbond(center,a)];
		}else{
			mm =a[Math.max(lowerbond(center,a)-1,0)];
		}
		//System.out.println(a[lowerbond(center,a)]);
		max = a[n-1];
		min = mm;

		System.out.println(max + " "+min);




	}
	static int lowerbond(int k, int[] data){		//kより小さい最小の値をdataの中から探し、返す二分探索
		int min = -1;
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return max;
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

