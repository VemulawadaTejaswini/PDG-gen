import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();
        int A = sc.nextInt();

        int[] X = new int[N];
        int[] H = new int[N];
        for (int i=0; i<N; i++) {
            X[i] = sc.nextInt();
            H[i] = sc.nextInt();
        }

        System.out.println(solve(N, D, A, X, H));
    }

    private static long solve(int N, int D, int A, int[] X, int[] H) {
        long count = 0;
        long current = 0;
        List<Pair> bomb = new LinkedList<>();

        List<Pair> monster = new ArrayList();
        for (int i=0; i<N; i++) {
            monster.add(new Pair(X[i], H[i]));
        }
        Collections.sort(monster, new PairComparator().reversed());

        for (int i=0; i<N; i++) {
            Pair m = monster.get(i);
            // System.err.println("m = (" + m.x + ", " + m.h + ")");

            while (bomb.size() > 0) {
                Pair b = bomb.get(0);
                if (b.x < m.x - D) {
                    current -= b.h;
                    bomb.remove(0);
                    // System.err.println("end of bomb range at " + (b.x) + " < " + m.x);
                } else {
                    // System.err.println(b.x + " >= " + (m.x-D));
                    break;
                }
            }

            if (m.h > current*A) {
                long n =  (m.h - current*A) / A;
                if ((m.h-current*A)%A != 0) {
                    n++;
                }
                bomb.add(new Pair(m.x + D, n));
                current += n;
                count += n;

                // System.err.println("add " + n + " bomb at " + (m.x + D));
            }
        }

        return count;
    }


    static class Pair {
        int x;
        long h;

        public Pair(int x, long h) {
            this.x = x;
            this.h = h;
        }
    }

    static class PairComparator implements Comparator {
        public int compare(Object a0, Object b0) {
            Pair a = (Pair)a0;
            Pair b = (Pair)b0;

            return b.x - a.x;
        }
    }

}