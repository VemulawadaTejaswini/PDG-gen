import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long x = sc.nextLong();
        long y = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long xc = (x % c == 0) ? x / c : x / c + 1;
        long yc = y / c;
        long xd = (x % d == 0) ? x / d : x / d + 1;
        long yd = y / d;

        long lcm = lcm(c, d);

        long comx = (x % lcm == 0) ? x / lcm : x / lcm + 1;
        long comy = y / lcm;

//        System.out.println(xc);
//        System.out.println(yc);
//        System.out.println(xd);
//        System.out.println(yd);
//        System.out.println(lcm);
//        System.out.println(comx);
//        System.out.println(comy);

        System.out.println(y - x + 1 - ((yc - xc + 1) + (yd - xd + 1) - (comy - comx + 1)));


    }

    long lcm(long c, long d) {
        return c * d / gcd(c, d);
    }

    long gcd(long c, long d) {
        if (c < d) return gcd(d, c);
        if (d == 0) return c;
        return gcd(d, c % d);
    }

}
