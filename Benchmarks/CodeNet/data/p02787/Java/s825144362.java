import java.io.PrintWriter;
import java.util.*;

public class DP {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] power = new int[n];
    int[] cost = new int[n];
    int[][] arr = new int[n][2];

    int[][] dp = new int[n+1][h+1];

    PrintWriter out = new PrintWriter(System.out);


    public static void main(String[] args) {
        new DP().run();
    }

    void run() {
        for (int i=0; i<n; i++) {
            int pow = sc.nextInt();
            int cost = sc.nextInt();
            arr[i][0] = pow;
            arr[i][1] = cost;
//            Pair pair = new Pair(pow, cost);
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i=0; i<n; i++) {
//            System.out.print(arr[i][0]+" ");
//            System.out.println(arr[i][1]);
        }

//        for (int i=0; i<n+1; i++) {
//            for (int j=0; j<h+1; j++) {
//                dp[i][j] = Integer.MAX_VALUE;
//            }
//        }a

        for (int i=1; i<n+1; i++) {
            for (int j=1; j<h+1; j++) {
                int p = arr[0][0];
                int c = arr[0][1];
                dp[i][j] = (j+p-1)/p*c;
            }
        }

//        for (int i=1; i<h+1; i++) {
//            int p = arr[0][0];
//            int c = arr[0][1];
//            dp[1][i] = (i+p-1)/p*c;
//        }

        for (int i=2; i<n+1; i++) {
            for (int j=1; j<h+1; j++) {
                int power = arr[i-1][0];
                int cost = arr[i-1][1];
                if (j-power>=0) {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-power]+cost);
                }
            }
        }

        for (int i=0; i<n+1; i++) {
            for (int j=0; j<h; j++) {
//                System.out.print(dp[i][j]+" ");
            }
//            System.out.println(dp[i][h]);
        }


        out.println(dp[n][h]);
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
