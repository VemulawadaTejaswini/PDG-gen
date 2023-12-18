import java.util.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
        long ans = 100000000000L;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                String a = String.valueOf(i);
                String b = String.valueOf(n / i);
                ans = Math.max(a.length(), b.length());
            }
        }
        out.println(ans);
    }
}
