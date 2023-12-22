import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean dp[];

	Main() {
		dp = new boolean[10001];
		Arrays.fill(dp, true);

		dp[0] = false;
		dp[1] = false;
		for (int i = 2; i < 100; i++) {
			if (dp[i]) {
				for (int j = i + i; j < 10001; j = j + i) {
					dp[j] = false;
				}
			}
		}
	}

	void run() {
		for(;sc.hasNextInt();){
			int n = sc.nextInt();
			
			int ans =0;
			for(int i = 1 ; i<n;i++){
				if(dp[i]){
					if(dp[n-i+1]){
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}