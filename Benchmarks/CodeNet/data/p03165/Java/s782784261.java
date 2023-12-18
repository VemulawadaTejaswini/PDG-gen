import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static public char[] S;
    static public char[] T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String s = sc.nextLine();
        String t = sc.nextLine();
        s = ' ' + s;
        t = ' ' + t;
        S = s.toCharArray();
        T = t.toCharArray();

        int[][] dp = new int[S.length][T.length];
        String r = LCS(dp, S, T);

        d0(dp, S, T);

        pw.println(r);
        pw.close();
    }

    public static String LCS(int[][] dp, char[] S, char[] T) {
        String r = "";
        for(int i=1; i<S.length; ++i) {
            for(int j=1; j<T.length; ++j) {
                if(S[i] == T[j]) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        System.out.printf("(%d,%d) %d\n", S.length, T.length, dp[S.length-1][T.length-1]);

        int i=S.length-1;
        int j=T.length-1;

        while(i>0 && j>0) {
            System.out.printf("%d,%d\n", i, j);
            if(dp[i-1][j] != dp[i][j] && dp[i][j] != dp[i][j-1]) {
//                r += dp[i][j];
                r = S[i] + r;
                System.out.printf("    %d,%d\n", i, j);
                j--;
                i--;
            }
            else {
                if(dp[i-1][j] == dp[i][j]){
                    i--;
                }
                else if(dp[i][j] == dp[i][j-1]) {
                    j--;
                }
                else if(j>0)
                    j--;
                else {
                    i--;
                }
            }
        }

        return r;
    }

    public static void d0(int[][] dp, char[] S, char[] T) {
        System.out.print("    ");

        for(int j=0; j<dp[0].length; ++j){
            System.out.printf("%c %d|", T[j], j);
        }
        System.out.println();

        for(int i=0; i<dp.length; ++i){
            System.out.printf("%c %d|", S[i], i);
            for(int j=0; j<dp[0].length; ++j){
                System.out.printf("  %d ", dp[i][j]);
            }
            System.out.println();
        }
    }
}
