
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            String xs = sc.next();
            String us = sc.next();

            if (us.equals("JPY")) {
                sum += Long.parseLong(xs);
            } else {
                sum += 380000.0 * Double.parseDouble(xs);
            }
        }
        System.out.println(String.format("%.9f", sum));

    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
