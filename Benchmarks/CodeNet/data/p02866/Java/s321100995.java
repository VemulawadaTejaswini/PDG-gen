import java.util.*;
 
public class Main {

    private static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N+10];
        for (int i = 0; i < N; i++) {
            num[sc.nextInt()]++;
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
