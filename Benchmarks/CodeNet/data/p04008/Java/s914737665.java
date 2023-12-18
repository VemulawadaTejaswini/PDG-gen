import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static long K;
    private static List<List<Long>> vec;
    private static int ans;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        K = sc.nextLong();
        ans = 0;
        vec = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vec.add(new ArrayList<>());
        }
        for (long i = 0; i < n; i++) {
            int a = sc.nextInt() - 1;
            if (i != 0) {
                vec.get(a).add(i);
            } else if (a != 0) {
                ans++;
            }
        }
        dfs(0, 0);
        System.out.println(ans);
    }

    private static long dfs(long v, int pre) {
        long height = 0;
        for (long j : vec.get((int)v)) {
            height = Math.max(height, dfs(j, v));
        }
        if (pre != 0 && height == K - 1) {
            height = 0;
            ans++;
        } else {
            height++;
        }
        return height;
    }
}