import java.util.Scanner;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        long prev = x;
        int count = 1;
        while (prev * 2 <= y) {
            count++;
            prev *= 2;
        }
        System.out.println(count);
    }
}
