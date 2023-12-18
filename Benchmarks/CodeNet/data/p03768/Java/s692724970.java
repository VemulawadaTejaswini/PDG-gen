import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        int[] colors = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ", 2);
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            graph[a].add(b);
            graph[b].add(a);
        }
        int q = Integer.parseInt(br.readLine());
        int[] vArr = new int[q];
        int[] dArr = new int[q];
        int[] cArr = new int[q];
        for (int i = 0; i < q; i++) {
            String[] line = br.readLine().split(" ", 3);
            vArr[i] = Integer.parseInt(line[0]);
            dArr[i] = Integer.parseInt(line[1]);
            cArr[i] = Integer.parseInt(line[2]);
        }
        for (int i = q - 1; i >= 0; i--) {
            ArrayDeque<Integer> deq = new ArrayDeque<>();
            ArrayDeque<Integer> next = new ArrayDeque<>();
            HashSet<Integer> set = new HashSet<>();
            deq.add(vArr[i]);
            for (int j = 0; j <= dArr[i]; j++) {
                while (deq.size() > 0) {
                    int x = deq.poll();
                    if (set.contains(x)) {
                        continue;
                    }
                    set.add(x);
                    if (colors[x] == 0) {
                        colors[x] = cArr[i];
                    }
                    next.addAll(graph[x]);
                }
                ArrayDeque<Integer> tmp = next;
                next = deq;
                deq = tmp;
            }
            
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(colors[i]).append("\n");
        }
        System.out.print(sb);
    }

}
