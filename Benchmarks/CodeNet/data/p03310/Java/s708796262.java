import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        //累積和
        long[] b = new long[n];
        long c = 0;
        for (int i = 0 ; i < n ; i++) {
            c += (long) a[i];
            b[i] = c;
        }
        int l = 0;
        int r = 2;
        long ans = Long.MAX_VALUE;
        for (int i = 1 ; i < n - 2 ; i++) {
            long diffLeft = Math.abs(b[i] - b[l] - b[l]);
            while (l < i && diffLeft > Math.abs(b[i] - b[l + 1] - b[l + 1])) {
                l++;
            }
            long diffRight = Math.abs(b[r] - b[i] - (b[n - 1] - b[r]));
            while (r + 1 < n && diffRight > Math.abs(b[r + 1] - b[i] - (b[n - 1] - b[r + 1]))) {
                r++;
            }
            long p = b[l];
            long q = b[i] - b[l];
            long x = b[r] - b[i];
            long y = b[n - 1] - b[r];
            long max = Math.max(Math.max(p, q), Math.max(x, y));
            long min = Math.min(Math.min(p, q), Math.min(x, y));
            ans = Math.min(ans, Math.abs(max - min));
        }

        System.out.println(ans);

    }

}
