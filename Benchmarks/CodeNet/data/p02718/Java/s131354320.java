import java.util.Arrays;
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

        Arrays.sort(a);

        int ans = 0;
        double d = points / (4 * m);
        for (int i = 0; i < m; i++) {
            if (a[a.length - 1 - i] < d) {
                ans++;
            }
        }

        System.out.println(ans == 0 ? "Yes" : "No");
    }
}
