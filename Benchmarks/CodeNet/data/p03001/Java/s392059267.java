import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Long w = kbd.nextLong();
        Long h = kbd.nextLong();
        Long x = kbd.nextLong();
        Long y = kbd.nextLong();
        long a1 = 0;
        long a2 = 0;
        if (y >= (double) 1.0 * h / 2) {
            a1 = w * (h - y);
        } else {
            a1 = w * y;
        }

        if (x >= (double) 1.0 * w / 2) {
            a2 = h * (w - x);
        } else {
            a2 = h * x;
        }

        if (a1 == a2) {
            System.out.println(a1 + " 1");
        } else if (a1 > a2) {
            System.out.println(a1 + " 0");
        } else if (a2 > a1) {
            System.out.println(a2 + " 0");
        }
    }
}