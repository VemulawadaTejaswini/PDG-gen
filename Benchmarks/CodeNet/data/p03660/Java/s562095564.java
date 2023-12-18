import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Map<Integer, Set<Integer>> tree = new HashMap<>();
        for (int i : IntStream.range(0, N - 1).toArray()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            Set<Integer> map = tree.getOrDefault(a, new HashSet<>());
            map.add(b);
            tree.put(a, map);
            map = tree.getOrDefault(b, new HashSet<>());
            map.add(a);
            tree.put(b, map);
        }

        List<Integer> path = dijkstra(tree, N);
        List<Integer> black = new ArrayList<>();
        int blackNum = path.size() / 2 + path.size() % 2;
        for (int i = 0; i < blackNum; i++) {
            black.add(path.get(i));
        }
        int forbidden = path.get(blackNum);
        int blackCount = count(tree, forbidden);
        if (path.size() % 2 == 0) {
            if (N < blackCount * 2) {
                System.out.println("Fennec");
            } else {
                System.out.println("Snuke");
            }
        } else {
            if (N < blackCount * 2 + 1) {
                System.out.println("Fennec");
            } else {
                System.out.println("Snuke");
            }
        }
    }

    static List<Integer> dijkstra(Map<Integer, Set<Integer>> tree, int N) {
        LinkedList<List<Integer>> stack = new LinkedList<>();
        stack.add(Collections.singletonList(1));
        List<List<Integer>> ret = new ArrayList<>();
        for (int i : IntStream.range(0, N).toArray()) {
            List<Integer> current = stack.removeFirst();
            int node = current.get(current.size() - 1);
            int previous = current.size() >= 2 ? current.get(current.size() - 2) : -1;
            for (int next : tree.get(node)) {
                if (next == previous) {
                    continue;
                }
                if (next == N) {
                    List<Integer> tmp = new ArrayList<>(current);
                    tmp.add(next);
                    ret.add(tmp);
                }
                List<Integer> tmp = new ArrayList<>(current);
                tmp.add(next);
                stack.add(tmp);
            }
            if (!ret.isEmpty()) {
                return ret.get(0);
            }
        }
        return null;
    }

    static int count(Map<Integer, Set<Integer>> tree, int forbidden) {
        Set<Integer> ret = new HashSet<>();
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(1);
        while (!stack.isEmpty()) {
            int next = stack.removeFirst();
            ret.add(next);
            for (Integer tmp : tree.get(next)) {
                if (tmp == forbidden) {
                    continue;
                }
                if(ret.contains(tmp)) {
                    continue;
                }
                stack.add(tmp);
            }
        }
        return ret.size();
    }
}
