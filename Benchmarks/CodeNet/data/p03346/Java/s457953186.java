
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final int[] indices = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            final int p = scanner.nextInt();
            indices[p] = i;
        }

        int count = 0;
        int max = 0;
        int previous = 0;
        for (int i = 1; i <= n; i++) {
            if (indices[i] > previous) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
            previous = indices[i];
        }
        System.out.println(n - max);
    }
}
