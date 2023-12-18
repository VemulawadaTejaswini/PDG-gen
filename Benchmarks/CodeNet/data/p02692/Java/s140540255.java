import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    long[] abc;
    void solve() {
        int n = in.nextInt();
        abc = new long[] {in.nextLong(), in.nextLong(), in.nextLong()};
        long[] abc2 = {abc[0], abc[1], abc[2]};
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            String o = in.next();
            s[i] = o.equals("AB") ? 0 : o.equals("AC") ? 1 : 2;
        }
        if (abc[0] + abc[1] + abc[2] == 2) {
            throw new RuntimeException();
        }
        int[] d = {0, 0, 0};
        int[] ans = new int[n];
        int point = 0;
        for (int i = 0; i < n; i++) {
            int first = s[i] == 2 ? 1 : 0;
            int second = s[i] == 0 ? 1 : 2;
            if (d[first] == -1) {
                ans[i] = first;
            } else if (d[second] == -1) {
                ans[i] = second;
            } else if (d[first] == 1) {
                ans[i] = second;
            } else if (d[second] == 1) {
                ans[i] = first;
            } else if (abc[first] < abc[second]) {
                ans[i] = first;
            } else {
                ans[i] = second;
            }
            if (ans[i] == first) {
                abc[first]++;
                abc[second]--;
                d[first]++;
                d[second]--;
            } else {
                abc[second]++;
                abc[first]--;
                d[second]++;
                d[first]--;
            }
            if (abc[0] < 0 || abc[1] < 0 || abc[2] < 0) {
                if (point == -1) {
                    out.println("No");
                    return;
                }
                for (int j = point; j < i; j++) {
                    ans[j] = ans[j] == first(s[j]) ? second(s[j]) : first(s[j]);
                }
                for (int j = 0; j < 3; j++) {
                    if (d[j] == -1) {
                        abc[j] += 2;
                    } else if (d[j] == 1) {
                        abc[j] -= 2;
                    }
                    d[j] *= -1;
                }
                point = -1;
            }
            if (d[0] == 0 && d[1] == 0 && d[2] == 0) {
                point = i;
            }
        }
        for (int i = 0; i < n; i++) {
            abc2[ans[i]]++;
            abc2[first(s[i]) == ans[i] ? second(s[i]) : first(s[i])]--;
            if (abc2[0] < 0 || abc2[1] < 0 || abc2[2] < 0) {
                out.println("No");
                return;
            }
        }
        out.println("Yes");
        for (int i = 0; i < n; i++) {
            out.println("ABC".charAt(ans[i]));
        }
    }

    int first(int s) {
        return s == 2 ? 1 : 0;
    }

    int second(int s) {
        return s == 0 ? 1 : 2;
    }

    int[] g(int a, int b) {
        int[] ans = new int[2];
        if (a == 0) {
            ans[0] = b == 1 ? 0 : 1;
            ans[1] = b == 1 ? 2 : 2;
        } else if (a == 1) {
            ans[0] = b == 0 ? 0 : 2;
            ans[1] = b == 0 ? 1 : 1;
        } else {
            ans[0] = b == 0 ? 1 : 2;
            ans[1] = b == 0 ? 0 : 0;
        }
        return ans;
    }

    int f(int a, int b) {
        return 3 - a - b;
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
