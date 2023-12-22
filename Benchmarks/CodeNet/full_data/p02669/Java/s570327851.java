import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null,new Main(), "" ,Runtime.getRuntime().maxMemory()).start();
    }

    // メイン処理
    public void run() {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        long[] n = new long[t];
        int[] a = new int[t];
        int[] b = new int[t];
        int[] c = new int[t];
        int[] d = new int[t];
        for(int i = 0;i < t;i++) {
            n[i] = sc.nextLong();
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        PrintWriter out =  new PrintWriter(System.out);
        for(int i = 0;i < t;i++) out.println(search(n[i], a[i], b[i], c[i], d[i], new HashMap<>()));
        out.flush();
    }

    long search(long n, int a, int b , int c, int d, Map<Long, Long> memo) {
        if(memo.containsKey(Long.valueOf(n))) return memo.get(Long.valueOf(n)).longValue();
        if(n == 1) return d;
        
        long minCost = Long.MAX_VALUE;
        // n回-1を実行した場合のコストを算出。longのMAXを超える場合はとりあえずLong.maxvalueのままにしとく。どうせ他の小さい値に上書きされるからこれでOK、メイビー
        // これがないと全部dつかえばいいみたいなパターンに対応できない。このパターンと↓のパターンの2つを考えれば良さげ。
        if(n < Long.MAX_VALUE / d) minCost = n * d;
        
        // nが2か3か5で割り切れる場合は割る。割れない場合はnから一番近いものまで1を足してから割る。
        // 数時間考えた結果、2番目、3番目、、、、に近いものから到達できる数字には、1番目に近いものからより低コストで同じ数字に到達できるため考える必要がない。
        if(n % 2 == 0) minCost = Long.min(minCost, search(n / 2, a, b, c, d, memo) + a);
        else if(n >= 2) minCost = Long.min(minCost, Long.min(search(n - 1, a, b, c, d, memo) + d, search(n + 1, a, b, c, d, memo) + d));

        if(n % 3 == 0) minCost = Long.min(minCost, search(n / 3, a, b, c, d, memo) + b);
        else if(n >= 3) minCost = Long.min(minCost, Long.min(search(n / 3, a, b, c, d, memo) + Math.abs(((n / 3) * 3) - n) * d + b, search((n / 3) + 1, a, b, c, d, memo) + Math.abs((((n / 3) + 1) * 3) - n) * d + b)); 
        
        if(n % 5 == 0) minCost = Long.min(minCost, search(n / 5, a, b, c, d, memo) + c);
        else if(n >= 5) minCost = Long.min(minCost, Long.min(search(n / 5, a, b, c, d, memo) + Math.abs(((n / 5) * 5) - n) * d + c, search((n / 5) + 1, a, b, c, d, memo) + Math.abs((((n / 5) + 1) * 5) - n) * d + c));
      
        memo.put(Long.valueOf(n), Long.valueOf(minCost));
        
        return minCost;
    }

    // 以下、ユーティリティ
    long nCm(long n, long m) {
        if(n < m) return 0l;
        long c = 1l;
        m = (n - m < m ? n - m : m);
        for(long ns = n - m + 1, ms = 1;ms <= m;ns ++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }

    long modnCm(int n, int m, int mod) {
        if(n < m) return 0l;
        long upper = 1l;
        long downer = 1l;
        m = (n - m < m ? n - m : m);
        for(long ns = n - m + 1, ms = 1;ms <= m;ns ++, ms++) {
            upper = upper * ns % mod;
            downer = downer * ms % mod;
        }
        return upper * modInv(downer, mod) % mod;
    }

    // mod m での a の逆元 を計算する
    long modInv(long a, long m) {
        long b = m, u = 1, v = 0;
        while(b > 0) {
            long t = a / b;
            a -= t * b;
            long tmp = a;
            a = b;
            b = tmp;
            u -= t * v;
            tmp = u;
            u = v;
            v = tmp;
        }
        u %= m;
        if (u < 0) u += m;
        return u;
    }

    long modPow(long a, long n, long mod) {
        long res = 1l;
        while(n > 0l) {
            if(n % 2l == 1l) res = res * a % mod;
            a = a * a % mod;
            n /= 2l;
        }
        return res;
    }

}

class UnionFind {
    private int[] parent;

    UnionFind(int n) {
        parent = new int[n];
        for(int i = 0;i < n;i++) parent[i] = i;
    }

    public int rootOf(int x) {
        if(parent[x] == x) return x;
        else return parent[x] = rootOf(parent[x]);
    }

    public boolean same(int x, int y) {
        return rootOf(x) == rootOf(y);
    }

    public void unite(int x, int y) {
        x = rootOf(x);
        y = rootOf(y);
        if(x == y) return;
        parent[x] = y;
        return;
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}