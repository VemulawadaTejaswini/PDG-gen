import java.util.*;

public class Main {

    private static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    private static long[] values;
    private static boolean[] searched;

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        values = new long[n];
        searched = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            map.computeIfAbsent(v1, k -> new ArrayList<>()).add(v2);
            map.computeIfAbsent(v2, k -> new ArrayList<>()).add(v1);
        }

        for (int i = 0; i < q; i++) {
            values[sc.nextInt() - 1] += sc.nextInt();
        }

        searched[0] = true;
        searchAndAdd(1);

        StringBuilder builder = new StringBuilder();
        for (Long v: values
             ) {
            builder.append(v).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);

        System.out.println(builder);
    }

    private static void searchAndAdd(int parent) {
        ArrayList<Integer> v = map.getOrDefault(parent, new ArrayList<>());
        for (Integer child: v
             ) {
            if (!searched[child - 1]) {
                values[child - 1] += values[parent - 1];
                searched[child - 1] = true;
                searchAndAdd(child);
            }
        }
    }
}