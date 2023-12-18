import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int dp[] = new int[N+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 0; i < 7; i++) {
            int x6 = (int)Math.pow( 6, i );
            int x9 = (int)Math.pow( 9, i );
            
            if( x6 <= N ){
                dp[x6] = 1;
            }
            
            if( x9 <= N ){
                dp[x9] = 1;
            }
        }
        
        for( int i = 1; i <= N; i++ ) {
            for( int j = 1; j < i; j++ ) {
                dp[i] = Math.min( dp[i], dp[j] + dp[i-j] );
            }
        }
        
        System.out.println( dp[N] );
        
    }
}
