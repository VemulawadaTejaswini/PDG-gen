
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        long[] ans = solve(K);
        for (int i=0; i<ans.length-1; i++) {
            System.out.println(ans[i]);
        }
    }

    private static long[] solve(int K) {
        long[] ans = new long[K+1];
        int digit = 1;

        ans[0] = 1;
        for (int i=1; i<K; i++) {
            ans[i] += ans[i-1] + (long)Math.pow(10, digit-1);

            if ((i+1)%9 == 0) {
                digit++;
            }
        }

        return ans;
    }
}
