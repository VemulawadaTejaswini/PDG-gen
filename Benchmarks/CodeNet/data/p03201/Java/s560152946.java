import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = ni();
        Map<Long, Integer> numCount = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            long A = nl();

            if (numCount.containsKey(A)) {
                numCount.put(A, numCount.get(A) + 1);
            } else {
                numCount.put(A, 1);
            }
        }

        // 2^31 = 2_147_483_648
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
            long sum = (long) Math.pow(2, i);
            for (Map.Entry map : numCount.entrySet()) {
                long A = (long) map.getKey();
                int numA = (int) map.getValue();

                long _A = sum - A;
                int num_A;
                if (numCount.containsKey(_A)) {
                    num_A = (int) numCount.get(_A);
                } else {
                    continue;
                }

                if (A != _A) {
                    int num = Math.min(numA, num_A);
                    ans += num;
                    numCount.put(A, numA - num);
                    numCount.put(_A, num_A - num);
                } else {
                    int num = numA / 2;
                    ans += num;
                    numCount.put(A, numA - num);
                }
            }
        }

        out.println(ans);
    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static String ns() {
        return sc.next();
    }

    static int[] niarr(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static long[] nlarr(int N) {
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }
}