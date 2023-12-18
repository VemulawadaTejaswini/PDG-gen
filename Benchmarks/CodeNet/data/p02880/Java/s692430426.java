
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isNG = true;
        for (int i = 1; i < 10; i++) {
            if (n % i == 0 && n / i < 10) {
                isNG = false;
                break;
            }
        }
        // write your code
        System.out.println(isNG ? "No" : "Yes");
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
