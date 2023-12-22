import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            g.get(a).add(b);
            g.get(b).add(a);
        }
        boolean[] used = new boolean[n];
        int[] ans = new int[n];
        used[0] = true;
        ArrayList<Integer> q = new ArrayList<>();
        q.add(0);
        int index = 0;
        while (index < q.size()) {
            int v = q.get(index);
            index++;
            for (int i = 0; i < g.get(v).size(); i++) {
                if (!used[g.get(v).get(i)]) {
                    ans[g.get(v).get(i)] = v + 1;
                    q.add(g.get(v).get(i));
                    used[g.get(v).get(i)] = true;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (ans[i] == 0) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
        for (int i = 1; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}
