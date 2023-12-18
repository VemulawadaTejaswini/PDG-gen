import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        long n = stdin.nextLong();
        long p = stdin.nextLong();

        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 2; p > 1; i++) {
            while (p % i == 0) {
                counter.put(i, counter.getOrDefault(i, 0) + 1);
                p /= i;
            }
        }

        long ans = 1;
        for (Entry<Integer, Integer> e : counter.entrySet()) {
            if (e.getValue() < n) continue;
            ans *= e.getKey() * (e.getValue() / n);
        }
        System.out.println(ans);
    }
}
