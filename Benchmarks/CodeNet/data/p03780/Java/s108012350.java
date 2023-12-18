import static java.lang.Math.max;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

/**
 * ### 考察 ###
 * 
 * a[i]が必要であるための条件は, 数列の [0, i), [i + 1, n) の範囲のみを用いて k - a[i] <= s < k を満たす s をつくれることである.
 * 任意の i, j (0 <= i < n, 0 <= j < k) に対して, 数列の [0, i), [i + 1, n) の範囲のみを用いて整数 j を作れるかは, 典型的なDPを前からと後ろから行うことにより O (n * k) で計算できる. 
 * 各a[i]に対して, [0, i) で数 f が作れるとき, [i + 1, n) で k - a[i] <= f + b < k を満たす b を愚直に探索すると全体で O (n * k * k)　の時間がかかり, 満点解法とはならない. (部分点解法)
 * そこで, f に対して b が存在するかを高速に求めることを考える.
 * まず, 先に考えた通り後ろ側のDPテーブルの定義を,
 * 
 *    dp[i][j] := 数列の [i + 1, n) の範囲だけを用いて, 整数 j を作ることが出来るか
 * 
 * とする. これでは間に合わないので, 区間[l, r)に含まれる整数を1つでも作ることができるかを高速に判定するために, このDPテーブルをint配列として累積和を取る.
 * そうすると, 新たなDPテーブルの定義は,
 * 
 *    dp[i][j] := 数列の [i + 1, n) の範囲だけを用いて, [0, j) に含まれる整数 l をいくつ作ることが出来るか
 * 
 * となる. これにより, 区間[l, r)に含まれる整数を1つでも作ることができるかを dp[i][r] - dp[i][l] > 0 かどうかで判定できる. 
 * 従って, 計算量は全体で O (n * k) となり, 満点解法の時間制約を満たす.
 * しかし, これを愚直に実装するとメモリ制約を満たさないので, メモリ使用量の削減を図る.
 * 
 * ### メモリ削減の工夫 ###
 * 
 * 1. 2次元dp配列は1つだけにして, もう一方は一次元配列を更新しながら使い回すことにする.
 * 2. この2次元配列を累積和配列へと再利用する.
 * (3. 1次元配列はbooleanで十分. )
 * 
 * ### 実装上気をつけること ###
 * 
 * 1. 累積和を場合の数で持つと簡単にoverflowするので, 可能(=1)/不可能(=0)で元の配列を作成する.
 * 2. dp配列は後に累積和配列として再利用するので, indexを1つずらしておく.
 * 3. 1次元配列の更新は, 逆方向に行う. 前から更新すると, a[i]を何度も使えることになる.
 */

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int k = fsc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fsc.nextInt();
        }
        int[][] backsum = new int[n + 1][k + 1];
        backsum[n][1] = 1;
        for (int i = n - 1; i >= 0; i--) for (int j = 1; j <= k; j++) {
            if (backsum[i + 1][j] > 0) {
                backsum[i][j] = 1;
                if (j + a[i] <= k) {
                    backsum[i][j + a[i]] = 1;
                }
            }
        }
        for (int i = 0; i <= n; i++) for (int j = 1; j <= k; j++) {
            backsum[i][j] += backsum[i][j - 1];
        }
        int need = 0;
        boolean[] front = new boolean[k];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                front[0] = true;
            } else {
                for (int j = k - 1; j >= 0; j--) {
                    if (j - a[i - 1] >= 0) {
                        front[j] |= front[j - a[i - 1]];
                    }
                }
            }
            for (int j = 0; j < k; j++) {
                if (front[j] && backsum[i + 1][k - j] - backsum[i + 1][max(0, k - a[i] - j)] > 0) {
                    ++need;
                    break;
                }
            }
        }
        System.out.println(n - need);
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
