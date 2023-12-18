import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int INF = 2_000_000 + 228;

        int n = in.nextInt();
        int m = in.nextInt();
        String s = in.next();

        int[] dp = new int[n + 1];
        int[] step = new int[n + 1];

        dp[0] = (s.charAt(0) == '1' ? INF : 0);
        for (int i = 1; i <= n; ++i) {
            dp[i] = INF;
            for (int j = Math.min(m, i); j >= 1 ; --j) {
                if (dp[i - j] < dp[i]) {
                    dp[i] = dp[i - j];
                    step[i] = j;
                }
            }
            dp[i]++;
            if (s.charAt(i) == '1') {
                dp[i] = INF;
            }
            //out.println(dp[i] + " " + step[i]);
        }
        if (dp[n] >= INF) {
            out.println(-1);
        } else {
            List<Integer> ans = new ArrayList<Integer>();
            for (int i = n; i > 0; i -= step[i]) {
                ans.add(step[i]);
            }
            Collections.reverse(ans);
            for (int i = 0; i < ans.size(); ++i) {
                out.print(ans.get(i) + " ");
            }
        }

        in.close();
        out.close();
    }
    static class Pair {
	  		public long first;
	  		public long second;

	  		public Pair() {
	  			this(0, 0);
	  		}

	  		public Pair(final long first, final long second) {
	  			this.first = first;
	  			this.second = second;
	  		}
	  	}
}
