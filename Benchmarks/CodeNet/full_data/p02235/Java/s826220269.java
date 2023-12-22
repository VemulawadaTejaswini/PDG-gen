
import java.util.*;
import java.io.*;

/**
 * C
 */
public class Main {

    void run() {
        
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine());

        for(int i=0; i<q; i++) {
            System.out.println(ans(sc.nextLine(), sc.nextLine()));
        }

    }

    int ans(String x, String y) {
        
        int[][] DP = new int[x.length()+1][y.length()+1];

        for(int i=1; i<=x.length(); i++) {
            for(int j=1; j<=y.length(); j++) {
                
                DP[i][j] = Math.max(DP[i][j-1], DP[i-1][j]);

                if(x.charAt(i-1) == y.charAt(j-1)) {
                    DP[i][j] = Math.max(DP[i][j], DP[i-1][j-1]+1);
                }

            }
        }

        return DP[x.length()][y.length()];

    }

    public static void main(String[] args) {
        new Main().run();
    }

}
