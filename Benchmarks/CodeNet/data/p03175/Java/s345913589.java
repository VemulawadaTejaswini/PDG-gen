import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Map<Integer, List<Integer>> edges = new HashMap<>();

        for (int i = 0; i < count - 1; ++i) {
            String[] parts = reader.readLine().split(" ");
            int from = Integer.parseInt(parts[0]) - 1;
            int to = Integer.parseInt(parts[1]) - 1;
            edges.computeIfAbsent(from, ArrayList::new).add(to);
            edges.computeIfAbsent(to, ArrayList::new).add(from);
        }

        if (count == 1) {
            System.out.println(2);
            return;
        }

        List<Integer> sorted = sortBfs(0, edges);
        int root = sorted.get(sorted.size() - 1);
        sorted = sortBfs(root, edges);
        Collections.reverse(sorted);

        long[] countWhite = new long[count];
        long[] countBlack = new long[count];

        for (int i : sorted) {
            countWhite[i] = 1;
            countBlack[i] = 1;
            for (int n : edges.get(i)) {
                if (countWhite[n] > 0) {
                    countWhite[i] = countWhite[i] * (countBlack[n] + countWhite[n]) % 1000000007;
                    countBlack[i] = countBlack[i] * countWhite[n] % 1000000007;
                }
            }
        }

        System.out.println((countWhite[root] + countBlack[root]) % 1000000007);
    }

    public static List<Integer> sortBfs(int start, Map<Integer, List<Integer>> edges) {
        Set<Integer> seen = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();

        queue.add(start);
        seen.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            res.add(current);
            for (int n : edges.get(current)) {
                if (!seen.contains(n)) {
                    queue.add(n);
                    seen.add(n);
                }
            }
        }

        return res;
    }
}