import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		String S = sc.next();
		int[] dp = new int[n];
		for(int i=1;i<n;i++) {
			dp[i]=dp[i-1];
			if(S.substring(i-1, i+1).equals("AC")) {
				dp[i]++;
			}
		}
		for(int i=0;i<q;i++) {
			int L = Integer.parseInt(sc.next());
			int R = Integer.parseInt(sc.next());
			System.out.println((dp[R-1]-dp[L-1]));
		}
		sc.close();
	}
}
