import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Combination {
    long[] fact;
    long[] ifact;
    long M;

    private long mpow(long x, long n) {
        long ans = 1;
        while (n != 0) {
            if ((n & 1) == 1) ans = ans * x % M;
            x = x * x % M;
            n = n >> 1;
        }
        return ans;
    }

    private long inv(long x) {
        return mpow(x, M - 2);
    }

    public Combination(int n, long M) {
        assert n < M;
        this.M = M;
        fact = new long[n + 1];
        ifact = new long[n + 1];

        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; ++i) fact[i] = (fact[i-1]*i) % M;
        ifact[n] = inv(fact[n]);
        for (int i = n; i >= 1; --i) ifact[i-1] = ifact[i]*i % M;
    }

    public long c(int n, int k) {
        if (k < 0 || k > n) return 0;
        return ((fact[n]*ifact[k] % M)*ifact[n-k] % M);
    }
}



class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] cnt = new int[200005];
        for (int i = 0; i < N; i++) {
            cnt[A[i]]++;
        }

        Combination combi = new Combination(200005, 9999991);

        long sum = 0;
        for (int i = 0; i < 200005; i++) {
            if (cnt[i] > 1) {
                sum+=combi.c(cnt[i], 2);
            }
        }

        for (int k = 0; k < N; k++) {
            // k: bannded index
            int b = A[k];
            long prev = 0;
            long cur = 0;
            if (cnt[b] > 1) prev = combi.c(cnt[b], 2);
            sum-=prev;
            cnt[b]--;
            if (cnt[b] > 1) cur = combi.c(cnt[b], 2);
            sum+=cur;
            System.out.println(sum);
            sum-=cur;
            cnt[b]++;
            sum+=prev;
        }

        return;
    }

}
