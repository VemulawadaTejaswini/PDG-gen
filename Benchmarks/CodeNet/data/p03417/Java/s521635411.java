import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        long n = sc.nextInt(), m = sc.nextInt();

        if (n > 2 && m > 2) {
            System.out.println(n * m - 2 * n - 2 * m + 4);
        } else if (n >= 2 && m == 2 || n == 2 && m >= 2) {
            System.out.println(0);
        } else if (n == 1 && m >= 2) {
            System.out.println(m - 2);
        } else if (n >= 2 && m == 1) {
            System.out.println(n - 2);
        } else if (n == 1 && m == 1) {
            System.out.println(1);
        } else {
            System.out.println("A");
        }
    }
}