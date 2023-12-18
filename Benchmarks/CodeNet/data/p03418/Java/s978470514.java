import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        long ans = 0;
        for(int b = 1; b <= N; b++ ) {
            int p = N / b;
            int r = N % b;

            ans += Math.max(p * (b-K), 0);
            ans += Math.max(r - K + 1, 0);
            
            if( K == 0 ) {
                ans--;
            }
        }
        
        System.out.println(ans);
    }
}
