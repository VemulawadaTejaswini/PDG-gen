/**
 * @author derrick20
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        value = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                value[i][j] = sc.nextInt();
            }
        }
        groupVal = new long[1 << N];
        for (int mask = 1; mask < (1 << N); mask++) {
            long total = 0;
            for (int u = 0; u < N; u++) {
                int b1 = 1 << u;
                if ((b1 & mask) > 0) {
                    for (int v = u; v < N; v++) {
                        int b2 = 1 << v;
                        if ((b2 & mask) > 0) {
                            total += value[u][v];
                        }
                    }
                }
            }
            groupVal[mask] = total;
        }
        long[] DP = new long[1 << N];
        // 1101001
        // 1101000
        // 1100111 -> 1100000
        // 1011111 -> 1001001
        for (int curr = 1; curr < 1 << N; curr++) {
            DP[curr] = groupVal[curr];
            for (int prev = curr; prev >= 1; prev = (prev - 1) & curr) {
                DP[curr] = Math.max(DP[curr], DP[prev] + groupVal[curr ^ prev]);
            }
        }
        out.println(DP[(1 << N) - 1]);
//        dp = new HashMap<>();
        // start with
//        long best = solve((1 << N) - 1, 0);
//        out.println(best);
        out.close();
    }

    static HashMap<Integer, Long> dp;
    static int[][] value;
    static long[] groupVal;

    static long solve(int curr, int group) {
        if (curr == 0) {
            return groupVal[group];
        }
        else if (dp.containsKey(curr)) {
            return dp.get(curr);
        }
        else {
            long ans = 0;
            for (int pos = 0; (1 << pos) <= curr; pos++) {
                int bit = 1 << pos;
                if ((curr & bit) > 0) {
                    int prev = curr ^ bit;
                    // At this point, we can either end the group, or start a new one
                    // we basically transfer something from curr state to the group

                    // we can then go down and either keep building the group, or reset to 0
                    System.out.println(group + " " + bit);
                    long expand = solve(prev, group ^ bit);
                    long split = solve(prev, 0) + groupVal[group];
                    ans = Math.max(ans, Math.max(expand, split));
                }
            }
            System.out.println("States: " + curr + " Group: " + group + " Ans: " + ans);
            dp.put(curr, ans);
            return ans;
        }
    }

    /*
    States: 8 Group: 7 Ans: 6
    States: 4 Group: 11 Ans: 6
    States: 12 Group: 3 Ans: 7
    States: 2 Group: 13 Ans: 6
    States: 10 Group: 5 Ans: 7
    States: 6 Group: 9 Ans: 7
    States: 14 Group: 1 Ans: 7
    States: 1 Group: 14 Ans: 6
    States: 9 Group: 6 Ans: 7
    States: 5 Group: 10 Ans: 7
    States: 13 Group: 2 Ans: 7
    States: 3 Group: 12 Ans: 7
    States: 11 Group: 4 Ans: 7
    States: 7 Group: 8 Ans: 7
    States: 15 Group: 0 Ans: 7
     */
    static class FastScanner {
        public int BS = 1 << 16;
        public char NC = (char) 0;
        byte[] buf = new byte[BS];
        int bId = 0, size = 0;
        char c = NC;
        double cnt = 1;
        BufferedInputStream in;

        public FastScanner() {
            in = new BufferedInputStream(System.in, BS);
        }

        public FastScanner(String s) {
            try {
                in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
            } catch (Exception e) {
                in = new BufferedInputStream(System.in, BS);
            }
        }

        private char getChar() {
            while (bId == size) {
                try {
                    size = in.read(buf);
                } catch (Exception e) {
                    return NC;
                }
                if (size == -1) return NC;
                bId = 0;
            }
            return (char) buf[bId++];
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            cnt = 1;
            boolean neg = false;
            if (c == NC) c = getChar();
            for (; (c < '0' || c > '9'); c = getChar()) {
                if (c == '-') neg = true;
            }
            long res = 0;
            for (; c >= '0' && c <= '9'; c = getChar()) {
                res = (res << 3) + (res << 1) + c - '0';
                cnt *= 10;
            }
            return neg ? -res : res;
        }

        public double nextDouble() {
            double cur = nextLong();
            return c != '.' ? cur : cur + nextLong() / cnt;
        }

        public String next() {
            StringBuilder res = new StringBuilder();
            while (c <= 32) c = getChar();
            while (c > 32) {
                res.append(c);
                c = getChar();
            }
            return res.toString();
        }

        public String nextLine() {
            StringBuilder res = new StringBuilder();
            while (c <= 32) c = getChar();
            while (c != '\n') {
                res.append(c);
                c = getChar();
            }
            return res.toString();
        }

        public boolean hasNext() {
            if (c > 32) return true;
            while (true) {
                c = getChar();
                if (c == NC) return false;
                else if (c > 32) return true;
            }
        }
    }
}