import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        List<Map.Entry<Integer, Integer>> lines = new ArrayList<>();

        for (int i=0; i < m; i++) {
            lines.add(
                    new AbstractMap.SimpleEntry<>(sc.nextInt(), sc.nextInt())
            );
        }

        for (int i=0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(numOfLines(l, r, lines));
        }

    }

    private static int numOfLines(int l, int r, List<Map.Entry<Integer, Integer>> lines) {
        int c = 0;
        for (Map.Entry<Integer, Integer> e : lines) {
            if (l <= e.getKey() && e.getValue() <= r)
                c++;
        }
        return c;
    }

}
