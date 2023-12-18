import java.util.*;

public class Main {
    long MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        // from min
        int minIdx = 1;
        int maxIdx = n - 1;
        int left = a[0];
        int right = a[0];
        long ans = 0;
        while (minIdx <= maxIdx) {
            int tmpLmin = Math.abs(left - a[minIdx]);
            int tmpRmin = Math.abs(right - a[minIdx]);
            int tmpLmax = Math.abs(left - a[maxIdx]);
            int tmpRmax = Math.abs(right - a[maxIdx]);

            if (tmpLmin >= tmpRmin && tmpLmin >= tmpLmax && tmpLmin >= tmpRmax) {
                ans += Math.abs(left - a[minIdx]);
                left = a[minIdx++];
            } else if (tmpRmin >= tmpLmin && tmpRmin >= tmpLmax && tmpRmin >= tmpRmax) {
                ans += Math.abs(right - a[minIdx]);
                right = a[minIdx++];
            } else if (tmpLmax >= tmpLmin && tmpLmax >= tmpRmin && tmpLmax >= tmpRmax) {
                ans += Math.abs(left - a[maxIdx]);
                left = a[maxIdx--];
            } else if (tmpRmax >= tmpLmin && tmpRmax >= tmpRmin && tmpRmax >= tmpLmax) {
                ans += Math.abs(right - a[maxIdx]);
                right = a[maxIdx--];
            }
        }
        System.out.println(ans);

    }
}