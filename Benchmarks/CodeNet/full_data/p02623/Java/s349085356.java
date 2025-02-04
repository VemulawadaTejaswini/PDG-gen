
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        long[] sumA = new long[n + 1];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            sumA[i + 1] += sumA[i] + a[i];
        }
        int[] b = new int[m];
        long[] sumB = new long[m + 1];
        for (int i = 0 ; i < m ; i++) {
            b[i] = sc.nextInt();
            sumB[i + 1] += sumB[i] + b[i];
        }
        int c = 0;
        for (int i = 1 ; i <= n ; i++) {
            int temp = 0;
            if (sumA[i] <= k) {
                temp += i;
                temp += binarySearch(sumB, (long)k - sumA[i]) - 1;
            }
            c = Math.max(c, temp);
        }
        System.out.println(c);
    }

    static int binarySearch(long[] a, long m) {
        int ng = -1;
        int ok = a.length;
        while (ok - ng > 1) {
            int mid = (ok + ng) / 2;
            if (isOk(a, m, mid)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    static boolean isOk(long[] a, long m, int key) {
        return a[key] > m;
    }

}