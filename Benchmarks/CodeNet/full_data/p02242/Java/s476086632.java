
import java.util.*;

/**
 * B
 */
public class Main {
    
    void run() {

        int min = 1000010;
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[][] G = new int[n][n];
        int[] discover = new int[n];

        int u, k, v, c;

        for(int i=0; i<n; i++) {
            u = sc.nextInt();
            k = sc.nextInt();
            for(int j=0; j<k; j++) {
                v = sc.nextInt();
                c = sc.nextInt();
                G[u][v] = c;
            }
        }

        sc.close();

        for(int i=0; i<n; i++) {
            discover[i] = min;
        }

        discover[0] = 0;

        for(int m=0; m<n; m++) {

            boolean dis = false;

            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {

                    if(discover[i]<min && G[i][j] > 0) {
                        if(discover[j]>discover[i]+G[i][j]) {
                            discover[j] = discover[i]+G[i][j];
                            dis = true;
                        }
                    }

                }
            }

            if(!dis) {
                break;
            }

        }

        for(int i=0; i<n; i++) {
            System.out.println(i+" "+discover[i]);
        }

    /*
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(G[i][j]+" ");
            }
            System.out.println();
        }
        
        */
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
