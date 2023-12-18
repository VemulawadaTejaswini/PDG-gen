import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IO {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String[] buffers = new String[1];
    private static int cur=1;

    static BufferedReader getBr() {
        return br;
    }

    static String next() {
        String res = null;
        try {
            res = br.readLine();
            cur = buffers.length;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    static int nextInt() {
        if(buffers.length == cur) {
            buffers = next().split(" ");
            cur = 0;
        }
        return Integer.parseInt(buffers[cur++]);
    }

    static long nextLong() {
        if(buffers.length == cur) {
            buffers = next().split(" ");
            cur = 0;
        }
        return Long.parseLong(buffers[cur++]);
    }

    static double nextDouble() {
        if(buffers.length == cur) {
            buffers = next().split(" ");
            cur = 0;
        }
        return Double.parseDouble(buffers[cur++]);
    }

    static void out(Object... obj) {
        StringBuilder sb = new StringBuilder();
        for(Object o:obj) {
            sb.append(o);
        }
        System.out.println(sb);
    }

    static void outs(Object... obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj[0]);
        for(int i=1; i<obj.length; i++) {
            sb.append(" ").append(obj[i]);
        }
        System.out.println(sb);
    }
}

class PList<E extends Comparable> extends ArrayList<E> {

    PList() {
        super();
    }

    PList(Collection<? extends E> c) {
        super(c);
    }

    PList(int initialCapacity) {
        super(initialCapacity);
    }

    boolean next_permutation() {
        if (this.size() <= 1) return false;

        int i = this.size() -1;
        for (;;) {
            int ii = i;
            i--;
            if (this.get(i).compareTo(this.get(ii)) < 0) {
                int j = this.size();
                while (this.get(i).compareTo(this.get(--j)) >= 0) {}

                E tmp = this.get(i); this.set(i, get(j)); this.set(j, tmp);

                Collections.reverse(this.subList(ii, this.size()));
                return true;
            }
            if (i == 0) {
                Collections.reverse(this);
                return false;
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        int N=IO.nextInt(), M=IO.nextInt(), R=IO.nextInt();
        PList<Integer> r = new PList<Integer>(R);
        for (int i = 0; i < R; i++) {
            r.add(IO.nextInt());
        }

        Integer[][] cost = new Integer[N+1][N+1];
        for (int i = 0; i < N + 1; i++) {
            Arrays.fill(cost[i], Integer.MAX_VALUE);
        }

        for (int i = 0; i < M; i++) {
            int A = IO.nextInt();
            int B = IO.nextInt();
            int C = IO.nextInt();
            cost[A][B] = cost[B][A] = C;
        }

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                for (int k = 1; k < N+1; k++) {
                    if (cost[i][j]!=Integer.MAX_VALUE && cost[j][k]!=Integer.MAX_VALUE) {
                        cost[i][k] = Math.min(cost[i][k], cost[i][j]+cost[j][k]);
                    }
                }
            }
        }

        long ans = Long.MAX_VALUE;
        while(true) {
            long p_ans = 0;
            for (int i = 1; i < R; i++) {
                p_ans += cost[r.get(i-1)][r.get(i)];
            }
            ans = Math.min(ans, p_ans);

            if(!r.next_permutation()) break;
        }

//        for (int i = 0; i < N + 1; i++) {
//            IO.out(Arrays.deepToString(cost[i]));
//        }

        IO.out(ans);
    }
}


