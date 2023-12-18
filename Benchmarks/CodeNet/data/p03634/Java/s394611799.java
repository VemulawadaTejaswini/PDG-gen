import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    static long[] distance;
    static ArrayList<TreeMap<Integer, Long>> edges;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        distance = new long[n];
        edges = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            edges.add(new TreeMap<Integer, Long>());
        }
        for (int i = 0 ; i < n - 1 ; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            long d = sc.nextLong();
            edges.get(a).put(b, d);
            edges.get(b).put(a, d);
        }
        int q = sc.nextInt();
        dfs(-1, sc.nextInt() - 1, 0);
        for (int i = 0 ; i < q ; i++) {
            System.out.println(distance[sc.nextInt() - 1] + distance[sc.nextInt() ^ 1]);
        }


    }

    static void dfs(int from, int to, long d) {
        distance[to] = d;
        TreeMap<Integer, Long> m = edges.get(to);
        m.remove(from);
        m.forEach((k, v) -> dfs(to, k, d+v));
    }

}
