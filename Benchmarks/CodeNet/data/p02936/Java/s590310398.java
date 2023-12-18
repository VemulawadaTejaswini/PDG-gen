import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] values = new long[n];
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> kishutu = new HashSet<>();
        int[] index = new int[n - 1];
        kishutu.add(1);

        for (int i = 0; i < n - 1; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            if (kishutu.contains(v1)) {
                map.put(v2, v1);
                index[i] = v2;
            } else {
                map.put(v1, v2);
                index[i] = v1;
            }
            kishutu.add(v1);
            kishutu.add(v2);
        }

        for (int i = 0; i < q; i++) {
            values[sc.nextInt() - 1] += sc.nextInt();
        }

        for (Integer key: index
             ) {
            values[key - 1] += values[map.get(key) - 1];
        }

        StringBuilder builder = new StringBuilder();
        for (Long v: values
             ) {
            builder.append(v).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder);
    }
}