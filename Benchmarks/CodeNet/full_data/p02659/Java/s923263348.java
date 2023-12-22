import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        double B = scanner.nextDouble();

        double ans = A * B;

        System.out.println((long)Math.floor(ans));
    }
}
