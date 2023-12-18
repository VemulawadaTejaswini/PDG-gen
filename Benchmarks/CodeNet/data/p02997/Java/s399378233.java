import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int max = (n - 1) * (n - 2) / 2;
        int min = (n - 2);
        if (k > max || k < min) {
            System.out.println("-1");
            System.exit(0);
        }

        if (k == max) {
            System.out.println(n - 1);
            int center = 1;
            for (int i = 2; i <= n; i++) {
                System.out.println("1 " + i);
            }
        } else if (k == min) {
            System.out.println(n - 1);
            for (int i = 1; i < n; i++) {
                System.out.println(i + " " + (i + 1));
            }
        } else {
            System.out.println(n);
            if (k - min == 1) {
                // 四角つくる
                for (int i = 1; i < 4; i++) {
                    System.out.println(i + " " + (i + 1));
                }
                System.out.println("4 1");

                for (int i = 4; i < n; i++) {
                    System.out.println(i + " " + (i + 1));
                }
            } else {
                for (int i = 1; i < n; i++) {
                    System.out.println(i + " " + (i + 1));
                }
                System.out.println("1 " + n);
            }
        }

    }
    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
