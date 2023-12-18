import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long[] sum = new long[n+1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + a[i-1];
        }

        long count1 = count(n, true, sum, 0 );
        long count2 = count(n, false, sum, 0);

        System.out.println(Math.min(count1, count2));
    }

    private static long count(int n , boolean pastPlus, long[] sum, long carry){
        long count2 = 0;
        for (int i = 1; i <= n; i++) {
            long cur = sum[i] + carry;

            if (pastPlus && cur >= 0) {
                // minus nisinaito
                count2 += cur + 1;
                carry = - cur - 1;
            }
            if (!pastPlus && cur <= 0) {
                count2 += -cur + 1;
                carry = -cur + 1;
            }

            pastPlus = !pastPlus;
        }

        return count2;
    }
}