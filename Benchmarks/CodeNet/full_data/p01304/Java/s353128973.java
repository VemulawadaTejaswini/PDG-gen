import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbim = sc.nextInt();
        while(nbim-- > 0) {
            int gx = sc.nextInt();
            int gy = sc.nextInt();
            int[][] dp = new int[gy+2][gx+2];
            boolean[][][] hasTabis = new boolean[gy+2][gx+2][2];
            int p = sc.nextInt();
            
            for (int i = 0; i < p; i++) {
                int x = sc.nextInt() + 1;
                int y = sc.nextInt() + 1;
                int x2 = sc.nextInt() + 1;
                int y2 = sc.nextInt() + 1;
                hasTabis[Math.max(y, y2)][Math.max(x, x2)][x != x2 ? 0 : 1] = true;
            }
            dp[0][1] = 1;
            for (int i = 1; i < gy + 2; i++) {
                for (int j = 1; j < gx + 2; j++) {
                    dp[i][j] = (hasTabis[i][j][1] ? 0 : dp[i-1][j]) + (hasTabis[i][j][0] ? 0 : dp[i][j-1]);
                }
            }
            System.out.println(dp[gy+1][gx+1]);
            
        }
                
    }

}