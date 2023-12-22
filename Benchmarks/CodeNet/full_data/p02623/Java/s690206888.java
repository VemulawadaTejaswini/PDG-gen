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
        for (int i = n - 1; i >= 0; i--) {
            if (k - a[i] >= 0) {
                start = i;
                break;
            }
        }
        int ans = 0;
        for (int i = start; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (k - a[i] - b[j] >= 0) {
                    ans = Math.max(ans, i + j + 2);
                }
            }
        }
        System.out.println(ans);
    }
}