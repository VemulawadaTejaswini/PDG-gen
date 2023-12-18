import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        Set<Integer>[] nodes = new Set[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = new HashSet<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            nodes[a].add(b);
            nodes[b].add(a);
        }

        int[] distance = dfs(N, nodes);

        Map<Integer, Deque<Integer>> candidates = new HashMap<>();
        candidates.put(0, new LinkedList<>());
        candidates.put(1, new LinkedList<>());
        candidates.put(2, new LinkedList<>());
        for (int i = 1; i <= N; i++) {
            candidates.get(i % 3).add(i);
        }
        Deque<Integer> zero_candidates = candidates.get(0);
        Deque<Integer> one_candidates = candidates.get(1);
        Deque<Integer> two_candidates = candidates.get(2);

        List<Integer> even_set = IntStream.range(0, N).filter(i -> distance[i] % 2 == 0).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toList());
        List<Integer> odd_set = IntStream.range(0, N).filter(i -> distance[i] % 2 == 1).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toList());
        long count_even = even_set.size();
        long count_odd = odd_set.size();

        int[] ans = new int[N];
        Arrays.fill(ans, -1);
        if (N / 3 < count_even && N / 3 < count_odd) {
            int j = 0;
            for (int x : even_set) {
                if (!one_candidates.isEmpty()) {
                    ans[x] = one_candidates.poll();
                    continue;
                }
                ans[x] = zero_candidates.poll();
            }
            for (int x : odd_set) {
                if (!two_candidates.isEmpty()) {
                    ans[x] = two_candidates.poll();
                    continue;
                }
                ans[x] = zero_candidates.poll();
            }
            print(N, ans);
            return;
        }
        if (count_even <= N / 3) {
            for (int x : even_set) {
                 ans[x] = zero_candidates.poll();
            }
            for (int x : odd_set) {
                if (!zero_candidates.isEmpty()) {
                    ans[x] = zero_candidates.poll();
                    continue;
                }
                if (!one_candidates.isEmpty()) {
                    ans[x] = one_candidates.poll();
                    continue;
                }
                ans[x] = two_candidates.poll();
            }
            print(N, ans);
            return;
        }
        for (int x : odd_set) {
            ans[x] = zero_candidates.poll();
        }
        for (int x : even_set) {
            if (!zero_candidates.isEmpty()) {
                ans[x] = zero_candidates.poll();
                continue;
            }
            if (!one_candidates.isEmpty()) {
                ans[x] = one_candidates.poll();
                continue;
            }
            ans[x] = two_candidates.poll();
        }
        print(N, ans);
    }
    private void print(int N, int[] ans) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]);
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
    private int[] dfs(int N, Set<Integer>[] nodes) {
        int[] distance = new int[N];
        Arrays.fill(distance, -1);
        distance[0] = 0;

        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            for (int next : nodes[current]) {
                if (distance[next] != -1) {
                    continue;
                }
                distance[next] = (distance[current] + 1) % 2;
                stack.add(next);
            }
        }
        return distance;
    }
}
