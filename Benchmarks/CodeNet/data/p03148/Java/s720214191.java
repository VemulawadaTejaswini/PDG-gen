import java.awt.Point;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), k = scanner.nextInt();
        Point[] s = IntStream.range(0, n)
                .mapToObj(i -> new Point(scanner.nextInt(), scanner.nextInt()))
                .sorted(Comparator.<Point>comparingInt(p -> p.y).reversed())
                .toArray(Point[]::new);
        Stack<Long> stack = new Stack<>();
        boolean[] used = new boolean[n + 1];
        long tSum = 0, dSum = 0, ans;
        for (int i = 0; i < k; i++) {
            if (used[s[i].x]) {
                stack.push((long)s[i].y);
            } else {
                used[s[i].x] = true;
                tSum++;
            }
            dSum += s[i].y;
        }
        ans = dSum + tSum * tSum;
        for (int i = k; i < n && !stack.empty(); i++) {
            if (!used[s[i].x]) {
                used[s[i].x] = true;
                tSum++;
                dSum += s[i].y - stack.pop();
                ans = Math.max(ans, dSum + tSum * tSum);
            }
        }
        System.out.println(ans);
    }
}