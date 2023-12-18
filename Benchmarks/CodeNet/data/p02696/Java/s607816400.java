import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        sc.close();

        long ans = 0;
        for (long x = n; x > 0; x--) {
            long y = (long) (Math.floor(a * x / ((double)b)) - (double)a * Math.floor(x / ((double)b)));
            if (y >= ans) {
                ans = y;
                break;
            }
        }

        System.out.println(ans);
    }
}
