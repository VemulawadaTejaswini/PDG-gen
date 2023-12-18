import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        Map<Integer, Double> map = new HashMap<Integer, Double>();
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            map.put(i, (double) v[i] / (double) w[i]);
        }

        List<Map.Entry<Integer, Double>> entries = new ArrayList<Map.Entry<Integer, Double>>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(
                    Map.Entry<Integer, Double> entry1, Map.Entry<Integer, Double> entry2) {
                return ((Double) entry2.getValue()).compareTo((Double) entry1.getValue());
            }
        });

        long total = 0;
        for (Map.Entry<Integer, Double> s : entries) {
            if (w[s.getKey()] <= W) {
                total += v[s.getKey()];
                W -= w[s.getKey()];
            }
        }
        System.out.println(total);
    }
}