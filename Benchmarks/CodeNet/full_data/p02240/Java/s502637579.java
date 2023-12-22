
import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        AOJ problem = new AOJ(sc);
        problem.solve(out);

        out.flush();
    }

}

class AOJ {

    final int N, M, Q;
    List<List<Integer>> list;
    int[] s, t, group;

    AOJ(FastScanner sc) {
        N = sc.nextInt();
        M = sc.nextInt();
        list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }
        Q = sc.nextInt();
        s = new int[Q];
        t = new int[Q];
        for (int i = 0; i < Q; i++) {
            s[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
        group = new int[N];
    }

    void solve(PrintWriter out) {
        groupingOfUsers();
        for (int i = 0; i < Q; i++) {
            out.println(group[s[i]] == group[t[i]] ? "yes" : "no");
        }
    }

    void groupingOfUsers() {
        int number = 1;
        for (int i = 0; i < N; i++) {
            if (group[i] == 0) {
                bfs(i, number);
                number++;
            }
        }
    }

    void bfs(int first_user, int number) {
        Deque<Integer> queue = new ArrayDeque<>();
        group[first_user] = number;
        queue.addLast(first_user);
        while (!queue.isEmpty()) {
            int this_user = queue.removeFirst();
            for (int i = 0; i < list.get(this_user).size(); i++) {
                int next_user = list.get(this_user).get(i);
                if (group[next_user] != 0) continue;
                group[next_user] = number;
                queue.addLast(next_user);
            }
        }
    }
}

// https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
class FastScanner {

    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

