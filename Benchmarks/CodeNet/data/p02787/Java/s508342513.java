import java.io.PrintWriter;
import java.util.*;

public class DP {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] power = new int[n];
    int[] cost = new int[n];
    int[][] arr = new int[n][2];

    int[] dp = new int[h+10001];

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
//        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

//        for (int i=0; i<n; i++) {
//            System.out.print(arr[i][0]+" ");
//            System.out.println(arr[i][1]);
//        }




        for (int i=1; i<h+1; i++) {
            int idx = i+10000;
            dp[idx] = Integer.MAX_VALUE;
            for (int j=0; j<n; j++) {
                dp[idx] = Math.min(dp[idx], dp[idx-arr[j][0]]+arr[j][1]);
            }
        }

//        for (int i=0; i<n+1; i++) {
//            for (int j=0; j<h; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println(dp[i][h]);
//        }


        out.println(dp[h+10000]);
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
