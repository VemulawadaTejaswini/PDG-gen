import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        long b = sc.nextLong();
        long n = sc.nextLong();

        if (b == 1) {
            System.out.println(0);
        } else {
            if (b > n) {
                System.out.println((long) ((double) a / (double) b * n) - (long) ((double) 1 / (double) b * n) * a);
            } else if (b == n) {
                System.out.println(
                        ((long) ((double) a / (double) b * (n - 1))) - (long) ((double) 1 / (double) b * (n - 1)) * a);
            } else { /* b<n */
                if (n % b == 0) {
                    System.out.println(((long) ((double) a / (double) b * (n - 1)))
                            - (long) ((double) 1 / (double) b * (n - 1)) * a);
                } else {
                    System.out.println((long) ((double) a / (double) b * n) - (long) ((double) 1 / (double) b * n) * a);
                }
            }
        }
        sc.close();
    }
}