import java.util.Scanner;


// 152_b
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String aa = "";
        String bb = "";
        for (int i = 0; i < b; i++) {
            aa += a;
        }

        for (int i = 0; i < a; i++) {
            bb += b;
        }

        if (aa.compareTo(bb) < 0) {
            out(aa);
        } else {
            out(bb);
        }

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
