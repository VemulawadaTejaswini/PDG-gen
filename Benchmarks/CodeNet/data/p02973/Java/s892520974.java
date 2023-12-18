import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        IntStack stack = new IntStack(N);
        stack.push(in.i());
        for(int i = 1; i < N; i++){
            int k = in.i();
            int j = binarySearch(stack, k);
            if (j == -1) {
                stack.push(k);
            } else {
                stack.array[j] = k;
            }
        }
        out.println(stack.size());
    }

    static int binarySearch(IntStack stack, int key){
        int l = 0;
        int r = stack.size() - 1;
        int[] a = stack.array;
        while (l < r) {
            int m = (l + r) / 2;
            int x = a[m];
            if (key <= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (a[r] >= key) {
            r--;
        }
        return r;
    }
}

class IntStack {
    final int MAX;
    int[] array;
    int head = 0;

    IntStack(int N) {
        MAX = N;
        array = new int[N];
    }

    void push(int n) {
        array[head++] = n;
    }

     int pop() {
        return array[--head];
    }

    boolean isEmpty() {
        return head == 0;
    }

    int size() {
        return head;
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
