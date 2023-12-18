import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int x = sc.nextInt();
        if (x == 7 || x == 5 || x == 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}