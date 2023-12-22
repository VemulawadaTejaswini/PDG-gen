import java.io.*;
import java.util.*;

public class Main {
    void run() {
        try {
            char[] init = {0, 1, 2, 3, 4, 5, 6, 7};
            HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
            d.put(hash(init), 0);
            Queue<char[]> que = new ArrayDeque<char[]>();
            que.add(init);
            char[][] swap = {{1, 4}, {0, 2, 5}, {1, 3, 6}, {2, 7}, {0, 5}, {1, 4, 6}, {2, 5, 7}, {3, 6}};
            while (!que.isEmpty()) {
                int zeroPos = -1;
                char[] cur = que.poll();

                for (int i = 0; i < 8; i++) {
                    if (cur[i] == 0) {
                        zeroPos = i;
                    }
                }

                for (int i = 0; i < swap[zeroPos].length; i++) {
                    int swapPos = swap[zeroPos][i];
                    char[] next = cur.clone();
                    char t = next[zeroPos];
                    next[zeroPos] = next[swapPos];
                    next[swapPos] = t;

                    if (!d.containsKey(hash(next))) {
                        d.put(hash(next), d.get(hash(cur)) + 1);
                        que.add(next);
                    }
                }
            }

            for (String line; (line = in.readLine()) != null; ) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                char[] target = new char[8];
                for (int i = 0; i < 8; i++) {
                    target[i] = (char)Integer.parseInt(tokenizer.nextToken());
                }

                sysout.println(d.get(hash(target)));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    int hash(char[] ary) {
        int ret = 0;
        for(int i = 0; i < ary.length; i++) {
            ret *= 10;
            ret += ary[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}