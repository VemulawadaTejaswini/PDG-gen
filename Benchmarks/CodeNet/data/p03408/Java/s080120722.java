import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {

    int N,M;
    String[] s,t;

    private void solve() {
        N = nextInt();
        s = new String[N];
        for(int i = 0;i < N;i++) {
            s[i] = next();
        }

        M = nextInt();
        t = new String[M];
        for(int i = 0;i < M;i++) {
            t[i] = next();
        }

        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i < N;i++) {
            if (map.containsKey(s[i])) {
                map.put(s[i],map.get(s[i]) + 1);
            } else {
                map.put(s[i],1);
            }
        }

        for(int i = 0;i < M;i++) {
            if (map.containsKey(t[i])) {
                map.put(t[i],map.get(t[i]) - 1);
            } else {
                map.put(t[i], -1);
            }
        }

        int ans = 0;
        for(String st : map.keySet()) {
            if (map.get(st) > 0 && map.get(st) > ans) {
                ans = map.get(st);
            }
        }

        out.println(ans);

    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}