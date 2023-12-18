import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;
	static	int D ;
	static	int G ;
	static	int[] p;
	static	int[] c;
	static int ans = 100000000;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		D = sc.nextInt();
		G = sc.nextInt();
		p = new int[D+1];
		c = new int[D+1];

		for(int i = 1;i < D+1;i++){
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}



		dfs(D-1,p[D],100*D*p[D]+c[D]);
		if(G /(100*D) < p[D]){				//現在のG-scoreに対し、
			dfs(D-1, (G /(100*D))+1, G);

		}
		dfs(D-1,0,0);

		System.out.println(ans);


	}




	static void dfs(int mondai,int sum,int score){			//numは数、mondaiは問題番号,sumは問題をといた数


		if(score >= G){
			ans = Math.min(ans, sum);
			return;
		}
		if(mondai < 1){
			return;
		}


		dfs( mondai-1, sum+p[mondai], score+100*mondai*p[mondai]+c[mondai]);

		if((G-score) /(100*mondai) < p[mondai]){				//現在のG-scoreに対し、
			dfs(mondai-1, sum+ ((G-score) /(100*mondai)), G);

		}

		dfs( mondai-1, sum, score);




		return;





	}


}



