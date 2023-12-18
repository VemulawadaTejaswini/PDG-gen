import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

    public static class action {
        int from, to;

        action(int a, int b) {
            this.from = a;
            this.to = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(br.readLine());
        long[][] cost = new long[n][n];
        for (int i = 0; i < n; i++) Arrays.fill(cost[i], -1);

        for (int i = 0; i < n - 1; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]) - 1;
            int b = Integer.parseInt(str[1]) - 1;
            long c = Long.parseLong(str[2]);
            cost[a][b] = c;
            cost[b][a] = c;
        }

        String[] str = br.readLine().split(" ");
        int q = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]) - 1;
        long[] dist = new long[n];

        dist[k] = 0;
        ArrayDeque que = new ArrayDeque();
        for (int i = 0; i < n; i++) {
            if (cost[k][i] != -1) {
                action ac = new action(k, i);
                que.add(ac);
            }
        }

        while (!que.isEmpty()) {
            action ac = (action) que.poll();
            dist[ac.to] = dist[ac.from] + cost[ac.from][ac.to];
            for (int i = 0; i < n; i++) {
                if (i == ac.from) continue;
                if (cost[ac.to][i] != -1) {
                    action adac = new action(ac.to, i);
                    que.add(adac);
                }
            }
        }

        for (int i = 0; i < q; i++) {
            str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]) - 1;
            int y = Integer.parseInt(str[1]) - 1;
            System.out.println(dist[x] + dist[y]);
        }
    }
}
