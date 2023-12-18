import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        Integer[] as = new Integer[n];
        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
        }

        Arrays.sort(as);

        for (int i = 0; i < m; i++) {
            int b = std.nextInt();
            int c = std.nextInt();
            int index = ~Arrays.binarySearch(as, c, (x, y) -> x.compareTo(y) > 0 ? 1:-1) - 1;
            if (index < 0) {
                index = 0;
            }
            int range = Math.min(index, b);
            for (int j = 0; j < range; j++) {
                as[j] = c;
            }

            Arrays.sort(as);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += as[i];
        }

        System.out.println(ans);
    }
}
