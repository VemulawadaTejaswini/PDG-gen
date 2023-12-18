
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();

		int p[] = new int[101];
		for(int i=1; i<=N; i++) {
			int x = i;
			for(int j=2; j*j<=x; j++) {
				if(x%j==0) {
					while(x%j==0) {
						p[j]++;
						x/=j;
					}
				}
			}
			if(x>1) {
				p[x]++;
			}
		}

		int dp[][] = new int[102][76]; //使う素数/約数の個数
		dp[1][1]=1;
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=75; j++) {
				for(int k=0; k<=p[i]; k++) {
					if(j*(k+1)<=75) {
						dp[i+1][j*(k+1)] += dp[i][j];
					}
				}
			}
		}
		System.out.println(dp[N][75]);
		sc.close();
	}


}
