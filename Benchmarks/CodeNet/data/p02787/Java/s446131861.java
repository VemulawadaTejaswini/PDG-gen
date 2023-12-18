import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] power = new int[n];
    int[] cost = new int[n];
    int[][] arr = new int[n][2];

//    int[] dp = new int[h+10001];

    int[][] dp = new int[n+1][10001];

    PrintWriter out = new PrintWriter(System.out);


    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        for (int i=0; i<n; i++) {
            int pow = sc.nextInt();
            int cost = sc.nextInt();
            arr[i][0] = pow;
            arr[i][1] = cost;
//            Pair pair = new Pair(pow, cost);
        }

        for (int i=0; i<n+1; i++) {
            for (int j=0; j<h+1; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i=1; i<=n; i++) {
            for (int j=0; j<arr[i-1][0]; j++) {
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j]);
                dp[i][j] = Math.min(dp[i][j], arr[i-1][1]);
            }
            for (int j=arr[i-1][0]; j<=h; j++) {
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j]);
                dp[i][j] = Math.min(dp[i][j], dp[i][j-arr[i-1][0]]+arr[i-1][1]);
            }
        }

//        for (int i=0; i<n+1; i++) {
//            for (int j=0; j<h; j++) {
//                out.print(dp[i][j]+" ");
//            }
//            out.println(dp[i][h]);
//        }

        out.print(dp[n][h-1]);

//        for (int i=0; i<h+1; i++) dp[i] = Integer.MAX_VALUE;
//
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<arr[i][0]; j++) {
//                dp[j] = Math.min(dp[j], arr[i][1]);
//            }
//            for (int j=arr[i][0]; j<h+1; j++) {
//                dp[j] = Math.min(dp[j], dp[j-arr[i][0]]+arr[i][1]);
//            }
//        }


//        for (int i=0; i<h+1; i++) out.print(dp[i]+" ");



//        out.println(dp[h-1]);
        out.flush();
    }

    void solve(int i, int m) {
    }

    class Pair {
        int power;
        int cost;
        public Pair(int p, int c) {
            this.power = p;
            this.cost = c;
        }

        public int compareTo(Pair p) {
            if (this.cost < p.cost) return -1;
            if (this.cost > p.cost) return -1;
            return 0;
        }
    }
}
