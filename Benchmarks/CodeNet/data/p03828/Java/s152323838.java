import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[1001];

        for (int i = 2; i <= n; i++) {
            int x = i;
            for (int j = 2; j <= i; j++) {
                while (x % j == 0) {
                    x /= j;
                    count[j]++;
                }
            }
        }
        
        long ans = 1;
        for (int i=2; i<=n; i++){
            ans = ans*(count[i]+1) % 1000000007;
                                       
        }
        System.out.println(ans);
        
    }
    
}
