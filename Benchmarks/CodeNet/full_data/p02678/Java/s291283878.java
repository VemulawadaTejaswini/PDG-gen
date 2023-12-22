
import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        AtCoder problem = new AtCoder(sc);
        problem.solve(out);

        out.flush();
    }

}

class AtCoder {

    final int N, M;
    int[] dist, room;
    Map<Integer, List<Integer>> map;

    AtCoder(FastScanner sc) {
        N = sc.nextInt();
        M = sc.nextInt();
        dist = IntStream.range(0, N).map(i -> Integer.MAX_VALUE).toArray();
        room = new int[N];
        map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            List<Integer> list = new ArrayList<>();
            map.put(i, list);
        }
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            List<Integer> V = map.get(u);
            V.add(v);
            map.put(u, V);
            List<Integer> U = map.get(v);
            U.add(u);
            map.put(v, U);
        }
    }

    void solve(PrintWriter out) {
        Deque<Integer> Q = new ArrayDeque<>();
        dist[0] = 0;
        Q.addLast(0);
        while (!Q.isEmpty()) {
            int i = Q.removeFirst();
            for (int j = 0; j < map.get(i).size(); j++) {
                int k = map.get(i).get(j);
                if (dist[i] + 1 < dist[k]) {
                    dist[k] = dist[i] + 1;
                    room[k] = i;
                    Q.addLast(k);
                }
            }
        }
//        printMap();
        out.println("Yes");
        for (int i = 1; i < N; i++) {
            out.println(room[i] + 1);
        }
    }

    void printMap() {
        Set<Map.Entry<Integer, List<Integer>>> set = map.entrySet();
        for (Map.Entry<Integer, List<Integer>> s : set) {
            System.out.println(s.getKey() + " " + s.getValue());
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
