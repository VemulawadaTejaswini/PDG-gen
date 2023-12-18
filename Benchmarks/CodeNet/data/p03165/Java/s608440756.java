import java.util.Scanner;

public class Main {
    static StringBuilder max(StringBuilder a, StringBuilder b){
        if(a.length() > b.length())
            return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[][] dp = new int[s.length()+1][t.length()+1];

        for(int i = 1; i < s.length()+1; i++){
            for(int j = 1; j < t.length()+1; j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                if(s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j-1]+1);
            }
        }

        StringBuilder sb = new StringBuilder();

        int r = s.length();
        int c = t.length();

        while (r >= 1 && c >= 1){
           if(s.charAt(r-1) == t.charAt(c-1)){
               sb.append(s.charAt(r-1));
               r--;
               c--;
           }else{
               if(dp[r-1][c] > dp[r][c-1]){
                   r--;
               }else{
                   c--;
               }
           }
        }

        System.out.println(sb.reverse());
    }
}
