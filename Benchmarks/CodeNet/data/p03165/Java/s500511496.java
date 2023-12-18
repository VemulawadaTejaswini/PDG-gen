import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int n = s.length();
        int m = t.length();
        int[][] dp  = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        StringBuilder str = new StringBuilder();
        int i=n,j=m;
        while(i>0 && j>0){
            if(dp[i][j] == dp[i-1][j-1]+1) {
                str.append(s.charAt(i - 1));
                i--;
                j--;
            }
            else if(dp[i][j]==dp[i-1][j])
                i--;
            else
                j--;
        }
//        for(int[] o : dp){
//            for(int k : o)
//                System.out.print(k+" ");
//            System.out.println();
//        }
        if(str.length()==0)
            System.out.println("");
        else
            System.out.println(str.reverse().toString());
    }
}