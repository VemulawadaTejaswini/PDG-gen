import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final int[] a = new int[n];
        final TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        final TreeMap<Integer, Integer> ints = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            final Integer floor = ints.floorKey(a[i]);
            if (floor == null) {
                ints.put(a[i], 1);
            } else if (floor == a[i]) {
                final Integer floor2 = ints.floorKey(a[i] - 1);
                if (floor2 == null) {
                    ints.put(a[i], ints.get(a[i]) + 1);
                } else {
                    final Integer val = ints.get(floor2);
                    if (val == 1) {
                        ints.remove(floor2);
                        ints.put(a[i], ints.get(floor) + 1);
                    } else {
                        ints.put(floor2, val - 1);
                        ints.put(a[i], 1);
                    }
                }
            } else {
                final Integer val = ints.get(floor);
                if (val == 1) {
                    ints.remove(floor);
                    ints.put(a[i], 1);
                } else {
                    ints.put(floor, val - 1);
                    ints.put(a[i], 1);
                }
            }
        }
        System.out.println(ints.values().stream().reduce((i1, i2) -> i1 + i2).get());
    }
}
