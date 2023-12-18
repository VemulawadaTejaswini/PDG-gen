import java.util.*;

public class Main {
    static int[][] dp;
    static Scanner sc;
    static int n;
    static int m;
    static List<Set<Integer>> graph;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int n1 = 0;
        int n2 = 0;
        graph = new ArrayList<>(n+1);
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
            n1 = a;
            n2 = b;
        }

        LinkedList<Integer> path = new LinkedList<>();
        path.add(n1);
        path.add(n2);
        boolean flag = true;
        while (flag) {
            flag = false;
            int first = path.getFirst();
            for (int i = 0; i < n; i++) {
                if (graph.get(first).contains(i) && !path.contains(i)) {
                    path.addFirst(i);
                    flag = true;
                    break;
                }
            }
            int last = path.getLast();
            for (int i = 0; i < n; i++) {
                if (graph.get(last).contains(i) && !path.contains(i)) {
                    path.addLast(i);
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(path.size());
        for (Integer i : path) {
            System.out.print((i + 1) + " ");
        }
    }
}
