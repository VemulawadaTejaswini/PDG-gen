import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int x = sc.nextInt(), y = sc.nextInt();
        long cost = 0;
        if (a + b >= c * 2) {
            cost += c * 2 * Math.min(x, y);
            int min = Math.min(x, y);
            x -= min;
            y -= min;
            if (x > 0) {
                if (a < c * 2) {
                    cost += a * x;
                } else {
                    cost += (c * 2) * x;
                }
            } else {
                if (b < c * 2) {
                    cost += b * y;
                } else {
                    cost += (c * 2) * y;
                }
            }
        } else {
            cost += a * x + b * y;
        }
        System.out.println(cost);
    }
}
