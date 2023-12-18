import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();

        ArrayList<Integer>[] edge = new ArrayList[N];
        Arrays.setAll(edge, i -> new ArrayList<>());
        for (int i = 1; i < N; i++) {
            int a = in.i() - 1;
            int b = in.i() - 1;
            edge[a].add(b);
            edge[b].add(a);
        }

        int[] c = in.ii(N);
        Arrays.sort(c);

        IntQueue q = new IntQueue(N);
        q.push(0);

        int[] d = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            int v = q.pop();
            d[v] = c[i];
            for (int u : edge[v]) {
                if (d[u] == 0) {
                    q.push(u);
                }
            }
        }

        long M = 0;
        for (int i = 0; i < N - 1; i++) {
            M += c[i];
        }

        StringBuilder sb = new StringBuilder();
        sb.append(M).append('\n');
        for (int i = 0 ; i < N; i++) {
            sb.append(d[i]).append(' ');
        }
        System.out.println(sb);
    }
}

class IntQueue {
    final int MAX;
    int[] array;
    int head = 0;
    int tail = 0;
    int count = 0;

    IntQueue(int N) {
        MAX = N;
        array = new int[N];
    }

    void push(int n) {
        array[tail] = n;
        if (++tail == MAX) tail = 0;
        count++;
    }

     int pop() {
        int n = array[head];
        if (++head == MAX) head = 0;
        count--;
        return n;
    }

    boolean isEmpty() {
        return count == 0;
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            head = 0;
        }
        return cbuf[head++];
    }

    int i() {
        int k = next() - '0';
        boolean minus = k == -3;
        int n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        int k = next() - '0';
        boolean minus = k == -3;
        long n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    char[] s(final int N) {
        char[] s = new char[N];
        for (int i = 0; i < N; i++) {
            s[i] = next();
        }
        next();
        return s;
    }

    public int read(char[] cbuf) {
        int i;
        char c;
        for (i = 0; (c = next()) != ' ' && c != '\n'; i++) cbuf[i] = c;
        return i;
    }

    public String readLine() {
        try {
            return super.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
