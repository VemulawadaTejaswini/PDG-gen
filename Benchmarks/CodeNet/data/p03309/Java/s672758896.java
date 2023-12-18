import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt() - i;
        }
        int b = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            b = Math.min(a[i], b);
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += (long) Math.abs(a[i] - b);
        }
        System.out.println(ans);
    }
}
