import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int MOD = 1000000007;
    public static void main(String[] args) throws IOException{
        int H = readInt(), W = readInt();
        int[][]dp = new int[H+1][W+1];
        char[][]grid = new char[H+1][W+1];
        for(int i = 1;i<=H;i++){
            String s = read();
            for(int j = 1;j<=W;j++){
                grid[i][j] = s.charAt(j-1);
            }
        }
        dp[1][1] = 1;
        for(int i = 1;i<=H;i++){
            for(int j = 1;j<=W;j++){
                if(i+1<=H&&grid[i+1][j]=='.')dp[i+1][j] = (dp[i][j]+dp[i+1][j])%MOD;
                if(j+1<=W&&grid[i][j+1]=='.')dp[i][j+1] = (dp[i][j]+dp[i][j+1])%MOD;
            }
        }
        System.out.println(dp[H][W]);
    }
    static String read() throws IOException{
        while(st==null||!st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt() throws IOException{
        return Integer.parseInt(read());
    }
    static long readLong() throws IOException{
        return Long.parseLong(read());
    }
    static double readDouble() throws IOException{
        return Double.parseDouble(read());
    }
}