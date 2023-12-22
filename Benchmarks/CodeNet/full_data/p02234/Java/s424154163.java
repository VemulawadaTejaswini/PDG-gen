
import java.util.*;

/**
 * B
 */
public class Main {

    void run() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] DP = new int[n+1][n+1];
        int[] r = new int[n+1];
        int[] c = new int[n+1];
        int[] p = new int[n+2];

        for(int i=1; i<=n; i++) {
            r[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        sc.close();

        for(int i=1; i<=n+1; i++) {
            if(i==1) {
                p[i] = r[i];
            } else {
                p[i] = c[i-1];
            }
        }

        for(int i=1; i<=n; i++) {
            DP[i][i] = 0;
        }

        for(int d=1; d<=n; d++) {
            for(int i=1; i<=n-d; i++) {
                int j = i+d;
                int min = DP[i][i]+DP[i+1][j]+p[i]*p[i+1]*p[j+1];
                for(int k=i; k<j; k++) {
                    if(DP[i][k]+DP[k+1][j]+p[i]*p[k+1]*p[j+1]<min) {
                        min = DP[i][k]+DP[k+1][j]+p[i]*p[k+1]*p[j+1];
                    }
                }
                DP[i][j] = min;
            }
        }

        System.out.println(DP[1][n]);

    }

    public static void main(String[] args) {
        new Main().run();
    }

}
