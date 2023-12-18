import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        long sum = 0;
        long sumAbs = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt() - i;
            sum += (long) a[i];
            sumAbs += (long) Math.abs(a[i]);
        }
        long newSum = sumAbs, prev = sumAbs;
        int b = 0;
        if (sum > 0) {
            while (newSum <= prev) {
                prev = newSum;
                newSum = 0;
                b++;
                for (int i = 1; i <= n; i++) {
                    newSum += Math.abs(a[i] - b);
                }
            }
        } else if (sum < 0) {
            while (newSum <= Math.abs(prev)) {
                prev = newSum;
                newSum = 0;
                b++;
                for (int i = 1; i <= n; i++) {
                    newSum += Math.abs(a[i] + b);
                }
            }
        }
        System.out.println(prev);
    }
}
