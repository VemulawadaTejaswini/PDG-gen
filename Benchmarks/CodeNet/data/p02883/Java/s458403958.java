import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int f[] = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(f);

        long max = a[n - 1] * (long) f[n - 1];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i] * f[n - 1 - i];
        }
        ans = nibutan(a, f, 0, max, k);
        if (ans != 0) {
            // ans++;
        }
        System.out.println(ans);

        sc.close();
    }

    // l , r , m => answer
    static long nibutan(int arr[], int frr[], long l, long r, long rem) {
        long m = (l + r) / 2;
        // System.out.println(m);
        int len = arr.length;
        long wa = 0;
        if (m == l) {
            if (m == 0) {
                return 0;
            }
            return r;
        }
        for (int i = 0; i < len; i++) {
            long tmp = m / frr[len - 1 - i];
            if (arr[i] - tmp > 0) {
                wa += arr[i] - tmp;
            }
        }
        if (wa > rem) {
            return nibutan(arr, frr, m, r, rem);
        } else {
            return nibutan(arr, frr, l, m, rem);
        }
    }
}
