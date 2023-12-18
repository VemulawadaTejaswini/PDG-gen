import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }
            HashMap<Integer, Integer> numberToCount = new HashMap<>();
            for (int i = 0; i < N; i++) {
                Integer count = numberToCount.get(a[i]);
                numberToCount.put(a[i], 1 + (count == null ? 0 : count.intValue()));
            }
            int count = 0;
            for (Integer n : numberToCount.keySet()) {
                Integer c = numberToCount.get(n);
                if (c.intValue() < n.intValue()) {
                    count += c.intValue();
                    continue;
                }
                if (c.intValue() >= n) {
                    count += c.intValue() - n.intValue();
                }
            }
            System.out.println(count);
        }
    }
}
