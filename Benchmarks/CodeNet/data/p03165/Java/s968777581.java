import java.util.Scanner;

public class Main {
	static long INF = 1L << 60;
	static int[][] dp = new int [3100][3100];
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();

		// DPループ
	    for (int i = 0; i < s.length; i++) {
	        for (int j = 0; j < t.length; j++) {
	            if (s[i]==t[j]) dp[i+1][j+1]=Math.max(dp[i+1][j+1], dp[i][j] + 1);
	            dp[i+1][j+1]=Math.max(dp[i+1][j+1], dp[i+1][j]);
	            dp[i+1][j+1]=Math.max(dp[i+1][j+1], dp[i][j+1]);
	        }
	    }
	    // 復元
	    String res = "";
	    int i = s.length, j = t.length;
	    while (i > 0 && j > 0){
	        // (i-1, j) -> (i, j) と更新されていた場合
	        if (dp[i][j] == dp[i-1][j]) {
	            i--; // DP の遷移を遡る
	        } // (i, j-1) -> (i, j) と更新されていた場合
	        else if (dp[i][j] == dp[i][j-1]) {
	            j--; // DP の遷移を遡る
	        }// (i-1, j-1) -> (i, j) と更新されていた場合
	        else {
	            res = s[i-1] + res; // このとき s[i-1] == t[j-1] なので、t[j-1] + res でも OK
	            i--;j--; // DP の遷移を遡る
	        }
	    }
	    System.out.println(res);
	}
}