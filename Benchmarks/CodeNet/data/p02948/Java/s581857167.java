
import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int m = in.nextInt();

        long ans = 0;
        Map<Integer, List<Map.Entry<Integer, Integer>>> arbeits = new HashMap<>();
        for (int i=0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (!arbeits.containsKey(a))
                arbeits.put(a, new ArrayList<>());
            arbeits.get(a).add(new AbstractMap.SimpleEntry<>(a, b));
        }

        arbeits.entrySet().forEach(e -> e.getValue().sort(((o1, o2) -> o2.getValue() - o1.getValue())));

        PriorityQueue<Map.Entry<Integer, Integer>> available = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (int i=1; i <= m; i++) {
            available.addAll(arbeits.getOrDefault(i, new ArrayList<>()));
            if (available.size() != 0) {
                ans += available.poll().getValue();
            }
        }
        out.println(ans);
    }

    private static class Arbeit {
        int a;
        int b;
        public Arbeit(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof Arbeit && ((Arbeit) obj).a == this.a && ((Arbeit) obj).b == this.b;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

}
