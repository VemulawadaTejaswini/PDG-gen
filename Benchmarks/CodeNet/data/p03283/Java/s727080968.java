import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        Map<Map.Entry<Integer, Integer>, Integer> lines = new HashMap<>();

        for (int i=1; i <= n; i++) {
            for (int j=1; j <= n; j++) {
                Map.Entry<Integer, Integer> e = new AbstractMap.SimpleEntry<>(i, j);
                lines.put(e, 0);
            }
        }

        for (int i=0; i < m; i++) {
            Map.Entry<Integer,Integer> e = new AbstractMap.SimpleEntry<>(sc.nextInt(), sc.nextInt());
            lines.put(e, lines.get(e) + 1);
        }

        Map<Map.Entry<Integer, Integer>, Integer> ans = new HashMap<>();

        for (int l=0; l < n; l++) {
            for (int i=1; i+l <= n; i++) {
                int j = i+l;
                Map.Entry<Integer, Integer> e = new AbstractMap.SimpleEntry<>(i, j);
                if (i == j)
                    ans.put(e, lines.get(e));
                else if ((i+1) == j) {
                    ans.put(e, lines.get(e)
                            + ans.get(new AbstractMap.SimpleEntry<>(i+1, j))
                            + ans.get(new AbstractMap.SimpleEntry<>(i, j-1)));
                } else {
                    ans.put(e, lines.get(e)
                            + ans.get(new AbstractMap.SimpleEntry<>(i+1, j))
                            + ans.get(new AbstractMap.SimpleEntry<>(i, j-1))
                            - ans.get(new AbstractMap.SimpleEntry<>(i+1, j-1)));
                }
            }
        }

        for (int i=0; i < q; i++) {
            Map.Entry<Integer,Integer> e = new AbstractMap.SimpleEntry<>(sc.nextInt(), sc.nextInt());
            System.out.println(ans.get(e));
        }

    }

}
