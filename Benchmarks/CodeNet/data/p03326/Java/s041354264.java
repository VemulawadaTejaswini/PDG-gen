

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class D {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String[] line = in.nextLine().split(" ");
        final int n = Integer.parseInt(line[0]);
        final int k = Integer.parseInt(line[1]);
        long[][] cakes = new long[n][3];
        for (int i = 0; i < n; i++) {
            line = in.nextLine().split(" ");
            cakes[i][0] = Long.parseLong(line[0]);
            cakes[i][1] = Long.parseLong(line[1]);
            cakes[i][2] = Long.parseLong(line[2]);
        }
        System.out.println(dfs(cakes, 0, k, 0, 0, 0, new HashMap<>()));
    }

    private static long dfs(long[][] cakes, int idx, int k, long b, long t, long p, Map<String, Long> dp) {
        if (idx == cakes.length) {
            return k == 0 ? (Math.abs(b) + Math.abs(t) + Math.abs(p)) : 0;
        }
        String key = idx + "," + k + ',' + b + ',' + t + ',' + p;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        long res = dfs(cakes, idx + 1, k, b, t, p, dp);
        if (k > 0) {
            res = Math.max(res,
                           dfs(cakes, idx + 1, k - 1, b + cakes[idx][0], t + cakes[idx][1], p + cakes[idx][2],
                               dp));
        }
        dp.put(key, res);
        return res;
    }
}
