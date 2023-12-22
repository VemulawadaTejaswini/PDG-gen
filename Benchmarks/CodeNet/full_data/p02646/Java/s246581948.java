import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();

        if (v<=w) {
            System.out.println("NO");
            return;
        }

        int dis = Math.abs(a-b);
        int diff = Math.abs(v-w);

        if (dis<=(long)diff*(long)t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
