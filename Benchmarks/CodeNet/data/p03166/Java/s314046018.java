import java.util.*;

public class Main {
    private static Map<Integer, Integer> memo = new HashMap<>();
    private static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            graph.get(sc.nextInt()).add(sc.nextInt());
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = Math.max(result, rec(i));
        }

        System.out.println(result);
    }

    private static int rec(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (graph.get(n).size() == 0) {
            memo.put(n, 0);
            return 0;
        }
        int length = 0;
        for (Integer i : graph.get(n)) {
            length = Math.max(length, rec(i) + 1);
        }
        memo.put(n, length);
        return length;
    }
}
