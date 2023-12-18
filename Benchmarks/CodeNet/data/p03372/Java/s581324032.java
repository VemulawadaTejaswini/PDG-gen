import java.util.ArrayList;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		long c = sc.nextLong();
		long[]x = new long[n+2];
		long[]v = new long[n+2];

		for(int i = 1;i <= n;i++){
			x[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}
		x[n+1] = c;
		long[] sumtokei = new long[n+1];
		long[] sumhantokei = new long[n+1];

		for(int i = 1;i <= n;i++){
			sumtokei[i] = v[i] + sumtokei[i-1];
			//	System.out.println(sumtokei[i]);
		}

		ArrayList<Pair> pairs = new ArrayList<Pair>();
		long asum = 0;
		long xx = 0;
		for(int i = 0;i <= n;i++){				//B固定
			if(asum < sumtokei[i] - x[i]){
				asum = sumtokei[i] - x[i];
				xx = x[i];
			}
			Pair pair = new Pair();
			pair.from = asum;
			pair.end = xx;
			pairs.add(pair);
		}
		//		for(int i = 0;i < pairs.size();i++){
		//			System.out.println(pairs.get(i).from + " "+pairs.get(i).end);
		//		}
		//		int[] B = new int[n+1];
		//		for(int i = 1;i <= n;i++){				//A固定
		//			for(int j = 1;j <= i;j++){
		//				B[i] = Math.max(B[i], sumtokei[n] - sumtokei[n-j] -(c-x[n-j+1]));
		//			}
		//		}
		long ans = 0l;
		for(int i = 0;i <= n;i++){
			long left = pairs.get(n-i).from - pairs.get(n-i).end + (sumtokei[n] - sumtokei[n-i]) - (c-x[n-i+1]);
			long right = sumtokei[n] - sumtokei[n-i] + pairs.get(n-i).from - 2*(c-x[n-i+1]);
			ans = (long)Math.max(ans, (long)Math.max(left, right));
			//System.out.println(left + " " + right);

		}
		System.out.println(ans);


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

