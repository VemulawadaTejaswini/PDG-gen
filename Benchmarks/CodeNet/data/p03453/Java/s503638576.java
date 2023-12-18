import java.io.*;
import java.util.*;

public class Main {

    static long count = 0;
    static int target;
    static int dist;
    static HashMap<Integer, HashMap<Integer, Integer>> hm;
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n = in.nextInt(), m = in.nextInt(), s = in.nextInt() - 1, t = in.nextInt() - 1;

        int[] pos = new int[n];

        Arrays.fill(pos, Integer.MAX_VALUE);
        pos[s] = 0;

        hm = new HashMap<>();
        for (int i = 0 ; i < m; i++) {
            int l = in.nextInt() - 1, r = in.nextInt() - 1, d = in.nextInt();
            HashMap<Integer, Integer> list = hm.getOrDefault(l, new HashMap<>());
            list.put(r, d);
            hm.put(l, list);
            HashMap<Integer, Integer> list2 = hm.getOrDefault(r, new HashMap<>());
            list2.put(l, d);
            hm.put(r, list2);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[] visited = new boolean[n];
        pq.add(new int[]{0, s});
        while (pq.size() > 0) {
            int[] cur = pq.poll();
            int c = cur[1];
            if (visited[c])
                continue;
            visited[c] = true;
            if (c == t)
                break;
            int dist = pos[c];
            for (Map.Entry<Integer, Integer> hmm : hm.get(c).entrySet()) {
                if (pos[hmm.getKey()] > dist + hmm.getValue()) {
                    pq.add(new int[]{dist + hmm.getValue(), hmm.getKey()});
                    pos[hmm.getKey()] = dist + hmm.getValue();
                }
            }
        }
        dist = pos[t];
        target = t;
        bfs(0, -1, s);
        System.out.println(count * (count - 1) % (1000000000 + 7));
    }

    static void bfs(int d, int coming, int cur) {
        if (dist < d)
            return;
        if (cur == target && dist == d) {
            count++;
            return;
        }
        for (Map.Entry<Integer, Integer> hmm : hm.get(cur).entrySet()) {
            if (!hmm.getKey().equals(coming)) {
                bfs(d + hmm.getValue(), cur, hmm.getKey());
            }
        }
    }

}