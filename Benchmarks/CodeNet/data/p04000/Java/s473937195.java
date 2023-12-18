import java.util.*;

public class Main {

    private static int H;
    private static int W;
    private static int N;
    private static Cord[] C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        N = sc.nextInt();
        C = new Cord[N];
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            C[i] = new Cord(b, a);
        }

        long[] ans = solve();
        for (int i = 0; i < 10; i++) {
            System.out.println( ans[i] );
        }
    }


    private static long[] solve() {

        Map<Cord, Integer> counts = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Cord target = C[i];
            count(target, counts);
        }

        long[] ans = new long[10];
        ans[0] = (long)(W-2) * (H-2);

        counts.forEach( (c, cnt) -> {
            ans[cnt]++;
            ans[0]--;
        });

        return ans;
    }

    private static void count(Cord target, Map<Cord, Integer> counts) {
        for (int x = target.x - 1; x <= target.x + 1 ; x++) {
            for (int y = target.y - 1; y <= target.y+ 1 ; y++) {
                if( x - 1 < 1 || x + 1 > W || y - 1 < 1 || y + 1 > H) continue;

                Cord c = new Cord(x, y);

                if( counts.containsKey(c) ) {
                    int cnt = counts.get(c);
                    counts.put(c, cnt+1);
                } else {
                    counts.put(c, 1);
                }
            }
        }
    }

    private static boolean xInRange(int x) {
        return 1 <= x && x <= W;
    }

    private static boolean yInRange(int y) {
        return 1 <= y && y <= H;
    }

    private static class Cord {

        private final int x;
        private final int y;

        public Cord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cord cord = (Cord) o;
            return x == cord.x &&
                    y == cord.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        public String toString() {
            return "(" +x + "," + y + ")";
        }
    }
}