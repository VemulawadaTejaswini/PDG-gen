import java.util.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        if(C >= D) {
            long tmp = C;
            D = C;
            C = tmp;
        }

        long l = lcm(D,C);
        long val1 = B - B/C - B/D + B/l;
        long val2 = (A-1) - (A-1)/C - (A-1)/D + (A-1)/l;
        System.out.println(val1-val2);
        sc.close();
    }

    //b < a
    static long gcd(long a, long b) {
        if(b == 0) return a;
        else return gcd(b,a%b);
    }

    //b < a
    static long lcm(long a, long b) {
        return a*b/gcd(a,b);
    }
}