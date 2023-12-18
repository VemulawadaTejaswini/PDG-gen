
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            final int s = scanner.nextInt();
            final int c = scanner.nextInt();
            if (s > n || map.get(s) != null && map.get(s) != c || s == 1 && c == 0) {
                System.out.println(-1);
                return;
            }
            map.put(s, c);
        }

        final Integer first = map.get(1);
        System.out.print(first == null ? 1 : first);
        for (int i = 2; i <= n; i++) {
            final Integer tmp = map.get(i);
            System.out.print(tmp == null ? 0 : tmp);
        }
        System.out.println();
    }
}
