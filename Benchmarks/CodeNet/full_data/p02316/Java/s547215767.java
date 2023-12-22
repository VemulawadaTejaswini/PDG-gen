import java.util.*;

public class Main {
    static int[][] dp;
    static Knap[]  knaps;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        knaps = new Knap[n];
        for (int i = 0; i < n; i++) {
            knaps[i] = new Knap(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(knaps);
        dp = new int[n][w + 1];
        System.out.println(dfw(n - 1, w));
    }
    
    static int dfw(int idx, int weight) {
        if (weight < 0) {
            return Integer.MIN_VALUE;
        }
        if (idx < 0) {
            return 0;
        }
        if (dp[idx][weight] != 0) {
            return dp[idx][weight];
        }
        if (weight % knaps[idx].weight == 0) {
            return dp[idx][weight] = weight / knaps[idx].weight * knaps[idx].value;
        }
        int max = 0;
        for (int i = 0; i * knaps[idx].weight <= weight; i++) {
            max = Math.max(max, dfw(idx - 1, weight - knaps[idx].weight * i) + knaps[idx].value * i);
        }
        return dp[idx][weight] = max;
    }
    
    static class Knap implements Comparable<Knap> {
        int value;
        int weight;
        
        public Knap(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
        
        public int compareTo(Knap another) {
            return value * another.weight - another.value * weight;
        }
    }
}
