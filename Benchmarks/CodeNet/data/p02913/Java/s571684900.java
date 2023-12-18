import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();
		String S = next();
		char[] C = S.toCharArray();

		List<List<Integer>> alphabet = new ArrayList<List<Integer>>(26);
		for(int i=0;i<26;i++) {
			alphabet.add(new ArrayList<Integer>());
		}
		for(int i=0;i<N;i++) {
			int t = (int)C[i]-97;
			alphabet.get(t).add(i);
		}


		int[][] dp = new int[2][N]; // dp[0] 対象index dp[1] cnt
		for(int[] a:dp) {
			Arrays.fill(a, -1);
		}
		int max = 0;
		for(List<Integer> tL:alphabet) {
			int tLlen = tL.size();
			for(int tll=0;tll<tLlen-1;tll++) {
				int i = tL.get(tll);
				for(int j=tll+1;j<tLlen;j++) {
					int cnt = 1;
					int tS_i = tL.get(j);
					if(N - tS_i <= max)continue;
					for(int k = 1;tS_i+k<N&&i+k<tS_i;k++) {
						if(dp[0][i+k]==tS_i+k&&dp[0][i+k]!=-1) {
							cnt += dp[1][i+k];
							break;
						}
						if(C[i+k]==C[tS_i+k]) {
							cnt++;
						}else {
							break;
						}
					}
					if(dp[1][i] < cnt) {
						dp[0][i] = tS_i;
						dp[1][i] = cnt;
					}
					if(dp[1][tS_i] < cnt) {
						dp[0][tS_i] = i;
						dp[1][tS_i] = cnt;
					}
					if(max < cnt) max = cnt;
				}
			}
		}

		out.println(max);
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}
}