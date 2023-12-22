import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long[] b = new long[m];
        long temp = 0;
        for (int i = 0; i < n; i++) {
            temp += Integer.parseInt(sc.next());
            a[i] = temp;
        }
        temp = 0;
        for (int i = 0; i < m; i++) {
            temp += Integer.parseInt(sc.next());
            b[i] = temp;
        }
        int start = 0;
        boolean isA = false;
        for (int i = n - 1; i >= 0; i--) {
            if (k - a[i] >= 0) {
                start = i;
                isA = true;
                break;
            }
        }
        int ans = 0;
        if (!isA) {
            int result = upperBound(m, b, k);
            int idx;
            if (result >= 0) {
                idx = result;
            } else {
                idx = -result - 1;
            }
            ans = Math.max(ans, idx);
        } else {
            for (int i = start; i >= 0; i--) {
                int result = upperBound(m, b, k - a[start]);
                int idx;
                if (result >= 0) {
                    idx = result;
                } else {
                    idx = -result - 1;
                }
                ans = Math.max(ans, i + 1 + idx);
            }
        }
        System.out.println(ans);
    }

    private static int upperBound(int n, long[] x, long y) {
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x[mid] <= y) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}