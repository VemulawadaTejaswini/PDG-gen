import java.util.Scanner;

//Nim
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			int s = sc.nextInt();
			int[] m = new int[2*n];
			for(int i=0;i<2*n;i++)m[i]=sc.nextInt();
			//0: Undefine 1:Lose 2:win
			int[][] dp = new int[2*n][s+1];
			for(int i=0;i<2*n;i++)dp[i][1] = 1;
			for(int j=2;j<=s;j++)for(int i=0;i<2*n;i++){
				boolean win = false;;
				for(int p=1;p<=m[i];p++){
					if(j-p<=0)break;
					if(dp[(i+1)%(2*n)][j-p]==1)win=true;
				}
				dp[i][j] = win?2:1;
			}
			System.out.println(dp[0][s]==2?1:0);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}