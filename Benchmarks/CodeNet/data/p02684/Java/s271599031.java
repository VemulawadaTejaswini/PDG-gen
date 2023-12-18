import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];
        final int L = 60;

        int[][] to = new int[L][n];

        for (int i=0; i<n; i++) {
            to[0][i] = sc.nextInt() - 1;
        }

        for (int i=1; i<L; i++) {
            for (int j=0; j<n; j++) {
                to[i][j] = to[i-1][to[i-1][j]];
            }
        }

        int v = 0;
        for (int i=L-1; 0<=i; i--) {
            long l = 1L << i;
            if (l <= k) {
                v = to[i][v];
                k -= l;
            }
        }

        System.out.println(v + 1);

    }

}
