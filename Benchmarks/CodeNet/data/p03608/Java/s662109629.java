import java.util.*;

public class Main {
    static int[][] dp;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		for (int i = 0; i < r; i++) {
		    deq.add(sc.nextInt() - 1);
		}
		dp = new int[n][n];
		for (int i = 0; i < n; i++) {
		    Arrays.fill(dp[i], Integer.MAX_VALUE / 10);
		    dp[i][i] = 0;
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    int c = sc.nextInt();
		    dp[a][b] = c;
		    dp[b][a] = c;
		}
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        for (int k = 0; k < n; k++) {
		            dp[j][k] = Math.min(dp[j][k], dp[j][i] + dp[i][k]);
		        }
		    }
		}
		long min = Long.MAX_VALUE;
		for (int i = 0; i < r; i++) {
		    int x = deq.poll();
		    min = Math.min(min, search(x, deq));
		    deq.add(x);
		}
        System.out.println(min);
   }
   
   static long search(int idx, ArrayDeque<Integer> deq) {
       if (deq.size() == 1) {
           return dp[idx][deq.peek()];
       }
       int size = deq.size();
       long min = Long.MAX_VALUE;
       for (int i = 0; i < size; i++) {
           int x = deq.poll();
           min = Math.min(min, dp[idx][x] + search(x, deq));
           deq.add(x);
       }
       return min;
   }
}


