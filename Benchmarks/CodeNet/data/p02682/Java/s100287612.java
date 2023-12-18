import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int ans = 0;

        if (a >= k) {
                ans = k;
            } else {
                ans += a;
                k -= a;
                if (b >= k) {
                    k = 0;
                } else {
                    k -= b;
                    ans -= k;
                    }
            }
        System.out.println(ans);
        }
}

