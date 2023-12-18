import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    private static int k;
    private static List<List<Integer>> vec;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        int[] a = new int[n];
        vec = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            vec.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - 1;
            if (i != 0) {
                vec.get(a[i]).add(i);
            }
        }

        int ans = 0;
        if (a[0] != 0) {
            ans++;
            a[0] = 0;
        }
        ans += dfs(0, 0);

        System.out.println(ans);
    }

    private static int dfs(int i, int now) {
        int memo = 0;

        if (now == k + 1) {
            memo++;
            now = 1;
        }
        for (int j : vec.get(i)) {
            memo += dfs(j, now + 1);
        }
        return memo;
    }
}