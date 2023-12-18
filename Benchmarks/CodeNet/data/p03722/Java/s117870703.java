import java.util.Comparator;
import java.util.Scanner;

class Main{


	static int[][] map ;
	static long ans = -10000000000000l;
	static int n ;

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		n = sc.nextInt();
		int m = sc.nextInt();
		map = new int[n+1][n+1];

		for(int i = 1;i <= m;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			map[a][b] = c;				//aからbに行く時のスコア
		}
		dfs(1,0);
		System.out.println(ans);


	}


	static void dfs(int p,long score){
		if(p == n){
			for(int i  = 1;i <= n;i++){
				if(	map[p][i] > 0){						//道があったら
					System.out.println("inf");
					System.exit(0);
				}
			}

			ans = Math.max(ans,score);
		}


		for(int i  = 1;i <= n;i++){
			if(	map[p][i] != 0){						//道があったら
				dfs(i, score+ map[p][i]);
			}
		}

		return;


	}

}

class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		int num1 = (int)obj1;
		int num2 = (int)obj2;

		if(num1 < num2) {
			return 1;
		} else if(num1 > num2) {
			return -1;
		} else{
			return 0;
		}
	}
}


