import java.util.*;

public class Main {
	void doIt() {
		new Pollocks_conjecture().main();
	}

	class Pollocks_conjecture{
		final int MAX = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		final int LEN = 1000000;
		void main() {
			List<Integer> li = new ArrayList<>();
			for(int i = 1; i < LEN; i++) {
				int val = cul(i);
				if(val <= LEN) {
					li.add(val);
				}
				else {
					break;
				}
			}
			int dp[] = new int[LEN];
			int dpe[] = new int[LEN];
			Arrays.fill(dp, MAX);
			Arrays.fill(dpe, MAX);
			dp[0] = 0;
			dpe[0] = 0;
			for(int i = 1; i <= li.size(); i++) {
				int w = li.get(i - 1);
				for(int j = w; j < LEN; j ++) {
					dp[j] = Math.min(dp[j], dp[j - w] + 1);
				}
				if(w % 2 != 0) {
					for(int j = w; j < LEN; j ++) {
						dpe[j] = Math.min(dpe[j], dpe[j - w] + 1);
					}
				}

			}

			while(true) {
				int n = sc.nextInt();
				int len = 0;
				if(n == 0) return;		
				System.out.println(dp[n] + " " + dpe[n]);
			}
		}

		int cul(int n) {
			return (n) * (n + 1) * (n + 2) / 6;
		}
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}
