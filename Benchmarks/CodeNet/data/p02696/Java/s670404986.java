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
        long a = scan.nextLong(), b = scan.nextLong(), n = scan.nextLong();
        long x = Math.min(b - 1, n);
        System.out.println(a * x / b - a * (x / b));
    }
}