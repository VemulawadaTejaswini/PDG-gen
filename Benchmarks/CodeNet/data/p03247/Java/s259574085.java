
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        for (int i=0; i<N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        Solve ans = solve(N, X, Y);

        if (ans == null) {
            System.out.println(-1);
        } else {
            System.out.println(ans.m);
            for (int i=0; i<ans.m; i++) {
                if (i != 0) System.out.print(" ");
                System.out.print(ans.d[i]);
            }
            System.out.println();
            for (int i=0; i<N; i++) {
                System.out.println(ans.w[i]);
            }
        }

    }

    private static Solve solve(int N, int[] X, int[] Y) {
        int sum = (Math.abs(X[0]) + Math.abs(Y[0]))%2;
        for (int i=1; i<N; i++) {
            if (sum != (Math.abs(X[i]) + Math.abs(Y[i]))%2) {
                return null;
            }
        }

        Solve ans = new Solve(N, 20 - sum);
        for (int i=0; i<ans.m; i++) {
            ans.d[i] = 1;
        }

        for (int i=0; i<N; i++) {
            int dist = Math.abs(X[i]) + Math.abs(Y[i]);
            ans.w[i] = "";

            for (int x=0; x<Math.abs(X[i]); x++) {
                ans.w[i] += X[i] > 0 ? "R" : "L";
            }
            for (int y=0; y<Math.abs(Y[i]); y++) {
                ans.w[i] += Y[i] > 0 ? "U" : "D";
            }
            for (int d = 0; d<ans.m - dist; d+=2) {
                ans.w[i] += "RL";
            }
        }

        return ans;
    }

    static class Solve {
        public int m = 0;
        public int[] d;
        public String[] w;

        public Solve(int N, int m) {
            this.m = m;
            d = new int[m];
            w = new String[N];
        }

    }

}
