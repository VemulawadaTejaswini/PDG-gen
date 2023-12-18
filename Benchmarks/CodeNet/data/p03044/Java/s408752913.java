import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int N = std.nextInt();

        List<List<Integer>> to = new ArrayList<>(N);
        List<List<Integer>> cost = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            to.add(new ArrayList<>());
            cost.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            int a = std.nextInt();
            int b = std.nextInt();
            int w = std.nextInt();
            a--;
            b--;

            to.get(a).add(b);
            to.get(b).add(a);
            cost.get(a).add(w);
            cost.get(b).add(w);
        }

        int[] ans = new int[N];
        Deque<Integer> deque = new ArrayDeque<>();
        Arrays.fill(ans, - 1);
        ans[0] = 0;
        deque.add(0);
        while (!deque.isEmpty()) {
            int v = deque.pollFirst();
            for (int i = 0; i < to.get(v).size(); i++) {
                int u = to.get(v).get(i);
                int w = cost.get(v).get(i);
                if (ans[u] != -1) {
                    continue;
                }

                ans[u] = (ans[v] + w) % 2;
                deque.add(u);
            }
        }

        Arrays.stream(ans).map(Math::abs).forEach(System.out::println);
    }
}
