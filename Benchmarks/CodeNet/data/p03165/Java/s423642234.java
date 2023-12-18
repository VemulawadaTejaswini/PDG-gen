import java.util.*;
import java.io.*;

class Main {
    public static int[] wt;
    public static int[] val;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        int s_len=s.length();
        int t_len=t.length();
        int[][] dp = new int[s_len+1][t_len+1];

        for (int i = 1; i<=s_len; i++){
            for (int j = 1; j <= t_len; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]=Math.max(dp[i][j], dp[i-1][j-1]+1);
            }
        }

        int i=s_len,j=t_len;
        StringBuilder ans=new StringBuilder();
        while(i>0 && j>0){
            if(dp[i-1][j]==dp[i][j]){
                i--;
                continue;
            }
            else if (dp[i][j-1]==dp[i][j]){
                j--;
                continue;
            }
            else{
                ans.append(s.charAt(i-1));
                i--;
                j--;
            }
        }
        System.out.println(ans.reverse().toString());
    }
}
