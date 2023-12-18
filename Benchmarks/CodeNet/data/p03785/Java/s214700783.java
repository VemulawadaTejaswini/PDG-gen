import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), c = scanner.nextInt(), k = scanner.nextInt(), ans = 0;
        Queue<Integer> t = IntStream.range(0, n).map(i -> scanner.nextInt()).sorted().boxed().collect(Collectors.toCollection(ArrayDeque::new));
        while (!t.isEmpty()) {
            for (int i = 1, f = t.poll() + k; i < c && !t.isEmpty() && t.peek() <= f; i++)
                t.remove();
            ans++;
        }
        System.out.println(ans);
    }
}