import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextLong();
        }
        Arrays.sort(h);
        long[] hh = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            hh[i] = h[i + 1] - h[i];
        }
        Arrays.sort(hh);
        long ans = 0;
        for (int i = 0; i < k - 1; i++) {
            ans += hh[i];
        }
        System.out.println(ans);
    }
}