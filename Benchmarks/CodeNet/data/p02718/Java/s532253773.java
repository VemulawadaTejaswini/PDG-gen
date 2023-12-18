import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int m = sc.nextInt();

        final int[] a = new int[n];
        int points = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            points += a[i];
        }

        int ans = 0;
        double d = points / (4 * m);
        for (int i = 0; i < n; i++) {
            if (a[i] >= d) {
                ans++;
            }
            if (ans >= m) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
