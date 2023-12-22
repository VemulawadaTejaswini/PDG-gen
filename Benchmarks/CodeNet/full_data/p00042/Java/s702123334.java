import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scan = new Scanner(System.in);
		for(int c=1;;c++){
			int W = scan.nextInt();
			if(W==0)
				break;
			int N = scan.nextInt();
			int[] v = new int[N];
			int[] w = new int[N];
			for(int i=0;i<N;i++){
				String[] t = scan.next().split(",");
				v[i]=Integer.parseInt(t[0]);
				w[i]=Integer.parseInt(t[1]);
			}

			int[][] dp = new int[N+1][W+1];
			for(int j=0; j<=W;j++)
				dp[N][j]=0;

			for(int i=N-1;i>=0;i--){
				for(int j=0;j<=W;j++){
					if(w[i]>j){
						dp[i][j]=dp[i+1][j];
					}
					else{
						dp[i][j]=Math.max(dp[i+1][j],v[i]+dp[i+1][j-w[i]]);
					}
				}
			}

			int p=0;
			for(int j=0;j<=W;j++){
				if(dp[0][j]>dp[0][p])
					p=j;
			}

			System.out.println("Case "+c+":");
			System.out.println(dp[0][p]);
			System.out.println(p);
		}
	}

}