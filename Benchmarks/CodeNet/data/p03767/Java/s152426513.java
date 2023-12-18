import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static int n = scanner.nextInt();
    static int[] a = IntStream.range(0, 3 * n).map(i -> scanner.nextInt()).sorted().skip(n).toArray();
    public static void main(String[]$) {
        System.out.println(dfs(0, 0, 0));
    }

    static long dfs(int d, int c, long sum) {
        if (d == 2 * n)
            return sum;
        long r = -1;
        if (c < n)
            r = dfs(d + 1, c + 1, sum + a[d]);
        if (d < c * 2)
            r = Math.max(r, dfs(d + 1, c, sum));
        return r;
    }
}