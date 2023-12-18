
import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

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
    
    final int N;
    List<Integer> P, Q;
    int cnt, a, b;
    
    AtCoder(FastScanner sc) {
        N = sc.nextInt();
        P = IntStream.range(0, N).map(i -> sc.nextInt()).boxed().collect(Collectors.toList());
        Q = IntStream.range(0, N).map(i -> sc.nextInt()).boxed().collect(Collectors.toList());
        cnt = 0;
        a = 0;
        b = 0;
    }
    
    void solve(PrintWriter out) {
        List<Integer> A = new ArrayList<>();
        dfs(A);
        out.println(Math.abs(a - b));
    }
    
    void dfs(List<Integer> A) {
        if (A.size() == N) {
            cnt++;
            if (A.equals(P)) {
                a = cnt;
            }
            if (A.equals(Q)) {
                b = cnt;
            }
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!A.contains(i)) {
                A.add(i);
                dfs(A);
                A.remove(A.size() - 1);
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
