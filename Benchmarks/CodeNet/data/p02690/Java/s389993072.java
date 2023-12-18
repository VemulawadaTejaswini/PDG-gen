import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        sc.close();

        int a = 0;
        long d = 1000000000;
        while (true) {
            long A = (long) Math.pow(a, 5);
            if (Math.abs(A - x) < d) {
                d = Math.abs(A - x);
                a++;
            } else {
                a--;
                break;
            }
        }
        int b = 0;
        if (d != 0) {
            while (true) {
                long B = (long) Math.pow(b, 5);
                if (d != B) {
                    b++;
                } else {
                    break;
                }
            }
        }
        long A = (long) Math.pow(a, 5);
        if (A - x > 0 && b != 0) {
            System.out.println(a + " " + (-b));
        } else {
            System.out.println(a + " " + b);
        }
    }
}
