import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();

            PriorityQueue<Pair> q = new PriorityQueue<Pair>((lhs,rhs)->Long.signum(rhs.point - lhs.point));
            PriorityQueue<Pair> chosen = new PriorityQueue<Pair>((lhs,rhs)->Long.signum(lhs.point - rhs.point));
            for (int i = 0; i < N; i++) {
                q.offer(new Pair(scanner.nextInt(), scanner.nextLong()));
            }
            long satis = 0;
            final Map<Integer, Integer> kindCounts = new HashMap<>();
            for (int i = 0; i < K; i++) {
                Pair pair = q.poll();
                chosen.offer(pair);
                satis += pair.point;
                kindCounts.compute(pair.kind, (k,v)->v == null ? 1 : v + 1);
            }
            long max = satis + kindCounts.size() * kindCounts.size();
            while(!q.isEmpty()) {
                Pair newKind = q.poll();
                if (kindCounts.get(newKind.kind) == null) {
                    Pair remove = null;
                    while(!chosen.isEmpty() && remove == null) {
                        Pair candidate = chosen.poll();
                        if (kindCounts.get(candidate.kind) > 1) {
                            remove = candidate;
                        }
                    }
                    if (remove == null) {
                        break;
                    }
                    satis -= remove.point;
                    satis += newKind.point;
                    kindCounts.compute(remove.kind, (k,v) -> v == 1 ? null : v - 1);
                    kindCounts.compute(newKind.kind, (k,v) -> v == null ? 1 : v + 1);
                    chosen.offer(newKind);
                    max = Math.max(max, satis + kindCounts.size() * kindCounts.size());
                }
            }
            System.out.println(max);

        }
    }

    static class Pair {
        final int kind;
        final long point;

        Pair(int kind, long point) {
            this.kind = kind;
            this.point = point;
        }
    }

}
