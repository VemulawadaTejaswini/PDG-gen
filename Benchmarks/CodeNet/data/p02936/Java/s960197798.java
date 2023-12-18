import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            List<Integer> l1 = map.getOrDefault(a, new ArrayList<>());
            l1.add(b);
            map.put(a, l1);
            List<Integer> l2 = map.getOrDefault(b, new ArrayList<>());
            l2.add(a);
            map.put(b, l2);
        }

        int[] p = new int[N + 1];
        for (int i = 0; i < Q; i++) {
            int v = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            p[v] += x;
        }

        int[] t = new int[N + 1];
        int parent = 1;
        t[parent] = p[parent];
        Deque<Data> dq = new ArrayDeque<>();
        Data d = new Data();
        d.parent = parent;
        d.children = map.get(parent);
        dq.addLast(d);

        Set<Integer> visited = new HashSet<>();
        visited.add(parent);
        while (!dq.isEmpty()) {
            Data data = dq.pollFirst();
            for (int i : data.children) {
                if (visited.contains(i)) {
                    continue;
                }
                visited.add(i);
                t[i] = t[data.parent] + p[i];
                if (map.containsKey(i)) {
                    Data tmp = new Data();
                    tmp.parent = i;
                    tmp.children = map.get(i);
                    dq.addLast(tmp);
                }
            }
        }

        System.out.println(Arrays.stream(t).skip(1).mapToObj(String::valueOf).collect(Collectors.joining(" ")));

    }

    public static class Data {
        int parent;
        List<Integer> children;
    }
}