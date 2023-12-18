import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final double n = (double)sc.nextInt();
        final double m = (double)sc.nextInt();
        final double d = (double)sc.nextInt();

        // n = 4, m = 2, d = 0
        // (1,1),(1,2),(1,3),(1,4),(2,1),(2,2),(2,3),(2,4),(3,1),(3,2),(3,3),(3,4),(4,1),(4,2),(4,3),(4,4)
        // d = 0 (1,1),(2,2),(3,3),(4,4)
        // d = 1 (1,2),(2,1),(2,3),(3,2),(3,4),(4,3)
        // d = 2 (1,3),(2,4),(3,1),(4,2)
        // d = 3 (1,4),(4,1)

        double cn, cm, ret;
        if (d == 0) {
            cn = n;
        } else {
            cn = 2 * (n - d);
        }
        cm = m - 1;

        ret = cm * cn / (n * n);
        System.out.println(ret);
    }
}