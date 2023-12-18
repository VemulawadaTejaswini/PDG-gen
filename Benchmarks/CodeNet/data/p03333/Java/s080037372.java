import java.util.TreeSet;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.IOException;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author ilyakor
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
}

class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        TreeSet<ii> R = new TreeSet<>();
        TreeSet<ii> L = new TreeSet<>();
        int n = in.nextInt();
        ii[] segs = new ii[n];
        for (int i = 0; i < n; ++i) {
            int l = in.nextInt();
            int r = in.nextInt();
            segs[i] = new ii(l, r);
            L.add(new ii(l, i));
            R.add(new ii(r, i));
        }
        long res = 0;
        int pos = 0;
        for (int i = 0; i < n; ++i) {
            int ind = -1;
            int val = -1;
            if (!L.isEmpty()) {
                ii last = L.last();
                if (last.first >= pos) {
                    if (last.first - pos > val) {
                        val = last.first - pos;
                        ind = 0;
                    }
                }
            }
            if (!R.isEmpty()) {
                ii first = R.first();
                if (first.first <= pos) {
                    if (pos - first.first > val) {
                        val = pos - first.first;
                        ind = 1;
                    }
                }
            }
            if (ind == -1) break;
            res += val;
            pos = ind == 0 ? L.last().first : R.first().first;
            int id = ind == 0 ? L.last().second : R.first().second;
            L.remove(new ii(segs[id].first, id));
            R.remove(new ii(segs[id].second, id));
        }
        res += Math.abs(pos);
        out.printLine(res);
    }
}

class InputReader {
    private InputStream stream;
    private byte[] buffer = new byte[10000];
    private int cur;
    private int count;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public static boolean isSpace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public int read() {
        if (count == -1) {
            throw new InputMismatchException();
        }
        try {
            if (cur >= count) {
                cur = 0;
                count = stream.read(buffer);
                if (count <= 0)
                    return -1;
            }
        } catch (IOException e) {
            throw new InputMismatchException();
        }
        return buffer[cur++];
    }

    public int readSkipSpace() {
        int c;
        do {
            c = read();
        } while (isSpace(c));
        return c;
    }

    public int nextInt() {
        int sgn = 1;
        int c = readSkipSpace();
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res = res * 10 + c - '0';
            c = read();
        } while (!isSpace(c));
        res *= sgn;
        return res;
    }

}

class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(objects[i]);
        }
    }

    public void printLine(Object... objects) {
        print(objects);
        writer.println();
    }

    public void close() {
        writer.close();
    }

}

class ii implements Comparable<ii> {
    public int first;
    public int second;

    public ii(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ii ii = (ii) o;

        if (first != ii.first) return false;
        if (second != ii.second) return false;

        return true;
    }

    public int hashCode() {
        int result = first;
        result = 31 * result + second;
        return result;
    }

    public int compareTo(ii o) {
        if (first != o.first) {
            return first < o.first ? -1 : 1;
        }
        if (second != o.second) {
            return second < o.second ? -1 : 1;
        }
        return 0;
    }

    public String toString() {
        return "{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

