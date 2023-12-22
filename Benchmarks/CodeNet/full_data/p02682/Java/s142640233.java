import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long k = scanner.nextLong();

        long sum = 0;

        long calc = k;
        if (calc < a) {
            System.out.println(calc);
            System.exit(0);
        } else {
            sum += a;
            calc = calc - a;
        }
        if (calc <= 0) {
            System.out.println(sum);
            System.exit(0);
        }

        if (calc < b) {
            System.out.println(sum);
            System.exit(0);
        } else {
            calc = calc - b;
        }
        if (calc <= 0) {
            System.out.println(sum);
            System.exit(0);
        }

        if (calc < c) {
            System.out.print(sum - calc);
            System.exit(0);
        } else {
            System.out.println(sum - c);
            System.exit(0);
        }
    }
}