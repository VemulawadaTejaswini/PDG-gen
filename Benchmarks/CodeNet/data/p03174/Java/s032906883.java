import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] match = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int cur = sc.nextInt();
                match[i][j] = (cur == 1);
            }
        }
        long ans = backtrack(match, 0, 0, new boolean[N], N, new HashMap<Long, Long>());
        System.out.println(ans);
    }

    public static long backtrack(boolean[][] match, int index, long cur, boolean[] visit, int N, Map<Long, Long> map) {
        if (index == N) return 1;
        if (map.containsKey(cur)) return map.get(cur);
        int m = (int) 1e9 + 7;
        long res = 0;
        for (int i = 0; i < N; i++) {
            if (!visit[i] && match[index][i]) {
                visit[i] = true;
                res = (res + backtrack(match, index + 1, cur + ((long)1 << index) + ((long) 1 << (21 + i)), visit, N, map)) % m;
                visit[i] = false;
            }
        }

        map.put(cur, res % m);
        return res % m;
    }
}
