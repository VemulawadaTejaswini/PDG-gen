import javafx.util.Pair;

import java.util.*;

//https://atcoder.jp/contests/agc032/tasks/agc032_b
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Set<Integer>> groups = new ArrayList<>();
        if (n % 2 == 0) {
            for (int i = 1; i <= n / 2; i++) {
                Set<Integer> group = new HashSet<Integer>();
                group.add(i);
                group.add(n + 1 - i);
                groups.add(group);
            }
        } else {
            for (int i = 0; i <= n / 2; i++) {
                Set<Integer> group = new HashSet<Integer>();
                if (i > 0) {
                    group.add(i);
                }
                group.add(n - i);
                groups.add(group);
            }
        }
        Set<Pair<Integer, Integer>> edges = new HashSet<>();
        for (int i = 0; i < groups.size(); i++) {
            for (int j : groups.get(i)) {
                for (int k = 0; k < groups.size(); k++) {
                    if (k != i) {
                        for (int l : groups.get(k)) {
                            int min = Math.min(j, l);
                            int max = Math.max(j, l);
                            edges.add(new Pair<Integer, Integer>(min, max));
                        }
                    }
                }
            }
        }
        System.out.println(edges.size());
        for (Pair<Integer, Integer> e : edges) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
