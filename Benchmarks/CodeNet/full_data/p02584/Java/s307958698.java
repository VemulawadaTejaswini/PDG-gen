import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int k = scan.nextInt();
        int d = scan.nextInt();

        int a = Math.abs(x) / d;
        int b = Math.abs(x) % d;

        if (b > Math.abs(b- d)) {

            a += 1;
            b = Math.abs(b- d);
        }

        if (k * d > Math.abs(x)) {

            if ((k - a) % 2 == 0 ) {
                System.out.println(b);
            } else {
                System.out.println(Math.abs(b- d));
            }

        } else {
            System.out.println(Math.abs(x) - k*d);
        }
    }
}