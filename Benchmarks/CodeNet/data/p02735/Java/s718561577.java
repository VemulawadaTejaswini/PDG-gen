import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
//        out.flush();
        System.out.println(main.solve());
    }
    long solve() throws IOException{
        int H = sc.nextInt(), W = sc.nextInt();
        char[][] grid = new char[H][];
        for(int i=0;i<H;i++){
            grid[i] = sc.next().toCharArray();
        }
        int[][] dp = new int[H][W];
        for(int i=0;i<H;i++) Arrays.fill(dp[i],1000000);
        dp[0][0] = grid[0][0]=='.'?0:1;
        for(int r=0;r<H;r++){
            for(int c=0;c<W;c++){
                if(r>0){
                    //check from above
                    int temp = dp[r-1][c];
                    if(grid[r][c]=='#'&&grid[r-1][c]=='.') temp++;
                    dp[r][c] = Math.min(dp[r][c],temp);
                }
                if(c>0){
                    // check from left
                    int temp = dp[r][c-1];
                    if(grid[r][c]=='#'&&grid[r][c-1]=='.') temp++;
                    dp[r][c] = Math.min(dp[r][c],temp);
                }
            }
        }
        return dp[H-1][W-1];
    }
}

