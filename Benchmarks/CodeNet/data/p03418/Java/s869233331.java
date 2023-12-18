import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), k = sc.nextInt();
        long count = 0L;
        if (k == 0) {
            System.out.println(((long) n * n));
            return;
        }
        for (int b = 1; b <= n; b++) {
            int rep = n / b;
            int repK = rep * Math.max(b - k, 0);
            int mod = n % b;
            int modK = Math.max(mod - k + 1, 0);
            count += ((long) repK + modK);
        }
        System.out.println(count);
    }
}