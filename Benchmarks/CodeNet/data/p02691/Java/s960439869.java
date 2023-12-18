import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Long, Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            long sum_a = a[i] + i;
            if (h.get(sum_a) == null) h.put(sum_a, 1);
            else h.put(sum_a, h.get(sum_a) + 1);
        }

        long ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            long sum = i - a[i];
            if (h.get(sum) != null) ans += h.get(sum);
        }

        System.out.println(ans);
    }
}