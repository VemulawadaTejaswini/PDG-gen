
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	char t[][];
	long dp[];
	long mod = 1000000007;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		t = new char[2][n];
		dp = new long[n+1];
		for(int i=0; i<2; i++) {
			t[i] = sc.next().toCharArray();
		}

		dp[0]=1;
		int i=0;
		boolean pretate = false;
		while(i<n) {
			if(i==0) {
				//縦
				if(t[0][i] == t[1][i]) {
					dp[i+1] = 3;
					i++;
					pretate=true;
				//横
				}else {
					dp[i+1] = 6;
					dp[i+2] = 6;
					i+=2;
					pretate=false;
				}
			}else {
				//縦
				if(t[0][i] == t[1][i]) {
					if(pretate) {
						dp[i+1] = dp[i]*2;
						dp[i+1] %= mod;
					}else {
						dp[i+1] = dp[i];
						dp[i+1] %= mod;
					}
					pretate=true;
					i++;
				//横
				}else {
					if(pretate) {
						dp[i+1] = dp[i]*2;
						dp[i+1] %= mod;
						dp[i+2] = dp[i]*2;
						dp[i+2] %= mod;
					}else {
						dp[i+1] = dp[i]*3;
						dp[i+1] %= mod;
						dp[i+2] = dp[i]*3;
						dp[i+2] %= mod;
					}
					pretate=false;
					i+=2;
				}
			}

		}
		System.out.println(dp[n]);
		sc.close();
	}

}
