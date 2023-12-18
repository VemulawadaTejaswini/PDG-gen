import java.net.SocketPermission;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), A = in.nextInt(), B = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }

        int lo = 0, hi = (int)(1e9 + 10);
        while (hi - lo > 1) {
            int mid = (lo + hi) / 2;
            if (can(h, A, B, mid))
                hi = mid;
            else
                lo = mid;
        }
        System.out.println(hi);
    }

    private static boolean can(int[] hs, long A, long B, long times) {
        long rest = times;
        for (int h : hs) {
            long x = Math.max(0, h - B * times);
            rest -= (x + A - B - 1) / (A - B);
        }
        return rest >= 0;        
    }
}
