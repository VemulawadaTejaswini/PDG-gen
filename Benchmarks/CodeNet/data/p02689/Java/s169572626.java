import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] H = new int[N + 1];
        Map<Integer, List<Integer>> mp = new HashMap<>();
        str = br.readLine().split(" ");
        for (int i = 1; i <= N; ++i)
            H[i] = Integer.parseInt(str[i - 1]);

        for (int i = 1; i <= M; ++i) {
            str = br.readLine().split(" ");
            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
            mp.putIfAbsent(u, new ArrayList<>());
            mp.putIfAbsent(v, new ArrayList<>());
            mp.get(u).add(v);
            mp.get(v).add(u);
        }
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= N; ++i) {
            if (!mp.containsKey(i)) {
                res++;
                continue;
            }
            boolean ok = true;
            List<Integer> adjList = mp.get(i);
            for (int adj : adjList) {
                if (H[i] < H[adj]) {
                    ok = false;
                    break;
                }
                if (set.contains(adj)) {
                    ok = false;
                    break;
                }
                if (ok) {
                    set.add(adj);
                }
            }
            if (ok)
                res++;
            set.clear();
        }
        System.out.println(res);
    }
}
