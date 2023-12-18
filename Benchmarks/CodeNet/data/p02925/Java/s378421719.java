import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        List<Queue<Integer>> ord = new ArrayList<>();
        List<HashSet<Integer>> waiting = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ord.add(new ArrayDeque<>());
            waiting.add(new HashSet<>());
        }

        Queue<Pair> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                int a = in.nextInt() - 1;
                if (j == 0) waiting.get(a).add(i);
                else ord.get(i).offer(a);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (waiting.get(i).contains(j) && waiting.get(j).contains(i)) {
                    q.offer(new Pair(i, j));
                }
            }
        }

        int cnt = 0;
        while (!q.isEmpty()) {
            Pair p = q.poll();
            cnt++;
            waiting.get(p.x).remove(p.y);
            waiting.get(p.y).remove(p.x);
            if (!ord.get(p.x).isEmpty()) {
                int nx = ord.get(p.x).poll();
                waiting.get(nx).add(p.x);
                if (waiting.get(p.x).contains(nx)) q.offer(new Pair(nx, p.x));
            }
            if (!ord.get(p.y).isEmpty()) {
                int ny = ord.get(p.y).poll();
                waiting.get(ny).add(p.y);
                if (waiting.get(p.y).contains(ny)) q.offer(new Pair(ny, p.y));
            }
        }
        if (cnt == n * (n - 1) / 2) {
            out.println(n);
        } else {
            out.println(-1);
        }
        out.close();
    }

    private static class Pair {
        int x, y;

         Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
