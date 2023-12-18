
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] children = new int[n];
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            children[i] = scanner.nextInt();
        }

        Arrays.sort(children);
        int i;
        for (i = 0; i < n; i++) {
            if (children[i] > x) {
                i--;
                break;
            }

            x -= children[i];
        }

        System.out.println(i);
    }
}
