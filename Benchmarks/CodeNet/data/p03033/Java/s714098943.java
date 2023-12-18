import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = Integer.parseInt(scanner.next());
        int q = Integer.parseInt(scanner.next());
        List<State> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int s = Integer.parseInt(scanner.next());
            int t = Integer.parseInt(scanner.next());
            int x = Integer.parseInt(scanner.next());
            list.add(new State(s - x, x, -1));
            list.add(new State(t - x, x, -2));
        }
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            list.add(new State(Integer.parseInt(scanner.next()), 0, i));
        }
        Collections.sort(list);
        TreeSet<Integer> set = new TreeSet<>();
        for (State s : list) {
            if (s.v == -1) {
                set.add(s.d);
            } else if (s.v == -2) {
                set.remove(s.d);
            } else {
                ans[s.v] = set.isEmpty() ? -1 : set.first();
            }
        }

        for (int i : ans) {
            System.out.println(i);
        }
    }

    static class State implements Comparable<State> {
        int t, d, v;

        State(int t, int d, int v) {
            this.t = t;
            this.d = d;
            this.v = v;
        }

        @Override
        public int compareTo(State o) {
            return Integer.compare(t, o.t);
        }
    }
}