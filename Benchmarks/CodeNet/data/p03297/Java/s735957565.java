
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            final long a = sc.nextLong();
            final long b = sc.nextLong();
            final long c = sc.nextLong();
            final long d = sc.nextLong();
            if (a < b) {
                System.out.println("No");
                continue;
            }
            if (d < b) {
                System.out.println("No");
                continue;
            }
            if (c >= b) {
                System.out.println("Yes");
                continue;
            }

            long from = (a - b - c) % b + c;
            final long add = d % b;
            if (add != 0) {
                long m = (c - from) / add;
                from += (m + 1) * add;
            }
            if (add == 0 && from <= c) {
                from += d;
            }
            if (from >= b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }