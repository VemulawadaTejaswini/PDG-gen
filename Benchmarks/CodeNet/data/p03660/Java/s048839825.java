import java.util.*;
public class Main {
    static List<List<Integer>> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }

        // System.out.println(list);
        int[] d1 = bfs(1, -1, new int[n + 1]);
        int[] d2 = bfs(n, -1, new int[n + 1]);
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (d1[i] <= d2[i]) {
                cnt1++;
                continue;
            }
            cnt2++;
        }

        if (cnt1 > cnt2) {
            System.out.println("Fennec");
            return;
        }
        System.out.println("Snuke");
    }
    public static int[] bfs(int s, int p, int[] ret) {
        List<Integer> edge = list.get(s);
        for (int v : edge) {
            if (p != v) {
                ret[v] += ret[s] + 1;
                bfs(v, s, ret);
            }
        }
        return ret;
    }
}
