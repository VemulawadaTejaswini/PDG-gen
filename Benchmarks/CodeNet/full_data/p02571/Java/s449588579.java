import java.util.Scanner;

public class Main{
    static int dp[][];
    private static int memo(String a, String b, int i, int j){
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(j==b.length()){
            dp[i][j] = 0;
            return 0;
        }
        if(i == a.length()){
            dp[i][j] = 2000;
            return 2000;
        }
        if(a.charAt(i)==b.charAt(j)){
            dp[i][j] = Math.min(memo(a, b, i+1, 0), memo(a, b, i+1, j+1));
        }else{
            dp[i][j] = Math.min(memo(a, b, i+1, 0), 1 + memo(a, b, i+1, j+1));
        }
        return dp[i][j];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        dp = new int[a.length()+1][b.length()+1];
        for(int i=0;i<=a.length();i++)
            for(int j=0;j<=b.length();j++)
                dp[i][j] = -1;
        System.out.println(memo(a, b, 0, 0));
        sc.close();
    }
}