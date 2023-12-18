
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            final long a = sc.nextLong();
            final long b = sc.nextLong();
            final long c = sc.nextLong();
            final long d = sc.nextLong();
            final Set<Long> remains = new HashSet<>();
            long current = a;
            do {
                remains.add(current);
                current -= b;
                if (current < 0) {
                    System.out.println("No");
                    break;
                }
                if (current > c) {
                    current = (current - c) % b + c;
                }

                if (current <= c) {
                    final long slot = c - current;
                    if (d < slot) {
                        System.out.println("No");
                        current = -1;
                        break;
                    }
                    current += (d - slot) % b + slot;
                    if ((d - slot) / b >= 1) {
                        current += b;
                    }
                }
            } while (!remains.contains(current));

            if (current >= 0) {
                System.out.println("Yes");
            }
        }
    }
}
