import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int mod = (int) 1e9 + 7;
        int[][] dp = new int[s.length() + 1][13];
        
        dp[0][0] = 1;
        
        for( int i = 1; i <= s.length(); i++){
            char c = s.charAt(i-1);
            
            for(int j = 0; j < 13; j++){
                if ( c == '?' ) {
                    for ( int k = 0; k <= 9; k++){
                        int next = (j * 10 + k) % 13;
                        dp[i][next] = (dp[i][next] + dp[i-1][j]) % mod;
                    }
                } else {
                    int num = c - '0';
                    int next = (j * 10 + num) % 13;
                    dp[i][next] = (dp[i][next] + dp[i-1][j]) % mod;
                }
            }
        }
       
        System.out.println(dp[s.length()][5]);
        
    }
}