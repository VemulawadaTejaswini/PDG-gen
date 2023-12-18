import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        String s = sc.next();

        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) =='o') res.add(i);
        }

        for (int i = 0; i < n - k; i++) {
            if (s.charAt(i) == 'o') {
                Set<Integer> set = new HashSet<>();
                set.add(i);
                dfs(i, set, res, s, c, k);
            }
        }

        for (Integer i : res) {
            System.out.println(i + 1);
        }
    }

    private static void dfs(int cur, Set<Integer> set, Set<Integer> res, String s, int skip, int choose) {
        if (set.size() == choose) {
            res.retainAll(set);
            return;
        }

        int next = cur + skip + 1;
        while (next < s.length()) {
            if (s.charAt(next) == 'o') {
                Set<Integer> set2 = new HashSet<>(set);
                set2.add(next);
                dfs(next, set2, res, s, skip, choose);
            }
            next++;
        }
    }
}
