import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private List<Set<Integer>> children;
    private Map<Tuple, Set<Integer>> cache = new HashMap<>();

    private Set<Integer> f(int current, int count) {
        if (count == 3) {
            Set<Integer> set = new HashSet<>();
            set.add(current);
            return set;
        }

        Tuple key = new Tuple(current, count);
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        Set<Integer> set = new HashSet<>();
        for (Integer child : children.get(current)) {
            set.addAll(f(child, count + 1));
        }

        cache.put(key, set);
        return set;
    }

    public void solve(BufferedReader stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        Pattern space = Pattern.compile(" ");
        int[] first = space.splitAsStream(stdin.readLine()).mapToInt(Integer::parseInt).toArray();
        int n = first[0];
        int m = first[1];

        children = IntStream.range(0, n).mapToObj(unused -> new HashSet<Integer>()).collect(Collectors.toList());
        for (int i = 0; i < m; i++) {
            int[] line = space.splitAsStream(stdin.readLine()).mapToInt(Integer::parseInt).toArray();
            int u = line[0] - 1;
            int v = line[1] - 1;
            children.get(u).add(v);
        }

        int[] last = space.splitAsStream(stdin.readLine()).mapToInt(Integer::parseInt).toArray();
        int s = last[0] - 1;
        int t = last[1] - 1;

        List<Set<Integer>> nexts = IntStream.range(0, n).mapToObj(current -> f(current, 0)).collect(Collectors.toList());

        Deque<Integer> q = new ArrayDeque<>();
        int[] cost = new int[n];
        Arrays.fill(cost, Integer.MAX_VALUE);
        q.add(s);
        cost[s] = 0;
        while (!q.isEmpty()) {
            int current = q.pollFirst();
            for (int next : nexts.get(current)) {
                if (cost[current] + 1 < cost[next]) {
                    cost[next] = cost[current] + 1;
                    q.add(next);
                }
            }
        }

        if (cost[t] == Integer.MAX_VALUE) {
            stdout.println(-1);
        } else {
            stdout.println(cost[t]);
        }
    }

    private static class Tuple {
        private int current;
        private int count;

        public Tuple(int current, int count) {
            this.current = current;
            this.count = count;
        }

        @Override
        public int hashCode() {
            return Objects.hash(current, count);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Tuple)) {
                return false;
            }

            Tuple other = (Tuple) obj;
            return this.current == other.current && this.count == other.count;
        }
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }
}
