import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        char[] c = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Map<String, Integer> left = extractLeft(i, 0, c);
            Map<String, Integer> right = extractRight(i, n, c);
            int tmp = solve(left, right);

            ans = Math.max(ans, tmp);
        }

        System.out.println(ans);
    }

    private static int solve(Map<String, Integer> left, Map<String, Integer> right) {
        int ret = 0;
        for (Entry<String, Integer> ent : left.entrySet()) {
            if (right.get(ent.getKey()) != null) {
                ret++;
            }
        }
        return ret;
    }

    private static Map<String, Integer> extractRight(int i, int n, char[] c) {
        Map<String, Integer> m = new HashMap<>();
        for (; i < n; i++) {
            String s = String.valueOf(c[i]);
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }
        return m;
    }

    private static Map<String, Integer> extractLeft(int i, int n, char[] c) {
        Map<String, Integer> m = new HashMap<>();
        for (; i > n; i--) {
            String s = String.valueOf(c[i]);
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }
        return m;
    }
}

