import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), t = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int tt = sc.nextInt();
            if (tt <= t) {
                min = Math.min(c, min);
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("TLE");
        } else {
            System.out.println(min);
        }
    }
}