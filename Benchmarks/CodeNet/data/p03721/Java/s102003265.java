import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        Pair[] P = new Pair[N];
        for (int i = 0; i < N; i++) {
            P[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        System.out.println( solve(N, K, P) );
    }

    private static int solve(int N, long K, Pair[] P) {
        Arrays.sort(P, Comparator.comparingInt(p -> p.a));

        long current = 0;
        for (Pair p : P) {
            current += p.b;
            if( current >= K ) {
                return p.a;
            }
        }
        throw new RuntimeException("wtf");
    }

    private static class Pair {
        private final int a;
        private final int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
