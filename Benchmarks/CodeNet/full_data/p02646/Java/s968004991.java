import java.util.*;
import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();

        if (w >= v) {
            System.out.println("NO");
            return;
        }

        if ((a-b) % (v-w) == 0 &&  (a-b) / (v-w) <= t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
