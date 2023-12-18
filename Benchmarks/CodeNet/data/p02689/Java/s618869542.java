import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            map.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }
        int ans = 0;
        parent: for (int i = 1; i <= n; i++) {
            ArrayList<Integer> list = map.get(i);
            if (list == null) {
                ans++;
                continue;
            }
            for (Integer v: list
                 ) {
                if (h[v - 1] >= h[i - 1]) {
                    continue parent;
                }
            }
            ans++;
        }

        System.out.println(ans);
    }
}