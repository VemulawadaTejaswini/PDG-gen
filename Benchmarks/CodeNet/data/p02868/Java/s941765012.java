import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

class D {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final Segment[] segs = new Segment[M];
        for (int i = 0; i < M; i++)
            segs[i] = new Segment(i, sc.nextInt(), sc.nextInt(), sc.nextInt());
        final TreeSet<Segment> que = new TreeSet<>((Segment o1, Segment o2) -> o1.L == o2.L ? o1.idx - o2.idx : o1.L - o2.L);
        que.addAll(Arrays.asList(segs));
        final long[] dist = new long[N + 1];
        Arrays.fill(dist, Long.MAX_VALUE / 2);
        dist[1] = 0;
        final TreeSet<Segment> set = new TreeSet<>((Segment o1, Segment o2) ->
                o1.dist(dist) == o2.dist(dist) ? o1.idx - o2.idx : Long.compare(o1.dist(dist), o2.dist(dist)));
        for (int i = 1; i <= N; i++) {
            while (!set.isEmpty() && set.first().R < i)
                set.pollFirst();
            if (!set.isEmpty())
                dist[i] = set.first().dist(dist);
            while (!que.isEmpty() && que.first().L == i) {
                set.add(que.pollFirst());
            }
        }
        System.out.println(dist[N] < Long.MAX_VALUE / 2 ? dist[N] : -1);
    }

    static class Segment {
        final int idx, L, R, C;

        public Segment(int i, int l, int r, int c) {
            idx = i;
            L = l;
            R = r;
            C = c;
        }

        public long dist(final long[] dist) {
            return dist[L] + C;
        }
    }
}
public class Main {
    public static void main(String...args) {
        D.main();
    }
}
