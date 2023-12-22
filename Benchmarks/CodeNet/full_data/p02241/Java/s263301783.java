
import java.util.*;

/**
 * A
 */
public class Main {

    void run() {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] G = new int[n+1][n+1];
        int[] d = new int[n+1];

        d[1] = 1;

        for(int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                G[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int sum=0;
        int dis;
        int min;

        for(int p=0; p<n; p++) {

            min = 2000;
            dis = -1;

            for(int i=1; i<=n; i++) {

                if(d[i] == 1) {
                    for(int j=1; j<=n; j++) {

                        if(d[j]==0 && G[i][j]>-1 && G[i][j]<min) {
                            min = G[i][j];
                            dis = j;
                        }

                    }
                }

            }

            if(dis != -1) {
            d[dis] = 1;
            sum += min;
            }

            if(n==n-1) {
                break;
            }

        }

        System.out.println(sum);

    }

    public static void main(String[] args) {
        new Main().run();
    }
}
