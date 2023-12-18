import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        Map<Map.Entry<Integer, Integer>, Integer> lines = new HashMap<>();

        for (int i=0; i < m; i++) {
            Map.Entry<Integer,Integer> e = new AbstractMap.SimpleEntry<>(sc.nextInt(), sc.nextInt());
            if (lines.containsKey(e))
                lines.put(e, lines.get(e) + 1);
            else
                lines.put(e, 1);
        }

        Map<Map.Entry<Integer, Integer>, Integer> ans = new HashMap<>();

        for (int i=1; i <= n; i++) {
            for (int j=1; j <= n; j++) {
                ans.put(new AbstractMap.SimpleEntry<>(i, j), numOfLines(i, j, lines));
            }
        }

        for (int i=0; i < q; i++) {
            Map.Entry<Integer,Integer> e = new AbstractMap.SimpleEntry<>(sc.nextInt(), sc.nextInt());
            System.out.println(ans.get(e));
        }

    }

    private static int numOfLines(int l, int r, Map<Map.Entry<Integer, Integer>, Integer> lines) {
        int c = 0;
        for (Map.Entry<Map.Entry<Integer, Integer>, Integer> e : lines.entrySet()) {
            if (l <= e.getKey().getKey() && e.getKey().getValue() <= r)
                c += e.getValue();
        }
        return c;
    }

}
