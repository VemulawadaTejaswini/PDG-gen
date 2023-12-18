import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();

        Map<Integer, Long> m = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            m.putIfAbsent(a, 0L);
            m.put(a, m.get(a) + b);
        }

        for (int a : m.keySet()) {
            k -= m.get(a);
            if (k <= 0) {
                System.out.println(a);
                return;
            }
        }
    }
}
