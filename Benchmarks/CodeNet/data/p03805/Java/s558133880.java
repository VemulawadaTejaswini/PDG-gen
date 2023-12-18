import java.util.ArrayList;
import java.util.Scanner;




class Main{


	static	ArrayList<Integer> one ;
	static	ArrayList<Integer> two ;
	static	ArrayList<Integer> three ;
	static	ArrayList<Integer> four ;
	static long pow = 1000000007;

	static int n;
	static int m;
	static int ans  = 0;
	static int[][] g;
	static boolean[] used;



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		n =sc.nextInt();
		m =sc.nextInt();
		g = new int[m+1][m+1];
		for(int i = 0;i < m;i++){
			int a  = sc.nextInt();
			int b = sc.nextInt();
			g[a][b] = 1;
			g[b][a] = 1;
		}
//
//		for(int i = 1;i <= m;i++){					//mapの確認
//			for(int j = 1;j <= m;j++){
//				System.out.print(g[i][j]);
//			}
//			System.out.println();
//		}

		used = new boolean[m+1];
	
		used[1] = true;
		dfs(1,1);
		System.out.println(ans);


	}
	static void dfs(int p,int num){			//numは通った頂点の個数
		if(num == n){
			ans++;
		}

		for(int i = 1;i <= m;i++){
			if(!(used[i]) && g[p][i] == 1){
				num++;
				used[i] = true;
				dfs(i, num);
				num--;
				used[i] = false;
			}

		}


	}

}



class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


