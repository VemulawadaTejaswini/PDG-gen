import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        sc.close();

        int a = 0;
        long d = 1000000000;
        boolean flag = false;
        while (true) {
            long A = (long) Math.pow(a, 5);
            if (x > A) {
                if (x - A < d) {
                    d = x - A;
                } else {
                    a--;
                    break;
                }
            } else {
                if (A - x < d) {
                    d = A - x;
                } else {
                    a--;
                    break;
                }
            }
            a++;
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
        System.out.println(a + " " + (-b));
    }
}
