
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

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
        int max_degree = 0;
        int root = 0;
        for (int i = 0; i < N; i++) {
            if (max_degree < nodes[i].size()) {
                max_degree = nodes[i].size();
                root = i;
            }
        }
        Map<Integer, List<Integer>> three_map = new HashMap<>();
        three_map.put(0, new ArrayList<>());
        three_map.put(1, new ArrayList<>());
        three_map.put(2, new ArrayList<>());
        three_map.get(0).add(root);
        Set<Integer> unvisited = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (i != root) {
                unvisited.add(i);
            }
        }
        dfs(three_map, nodes, root, 0, unvisited);
        int mod_zero = three_map.get(0).size();
        int mod_one = three_map.get(1).size();
        int mod_two = three_map.get(2).size();

        Map<Integer, Deque<Integer>> candidates_map = new HashMap<>();
        candidates_map.put(0, new LinkedList<>());
        candidates_map.put(1, new LinkedList<>());
        candidates_map.put(2, new LinkedList<>());
        for (int i = 1; i <= N; i++) {
            candidates_map.get(i % 3).add(i);
        }
        HashSet<Integer> used = new HashSet<>();
        int[] ans = new int[N];
        Arrays.fill(ans, -1);
        if (1 < mod_zero) {
            List<Integer> list = three_map.get(0);
            Deque<Integer> mod_zero_candidates = candidates_map.get(0);
            for (int x : list) {
                if (mod_zero_candidates.isEmpty()) {
                    System.out.println(-1);
                    return;
                }
                ans[x] = mod_zero_candidates.poll();
                used.add(ans[x]);
            }
        }
        if (mod_one < mod_two) {
            Deque<Integer> mod_zero_candidates = candidates_map.get(0);
            Deque<Integer> mod_one_candidates = candidates_map.get(1);
            Deque<Integer> mod_two_candidates = candidates_map.get(2);
            for (int x : three_map.get(1)) {
                boolean found = false;
                int count = 0;
                for (int y : three_map.get(2)) {
                    if (nodes[x].contains(y)) {
                        continue;
                    }
                    found = true;
                    count += 1;
                }
                if (!found) {
                    continue;
                }
                if (0 < mod_zero_candidates.size()) {
                    ans[x] = mod_zero_candidates.poll();
                    used.add(ans[x]);
                    continue;
                }
                if (mod_one_candidates.size() * mod_two_candidates.size() == 0) {
                    System.out.println(-1);
                    return;
                }
                if (mod_one_candidates.size() < mod_two_candidates.size()) {
                    ans[x] = mod_one_candidates.poll();
                    used.add(ans[x]);
                    for (int y : three_map.get(2)) {
                        if (nodes[x].contains(y)) {
                            continue;
                        }
                        ans[y] = mod_two_candidates.poll();
                        used.add(ans[y]);
                    }
                } else {
                    ans[x] = mod_two_candidates.poll();
                    used.add(ans[x]);
                    for (int y : three_map.get(2)) {
                        if (nodes[x].contains(y)) {
                            continue;
                        }
                        ans[y] = mod_one_candidates.poll();
                        used.add(ans[y]);
                    }
                }
            }
        } else {
            Deque<Integer> mod_zero_candidates = candidates_map.get(0);
            Deque<Integer> mod_one_candidates = candidates_map.get(1);
            Deque<Integer> mod_two_candidates = candidates_map.get(2);
            for (int x : three_map.get(2)) {
                boolean found = false;
                int count = 0;
                for (int y : three_map.get(1)) {
                    if (nodes[x].contains(y)) {
                        continue;
                    }
                    found = true;
                    count += 1;
                }
                if (!found) {
                    continue;
                }
                if (0 < mod_zero_candidates.size()) {
                    ans[x] = mod_zero_candidates.poll();
                    used.add(ans[x]);
                    continue;
                }
                if (mod_one_candidates.size() * mod_two_candidates.size() == 0) {
                    System.out.println(-1);
                    return;
                }
                if (mod_one_candidates.size() < mod_two_candidates.size()) {
                    ans[x] = mod_one_candidates.poll();
                    used.add(ans[x]);
                    for (int y : three_map.get(2)) {
                        if (nodes[x].contains(y)) {
                            continue;
                        }
                        ans[y] = mod_two_candidates.poll();
                        used.add(ans[y]);
                    }
                } else {
                    ans[x] = mod_two_candidates.poll();
                    used.add(ans[x]);
                    for (int y : three_map.get(2)) {
                        if (nodes[x].contains(y)) {
                            continue;
                        }
                        ans[y] = mod_one_candidates.poll();
                        used.add(ans[y]);
                    }
                }
            }

        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) {
            if (used.contains(i)) {
                continue;
            }
            queue.add(i);
        }
        for (int i = 0; i < N; i++) {
            if (ans[i] == -1) {
                ans[i] = queue.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]);
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
    private void dfs(Map<Integer, List<Integer>> map, Set<Integer>[] nodes, int current, int distance, Set<Integer> unvisited) {
        if (unvisited.isEmpty()) {
            return;
        }
        Set<Integer> child = nodes[current];
        for (int next : child) {
            if (!unvisited.contains(next)) {
                continue;
            }
            unvisited.remove(next);
            map.get((distance+1)%3).add(next);
            dfs(map, nodes, next, distance + 1, unvisited);
            unvisited.add(next);
        }
    }
}
