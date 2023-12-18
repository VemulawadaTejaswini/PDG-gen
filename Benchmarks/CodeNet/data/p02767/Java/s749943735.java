import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) x[i] = sc.nextInt();
        int ans = 1000_000;
        for (int p = 1; p <= 100; p++) {
            int cost = 0;
            for (int i = 0; i < n; i++) cost += (x[i] - p) * (x[i] - p);
            ans = Math.min(ans, cost);
        }
        System.out.println(ans);
    }
}