import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void solve() {
        BigInteger a, b, c, l, r, cont;
        cont = new BigInteger("4");
        a = input.nextBigInteger();
        b = input.nextBigInteger();
        c = input.nextBigInteger();
        l = a.multiply(b);
        r = c.subtract(a);
        r = r.subtract(b);
        r = r.multiply(r);
        l = l.multiply(cont);
        if (l.compareTo(r) < 0) System.out.print("Yes");
        else
            System.out.print("No");
    }

    public static void main(String[] args) {
        int T = 1;
//        t = input.nextInt();
        for (int i = 0; i < T; ++i) {
            solve();
        }
        input.close();
    }
}