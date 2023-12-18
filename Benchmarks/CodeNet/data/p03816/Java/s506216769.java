import java.util.*;

public class Main {

    private static int N;
    private static int A[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(solve());
    }

    static long solve() {

        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int a = A[i];
            Integer n = counter.get(a);
            //noinspection Java8MapApi
            if( n != null ) {
                counter.put(a, n + 1);
            } else {
                counter.put(a, 1);
            }
        }

        List<Pair> ps = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            ps.add(new Pair(entry.getKey(), entry.getValue()));
        }

        Comparator<Pair> c = Comparator.comparingInt(p -> p.n);
        ps.sort(c.reversed());

        int ans = N;

        int size = ps.size();
        for (int i = 0; i < size; i++) {
            Pair p = ps.get(i);
            if( p.n <= 1 ) continue;

            if( p.n >= 3 ) {
                int r = p.n - 2;
                if( r % 2 == 0 ) { // 4, 6
                    ans -= r;
                    p.n = 2;
                } else { // 3, 5...
                    ans -= r+1;
                    p.n = 1;
                }
            }

            if( p.n == 2 ) {
                // 周囲を食べる
                // 次を食えるようなら次を食べる
                if( i != size-1 ) {
                    ps.get(i+1).n -= 1;
                }
                p.n = 1;
                ans -= 2;
            }
        }

        return ans;
    }

    private static class Pair {
        private final int a;
        private int n;

        public Pair(int a, int n) {
            this.a = a;
            this.n = n;
        }
    }
}
