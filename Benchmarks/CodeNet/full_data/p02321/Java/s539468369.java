import java.util.*;

public class Main {
    static Knap[] knaps;
    static ArrayList<HashMap<Long, Long>> dp = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long w = sc.nextLong();
        knaps = new Knap[n];
        for (int i = 0; i < n; i++) {
            dp.add(new HashMap<>());
            knaps[i] = new Knap(sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(knaps);
        knaps[0].sumV = knaps[0].value;
        knaps[0].sumW = knaps[0].weight;
        for (int i = 1; i < n; i++) {
            knaps[i].sumV = knaps[i - 1].sumV + knaps[i].value;
            knaps[i].sumW = knaps[i - 1].sumW + knaps[i].weight;
        }
        System.out.println(dfw(n - 1, w));
    }
    
    static long dfw(int idx, long weight) {
        if (weight < 0) {
            return Long.MIN_VALUE;
        }
        if (idx < 0) {
            return 0;
        }
        if (dp.get(idx).containsKey(weight)) {
            return dp.get(idx).get(weight);
        }
        if (weight >= knaps[idx].sumW) {
            dp.get(idx).put(weight, knaps[idx].sumV);
            return knaps[idx].sumV;
        }
        long max = Math.max(dfw(idx - 1, weight - knaps[idx].weight) + knaps[idx].value, dfw(idx - 1, weight));
        dp.get(idx).put(weight, max);
        return max;
    }
    
    static class Knap implements Comparable<Knap> {
        long value;
        long weight;
        long sumV;
        long sumW;
        
        public Knap(long value, long weight) {
            this.value = value;
            this.weight = weight;
        }
        
        public int compareTo(Knap another) {
            if (weight == another.weight) {
                return 0;
            } else if (weight < another.weight) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
