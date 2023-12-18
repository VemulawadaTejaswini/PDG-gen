package net.kubusgol;

import net.kubusgol.InputReader;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class IceRinkGame {
    int maxN, minN;
    int[] A;
    Set<State> cache;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int K = in.nextInt();
        A = new int[K];
        for (int i = 0; i < K; i++) {
            A[i] = in.nextInt();
        }
        minN = Integer.MAX_VALUE;
        maxN = Integer.MIN_VALUE;

        if (A[K - 1] != 2) {
            out.println(-1);
            return;
        }
        cache = new HashSet<>();
        find(K - 1, A[K - 1]);

        if (minN == Integer.MAX_VALUE) {
            out.println(-1);
        } else {
            out.println(minN + " " + maxN);
        }
    }

    private void find(int idx, int N) {
        if (cache.contains(new State(idx, N))) return;
        if (idx == 0) {
            maxN = Math.max(maxN, N + A[idx] - 1);
            minN = Math.min(minN, N);
        } else {
//            long start = N - (N % A[idx - 1]);
            int start = ((N + A[idx - 1] - 1) / A[idx - 1]) * A[idx - 1];
            int end = N + A[idx];
            for (int nn = start; nn < end; nn += A[idx - 1]) {
                find(idx - 1, nn);
            }
        }

        cache.add(new State(idx, N));
    }

    static class State implements Comparable<State> {
        int idx;
        int N;

        public State(int idx, int N) {
            this.idx = idx;
            this.N = N;
        }

        @Override
        public int compareTo(State o) {
            if (this.N == o.N) {
                return Integer.compare(this.idx, o.idx);
            }
            return Integer.compare(this.N, o.N);
        }
    }
}
