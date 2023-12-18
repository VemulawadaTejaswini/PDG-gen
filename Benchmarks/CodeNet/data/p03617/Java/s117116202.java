import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextLong();
        long h = sc.nextLong();
        long s = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        long ans;
        long m;
        if (q < h / 2) {
            m = q * 4;
        } else {
            m = h * 2;
        }
        if (m > s) {
            m = s;
        }
        if (d > m * 2) {
            d = m;
        } else {
            d = d / 2;
        }
        if (n % 2 == 0) {
            ans = n * d;
        } else {
            ans = (n - 1) * d + m;
        }
        System.out.println(ans);
    }
}
