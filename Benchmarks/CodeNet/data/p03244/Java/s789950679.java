import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        Map<Integer, Integer> odds = new HashMap<>();
        Map<Integer, Integer> evens = new HashMap<>();

        int replacements = 0;

        for (int i = 0; i < n; i += 2) {
            odds.put(v[i], odds.getOrDefault(v[i], 0) + 1);
        }
        replacements += (n + 1) / 2 - Collections.max(odds.values());

        for (int i = 1; i < n; i += 2) {
            evens.put(v[i], evens.getOrDefault(v[i], 0) + 1);
        }
        replacements += n / 2 - Collections.max(evens.values());

        System.out.println(replacements);
    }
}
