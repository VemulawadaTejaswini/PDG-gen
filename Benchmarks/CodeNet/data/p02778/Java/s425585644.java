import java.util.Scanner;


// 137_b
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String k = scan.next();

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < k.length(); i++) {
            sb.append("x");
        }

        out(sb.toString());

    }

    /*
     * 以下メソッド集
     */

    static long gcd(long a, long b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    static int gcd(int a, int b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    static void out(String info) {

        System.out.println(info);
    }

    static void out(int info) {

        System.out.println(info);
    }

    static void out(double info) {

        System.out.println(info);
    }

    static void out(long info) {

        System.out.println(info);
    }

}
