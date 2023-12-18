import java.util.*;
 
public class Main {

    private static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N+10];
        int maxDist = 0;
        for (int i = 0; i < N; i++) {
            int dist = sc.nextInt();
            num[dist]++;
            maxDist = Math.max(maxDist, dist);
        }
        for (int i = 0; i <= maxDist; i++) {
            if (num[i] == 0) {
                // invalid
                System.out.println(0);
                return;
            }
        }

        long ans = 1;
        int i = 1;
        while (num[i] > 0) {
            int a = num[i-1];
            int n = num[i];
            // a^n
            while (n-- > 0) {
                ans *= (long)a;
                ans %= MOD;
            }
            i++;
        }
        System.out.println(ans);
    }
}
