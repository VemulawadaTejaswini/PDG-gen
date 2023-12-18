import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        // only use
        if (2 * c  <  Math.min(a, b)) {
            System.out.println(Math.max(x, y) * 2 * c );
            return;
        }
        // not use
        if (a + b < 2 * c ) {
            System.out.println(x * a + b * y);
            return ;
        }
        int val;
        if (a < b) {
            int newX = x - y;
             val = newX * a + y * 2 * c;
        } else {
            int newY = y - x;
             val = newY * b + x * 2 * c;
        }
        System.out.println(val);

    }
}