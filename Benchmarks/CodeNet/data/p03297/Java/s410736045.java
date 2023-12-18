import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            if (a < b) {
                System.out.println("No");
            } else if (d < b) {
                System.out.println("No");
            } else if (b <= c) {
                System.out.println("Yes");
            } else if (d % b == 0) {
                System.out.println((a % b > c) ? "No" : "Yes");
            } else {
                long p = a % b;
                long del = d % b;
                long max = p + (del * ((b - p - 1) / del));
                System.out.println(max <= c ? "Yes" : "No");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
