import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            int k = sc.nextInt();
            int v = sc.nextInt();
            if (map.containsKey(k)) {
                map.get(k).add(v);
            } else {
                map.put(k, new ArrayList<Integer>(Arrays.asList(v)));
            }

        }

        long ans = 0;
        long count = 0;

        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
            count += e.getValue().stream().mapToInt(i -> i).sum();
            if (count >= K) {
                System.out.println(e.getKey());
                return;
            }
        }

    }
}
