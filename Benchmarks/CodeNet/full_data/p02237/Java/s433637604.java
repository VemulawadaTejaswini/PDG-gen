
import java.util.*;

/**
 * A
 */
public class Main {

    void run() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        
        for(int i=0; i<n; i++) {
            int u = sc.nextInt();
            int k = sc.nextInt();
            for(int j=0; j<k; j++) {
                int v = sc.nextInt()-1;
                matrix[i][v] = 1;
            }
        }

        sc.close();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j!=n-1) {
                    System.out.print(matrix[i][j]+" ");
                } else {
                    System.out.println(matrix[i][j]);
                }
            }
        }

    }

    public static void main(String[] args) {
        new Main().run();
    }
}
