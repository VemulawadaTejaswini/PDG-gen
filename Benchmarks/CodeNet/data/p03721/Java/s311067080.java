import java.util.*;

public class Main {
    public static int solve() {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        HashMap<Integer, Integer> counts = new HashMap<>();

        int a, b;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (!counts.containsKey(a)) {
                 counts.put(a, b);
            } else {
                counts.put(a, counts.get(a)+b);
            }
        }

        int sum = 0;
        Integer[] sortedKeys = counts.keySet().toArray(new Integer[counts.size()]);
        Arrays.sort(sortedKeys);

        for (Integer key: sortedKeys) {
            if (sum + counts.get(key) >= k) {
                System.out.println(key);
                return;
            } else {
                sum += counts.get(key);
            }
        }

    }
}
