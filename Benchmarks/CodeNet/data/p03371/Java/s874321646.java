import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt() * 2;
        int x = sc.nextInt();
        int y = sc.nextInt();

        long ans = 0;

        if (c < a + b) {
            if (c < a && c < b) {
                ans += c * Math.max(x, y);
                x = 0;
                y = 0;
            } else if (a > b) {
                ans += c * x;
                y -= x;
                x = 0;
            } else {
                ans += c * y;
                x -= y;
                y = 0;
            }
        }

        if (x > 0) {
            ans += a * x;
        }
        if (y > 0) {
            ans += b * y;
        }

        System.out.println(ans);
    }
}