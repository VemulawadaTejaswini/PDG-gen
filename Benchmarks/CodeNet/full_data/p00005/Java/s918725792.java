
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = in.readLine();
            if (s == null || s.length() < 1) {
                break;
            }
            f(s);
        }
        /*/
        f("8 6");
        f("50000000 30000000");
        //*/
    }

    public static void f(String s) {
        String[] sp = s.split(" ");
        BigInteger a = BigInteger.valueOf(Integer.parseInt(sp[0]));
        BigInteger b = BigInteger.valueOf(Integer.parseInt(sp[1]));
        if (a.compareTo(b) == -1) {
            BigInteger temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a.gcd(b) + " " + lcm(a, b));
    }

    public static BigInteger lcm(BigInteger m, BigInteger n) {
        final BigInteger gcd = m.gcd(n);
        if (gcd.compareTo(BigInteger.ZERO) == 0) {
            return BigInteger.ZERO;
        }
        return m.multiply(n).divide(gcd);
    }
}