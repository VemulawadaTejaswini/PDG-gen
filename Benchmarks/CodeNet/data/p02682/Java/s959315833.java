import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int count = 0;
        if (k - a > 0) {
            count += a;
        } else {
            count += k;
        }
        k -= a;
        if (k > 0) {
            k -= b;
        }
        if (k > 0) {
            if (k - c > 0) {
                count -= c;
            } else {
                count -= k;
            }
        }
        System.out.println(count);
    }
}
