import java.util.*;

public class Main2 {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long[] list = new long[n];
        long sum = 0;
        long mod = 1000000007;
        long ans = 0;

        for (int i = 0; i<n; i++) {
            long a = scan.nextLong();
            list[i] = a;
            sum += a;
            
        }

        for (int i = 0; i<n; i++) {

            sum= sum - list[i];
            ans += (list[i] * sum) % mod;
            ans %= mod;
        }

        System.out.println(ans);

    }
}
