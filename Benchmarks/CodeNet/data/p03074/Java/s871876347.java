import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int K = in.i();
        char[] S = in.s(N);
        IntQueue q = new IntQueue(N + 2);
        int count = 0;
        char mode = '1';
        for (int i = 0; i < N; i++) {
            if (mode != S[i]) {
                q.push(count);
                count = 0;
                mode = S[i];
            }
            count++;
        }
        q.push(count);
        if (mode == '0') {
            q.push(0);
        }

        int ans = 0;
        IntQueue q2 = new IntQueue(2 * K + 1);
        for (int i = 0; i < 2 * K + 1; i++) {
            if (q.isEmpty()) {
                break;
            }
            int n = q.pop();
            ans += n;
            q2.push(n);
        }
        int t = ans;
        while (!q.isEmpty()) {
            int z1 = q.pop();
            int o1 = q.pop();
            int o2 = q2.pop();
            int z2 = q2.pop();
            t += z1 + o1 - o2 - z2;
            ans = Math.max(ans, t);
            q2.push(z2);
            q2.push(o2);
        }

        out.println(ans);
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

    int popLast() {
        if (tail-- == 0) tail = MAX - 1;
        int n = array[tail];
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
                tail = read(cbuf, 0, cbuf.length);
            } catch (IOException e) {}
                head = 0;
            }
            return cbuf[head++];
        }

        void back() {
            head--;
        }

        boolean minus() {
            boolean minus;
            while (true) {
                char c = next();
                if (c != ' ' && c != '\n' && c != '\r') {
                    if (!(minus = c == '-')) back();
                    return minus;
                }
            }
        }

        void skip() {
            while (true) {
                char c = next();
                if (c != ' ' && c != '\n' && c != '\r') {
                    back();
                    break;
                }
            }
        }

        char[] s(final int N) {
            skip();
            char[] s = new char[N];
            for (int i = 0; i < s.length; i++) {
                s[i] = next();
            }
            return s;
        }

        String s() {
            try {
                return readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        int i() {
            boolean minus = minus();
            int n = 0;
            while (true) {
                int k = next() - '0';
                if (k < 0 || 9 < k) break;
                n = 10 * n + k;
            }
            return minus ? -n : n;
        }

        int[] ii(final int N) {
            int[] a = new int[N];
            for (int j = 0; j < a.length; j++) a[j] = i();
            return a;
        }

        long l() {
            boolean minus = minus();
            long n = 0;
            while (true) {
                int k = next() - '0';
                if (k < 0 || 9 < k) break;
                n = 10 * n + k;
            }
            return minus ? -n : n;
        }
    }
