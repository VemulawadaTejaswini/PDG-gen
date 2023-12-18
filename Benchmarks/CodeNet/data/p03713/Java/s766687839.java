import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        System.out.println(Math.min(calc(H, W), calc(W, H)));
    }

    private static long calc(long x, long y) {
        long ans = Long.MAX_VALUE;
        for (int a = 1; a < x - 1; a++) {
            long b = (x - a) / 2;
            long c = x - a - b;
            long t = Math.max(Math.max(a, b), c) * y - Math.min(Math.min(a, b), c) * y;
            ans = Math.min(ans, t);
            b = y / 2;
            c = y - b;
            t = Math.max(Math.max(a * y, b * (x - a)), c * (x - a)) - Math.min(Math.min(b * (x - a), c * (x - a)), a * y);
            ans = Math.min(ans, t);
        }
        return ans;
    }
}
