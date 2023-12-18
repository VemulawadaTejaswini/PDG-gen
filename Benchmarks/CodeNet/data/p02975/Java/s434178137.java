import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];

        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            if (!count.containsKey(a[i])) count.put(a[i], 0);
            count.put(a[i], count.get(a[i]) + 1);
        }

        int numValues = count.keySet().size();

        if (numValues == 1) {
            System.out.println(count.containsKey(0) ? "Yes" : "No");
            return;
        }

        if (numValues == 2 && N % 3 == 0 && count.containsKey(0)) {
            String sol = "Yes";
            for (int x : count.keySet()) {
                if (x == 0 && count.get(x) != numValues / 3) sol = "No";
                if (x != 0 && count.get(x) != 2 * (numValues / 3)) sol = "No";
            }
            System.out.println(sol);
            return;
        }

        if (numValues == 3 && N % 3 == 0) {
            String sol = "Yes";
            int xor = 0;
            for (int x : count.keySet()) xor ^= x;
            if (xor != 0) sol = "No";
            for (int c : count.values()) {
                if (c != N / 3) sol = "No";
            }
            System.out.println(sol);
            return;
        }

        System.out.println("No");
    }
}
