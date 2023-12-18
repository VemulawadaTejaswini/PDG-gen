import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        if( K == 0 ) {
            System.out.println( (long) N * N );
            return;
        }

        long ans = 0;
        for(int b = 1; b <= N; b++ ) {
            long x = Math.max( (N / b) * (b-K), 0);
            long y = Math.max(N % b - K + 1, 0);
            
            if( b <= K && ( x > 0 ) ) {
                throw new Exception("Error!!");
            }
            
            ans += x + y;
        }
        
        System.out.println(ans);
    }
}
