import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        long tmp = a;
        a -= k;
        if (a < 0) {
            a = 0;
        }
        k -= tmp;

        if (k >= 1) {
            b -= k;
            if (b < 0) {
                b = 0;
            }
        }
        System.out.println(String.format("%s %s", a, b));
        sc.close();
    }
}
