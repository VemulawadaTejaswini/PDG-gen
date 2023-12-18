import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] data ={a,b,c};
		Arrays.sort(data);

		int ans = 0;
		while(true){
			if(data[0] == data[1] && data[1] == data[2]){
				System.out.println(ans);
				return;
			}

			if(data[0] == data[2]-1){
				if(data[0] == data[1]){
					data[0]++;
					data[1]++;
					ans++;
				}else if(data[1] == data[2]){
					ans += 2;
					System.out.println(ans);
					return;
				}else{
					data[1] += 2;
					ans++;
					Arrays.sort(data);
				}
			}else{
				data[0] += 2;
				ans++;
				Arrays.sort(data);

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

