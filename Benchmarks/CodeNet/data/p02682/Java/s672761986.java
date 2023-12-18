import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), k = sc.nextLong();
        long ans = 0;
        if (k > a) {
            ans += a;
            k -= a;
        }
        else {
            ans += k;
            k = 0;
        }
        if (k > b) {
            k -= b;
        }
        else {
            k = 0;
        }
        if (k > c) {
            ans -= c;
            k -= c;
        }
        else {
            ans -= k;
            k = 0;
        }
        System.out.println(ans);
    }
}
