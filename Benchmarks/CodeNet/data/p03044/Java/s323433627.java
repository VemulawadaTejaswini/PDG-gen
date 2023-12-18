
import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, ArrayList<Integer>> tree = new HashMap<>();
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = -1;
        }

        for (int i = 1; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            if (tree.containsKey(u)) {
                list = tree.get(u);
            }
            list.add(v);
            tree.put(u, list);
            list = new ArrayList<>();
            if (tree.containsKey(v)) {
                list = tree.get(v);
            }
            list.add(u);
            tree.put(v, list);
        }


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        ans[1] = 0;
        while (!stack.empty()) {
            int p = stack.pop();
            for (int v : tree.get(p)) {
                if (ans[v] == -1) {
                    ans[v] = ans[p] == 1 ? 0 : 1;
                    stack.push(v);
                }
            }

        }

        for (int i = 1; i <= n; i++) {
            System.out.println(ans[i]);
        }
    }
}