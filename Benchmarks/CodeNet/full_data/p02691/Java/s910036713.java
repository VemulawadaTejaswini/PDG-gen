import java.util.Scanner;
import java.util.HashMap;

public class Main {
    private static final int MAXN = 2 * (int)10e5, MAXA = (int)10e9;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var n = scanner.nextInt();
        var dif = new HashMap<Long, Long>();
        var a = new int[n];

        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
            long key = i - a[i] + MAXA;
            if (!dif.containsKey(key)) {
                dif.put(key, 1L);
            } else {
                dif.put(key, dif.get(key) + 1L);
            }
        }

        Long count = 0L;
        for (int i = 0; i < n; ++i) {
            long key = i + a[i] + MAXA;
            if (dif.containsKey(key)) {
                count += dif.get(key);
            }
        }
        System.out.println(count);
    }
}
