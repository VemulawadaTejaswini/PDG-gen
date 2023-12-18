import java.util.Scanner;

class Main{

	//static long[] a;
	static	int N ;
	static	int M ;
	static long[][] dp;
	static int ans = 0;
	static	boolean[] flag ;
	static	int[] a ;
	static	int[] b ;
	static	int[] c ;
	static	int[] d ;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();

		a = new int[N];
		b = new int[N];
		c = new int[N];
		d = new int[N];

		for(int i = 0;i < N;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0;i < N;i++){
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		flag = new boolean[N];

			dfs(0,0);
		
		System.out.println(ans);





	}

	static void dfs(int p,int sum){

		if(p == N){
			ans = Math.max(ans, sum);
			return;
		}



		for(int i =0;i < N;i++){
			if(!flag[i]){		
				if(b[i] < d[p] && a[i] < c[p]){

					sum++;
					flag[i] = true;
					dfs(p+1, sum);
					flag[i] = false;
					sum--;
				}
			}
		}
		dfs(p+1, sum);
	}


}


