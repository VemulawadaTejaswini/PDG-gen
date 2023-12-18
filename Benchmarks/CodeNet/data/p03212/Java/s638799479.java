import lib.io.ExtendedScanner;
import lib.io.FastPrintStream;

public class Main {
    public static void main(String[] args) throws Exception {
        ExtendedScanner sc = new ExtendedScanner();
        FastPrintStream pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    static int[] stack = new int[10];
    static int ptr = 0;
    static int n;

    public static void solve(ExtendedScanner sc, FastPrintStream pw) {
        n = sc.nextInt();
        pw.println(dfs());
    }

    public static int dfs() {
        if (ptr == 10) return 0;
        int s = 0;
        int sum = 0;
        boolean b7 = false, b5 = false, b3 = false;
        for (int i = ptr - 1; i >= 0; i--) {
            sum = sum * 10 + stack[i];
            b7 |= stack[i] == 7;
            b5 |= stack[i] == 5;
            b3 |= stack[i] == 3;
        }
        if (1 <= sum && sum <= n && b3 && b5 && b7) s++;
        stack[ptr++] = 7;
        s += dfs();
        --ptr;
        stack[ptr++] = 5;
        s += dfs();
        --ptr;
        stack[ptr++] = 3;
        s += dfs();
        --ptr;
        return s;
    }
}
