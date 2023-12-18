import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if (n == 1) {
            System.out.println(m);
            return;
        }

        long ans = 0;
        for (long i = 1; i * i <= m; i++) {
            if (m < n * i) {
                break;
            }
            if (m % i != 0) {
                continue;
            }
            ans = Math.max(ans, i);
        }
        System.out.println(ans);
    }
}
