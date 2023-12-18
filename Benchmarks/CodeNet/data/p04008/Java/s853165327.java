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
        vec = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            vec.add(new ArrayList<>());
        }

        int a0 = -1;
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt() - 1;
            if (i == 0) {
                a0 = j;
            } else {
                vec.get(j).add(i);
            }
        }

        int ans = dfs(0, 0);
        if (a0 != 0) {
            ans++;
        }

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