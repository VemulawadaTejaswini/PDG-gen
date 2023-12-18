import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int x = x2 - x1;
        int y = y2 - y1;
        print(x2 - y, y2 + x, x2 - y - x, y2 + x - y);
    }

    private void print(int a, int b, int c, int d) {
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}