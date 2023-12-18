import java.util.Scanner;

public class Main {
    static long[] V;
    static long[][] dp;
    static final long MOD = (int)Math.pow(10,9) + 7;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(),W = sc.nextInt();
        sc.nextLine();
        dp = new long[H+1][W+1];
        String[] map = new String[H + 1];
        for (int i = 1; i <= H; i++) {
            map[i] = sc.nextLine();
        }
        dp[1][1] = 1;
        System.out.println(solve(H,W,map));
    }

    private static long solve(int H,int W,String[] map) {
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                if(map[i].charAt(j-1) == '.' && !(i==1 && j==1))
                    dp[i][j] = ((j-1==0?0:dp[i][j-1])+(i-1==0?0:dp[i-1][j]))%MOD;
            }
        }
        return dp[H][W];
    }
}
