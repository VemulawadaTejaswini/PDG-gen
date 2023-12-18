import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = Long.parseLong(sc.next());
        }
        long ans = Long.MAX_VALUE;
        Arrays.sort(h);
        for (int i = 0; i <= n - k; i++) {
            ans = Math.min(ans, h[k - 1 + i] - h[i]);
        }
        System.out.println(ans);
    }
}