import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a;
		int dp[][]=new int[n][20];
		for(int i=0;i<n;i++) {

			a=sc.nextInt();
			for(int j=0;j<20;j++) {
				dp[i][j]=(int)a&1;
				a=a>>1;
			}
		}

		long answer=0;

		for(int i=0;i<n;i++) {
			answer+=saimigi(i, dp, n);
		}

		System.out.print(answer);

	}

	public static int saimigi(int start, int[][] dp, int n) {
		int plus=1;
		int keta[]=new int[20];
		for(int i=0;i<20;i++) {
			keta[i]=dp[start][i];
		}
		while(start+plus<n) {
			boolean hoge=true;
			for(int i=0;i<20;i++) {
				keta[i]+=dp[start+plus][i];
				if(keta[i]>1) {
					hoge=false;
					break;
				}
			}
			if(!hoge) {
				break;
			}
			plus++;
		}

		return plus;
	}

}
