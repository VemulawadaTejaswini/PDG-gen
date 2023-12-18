import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long MOD = (long) (Math.pow(10, 9) + 7);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(ary);
        long ans = 0;
        if (n % 2 == 0) {
            long even = -1;
            for (int i = 0; i < n; i += 2) {
                even += 2;
                int temp1 = ary[i];
                int temp2 = ary[i + 1];
                if (temp1 != even || temp2 != even) {
                    System.out.println(0);
                    return;
                }
            }
            ans = (long) (Math.pow(2, ((even / 2) + 1)) % MOD);
        } else {
            if (ary[0] != 0) {
                System.out.println(0);
                return;
            }
            long odd = 0;
            for (int i = 1; i < n; i += 2) {
                odd += 2;
                int temp1 = ary[i];
                int temp2 = ary[i + 1];
                if (temp1 != odd || temp2 != odd) {
                    System.out.println(0);
                    return;
                }
            }
            ans = (long) (Math.pow(2, (odd / 2)) % MOD);
        }
        System.out.println(ans);
    }
}