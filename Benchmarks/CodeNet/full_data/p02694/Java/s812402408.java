import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main m = new Main();
        m.resolve(scan);
        scan.close();
    }

    final private void resolve(Scanner scan) {
        double x = scan.nextDouble();
        long tmp = 100;
        long cnt = 0;
        while (tmp < x) {
            cnt++;
            tmp = (long) (tmp + tmp * 0.01);
        }
        System.out.println(cnt);
    }
}