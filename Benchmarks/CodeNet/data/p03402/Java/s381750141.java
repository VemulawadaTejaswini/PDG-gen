import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		char[][] map = new char[100][100];
		
		for(int i = 0;i < 100;i++){
			for(int j = 0;j < 100;j++){
				if(j < 50){
					map[i][j] = '#';
				}else{
					map[i][j] = '.';
				}
			}
		}
//		for(int i = 0;i < 100;i++){
//				System.out.println(map[i]);
//		}
		
		int white = 1;
		int t = 0;
		int y = 0;
		while(true){
			if(white == a){
				break;
			}
			
			if(y >= 50){
				y = 0;
				t += 2;
			}
			
			map[t][y] = '.';
			white++;
			y += 2;
		}
		
		int black = 1;
		t = 0;
		y = 51;
		while(true){
			if(black == b){
				break;
			}
			
			if(y >= 100){
				y = 51;
				t += 2;
			}
			
			map[t][y] = '#';
			black++;
			y += 2;
		}
		System.out.println(100 + " "+100);
		for(int i = 0;i < 100;i++){
			System.out.println(map[i]);
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

