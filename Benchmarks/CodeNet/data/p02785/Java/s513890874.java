import java.util.Arrays;
import java.util.Scanner;


// 137_b
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] h = new long[n];
        // ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // al.add(sc.nextInt());
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        for (int i = 0; i < k; i++) {
            if (!(n - 1 - i < 0)) {
                h[n - 1 - i] = 0;
            }
        }
        long count = 0l;
        for (int i = 0; i < n; i++) {
            count += h[i];
        }

        out(count);

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
