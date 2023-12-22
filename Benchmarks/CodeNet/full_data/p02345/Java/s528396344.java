import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        PrintWriter pw = new PrintWriter(System.out);
        final int N = nextInt(sc);
        final int Q = nextInt(sc);
        int[] a = new int[N];
        Arrays.fill(a, Integer.MAX_VALUE);
        IntSegmentTree t = new IntSegmentTree(a, Integer.MAX_VALUE, Integer::min);
        for (int j = 0; j < Q; j++) {
            int q = nextInt(sc);
            switch (q) {
                case 0:
                    int i = nextInt(sc);
                    int x = nextInt(sc);
                    t.update(i, v -> x);
                    break;
                case 1:
                    int l = nextInt(sc);
                    int r = nextInt(sc) + 1;
                    out.append(t.fold(l, r)).append('\n');
                    break;
                default:
                    break;
            }
        }
        sc.close();
        pw.write(out.toString());
        pw.flush();
        pw.close();
    }

    public static int nextInt(Scanner sc) {
        return Integer.parseInt(sc.next());
    }
    public static long nextLong(Scanner sc) {
        return Long.parseLong(sc.next());
    }
}

/**
 * 長さ N の列に対して，一点更新および二項演算による区間畳み込みをそれぞれ O(log N) で行うデータ構造．
 * 二項演算は結合則を満たせば OK．
 * 単位元は本来要求されないが，あった方が楽なので単位元を要求する．
 * 単位元がない場合は null を使うなどしてよしなに二項演算を定義すると良い．
 * 
 * verified:
 * 
 * @author https://atcoder.jp/users/suisen
 */
class IntSegmentTree {

    /**
     * データを格納する配列．1-indexed．
     */
    final int[] Dat;

    /**
     * 単位元．
     */
    final int E;

    /**
     * 二項演算．
     */
    final IntBinaryOperator F;

    /**
     * 葉の数．Dat[N] は 0 番目の葉．
     */
    final int N;

    /**
     * 元々の列のサイズ．配列外参照を検知するために用いる．
     */
    final int L;

    /**
     * セグ木を単位元で埋めて初期化．
     * @param n 要素数
     * @param e 二項演算{@code f}の単位元
     * @param f 二項演算
     */
    public IntSegmentTree(int n, int e, IntBinaryOperator f) {
        this.L = n;
        int m = 1;
        while (m < n) m <<= 1;
        this.N = m;
        this.E = e;
        this.F = f;
        this.Dat = new int[N << 1];
        Arrays.fill(Dat, E);
    }

    /**
     * セグ木を配列をもとに O(N) で初期化．
     * @param src 配列
     * @param e 二項演算{@code f}の単位元
     * @param f 二項演算
     */
    public IntSegmentTree(int[] src, int e, IntBinaryOperator f) {
        this(src.length, e, f);
        build(src, src.length);
    }

    /**
     * 配列での初期化処理の本体
     * @param src 配列
     * @param len 配列のサイズ
     */
    private void build(int[] src, int len) {
        System.arraycopy(src, 0, Dat, N, len);
        Arrays.fill(Dat, N + len, N << 1, E);
        for (int i = N - 1; i > 0; i--) {
            Dat[i] = F.applyAsInt(Dat[i << 1 | 0], Dat[i << 1 | 1]);
        }
    }

    /**
     * 区間を O(log N) で畳み込む．半開区間 [l, r) であることに注意．
     * @param l 区間の左端 (含まれる)
     * @param r 区間の右端 (含まれない)
     * @return 半開区間 [l, r) の要素を二項演算 {@code F} で畳み込んだ結果
     */
    public int fold(int l, int r) {
        if (l < 0 || r > L) {
            throw new IndexOutOfBoundsException(
                String.format("Segment [%d, %d) is not in [%d, %d)", l, r, 0, L)
            );
        }
        l += N; r += N;
        int resL = E, resR = E;
        while (l < r) {
            if ((l & 1) == 1) resL = F.applyAsInt(resL, Dat[l++]);
            if ((r & 1) == 1) resR = F.applyAsInt(Dat[--r], resR);
            l >>= 1; r >>= 1;
        }
        return F.applyAsInt(resL, resR);
    }

    /**
     * 列の一点を O(log N) で更新する．
     * @param i 列の index
     * @param f {@code i} 番目の要素に作用させる関数
     */
    public void update(int i, IntUnaryOperator f) {
        if (i < 0 || i >= L) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d is not in [%d, %d)", i, 0, L)
            );
        }
        i += N;
        Dat[i] = f.applyAsInt(Dat[i]);
        while (i > 0) {
            i >>= 1;
            Dat[i] = F.applyAsInt(Dat[i << 1 | 0], Dat[i << 1 | 1]);
        }
    }

    /***************************** DEBUG *********************************/

    // @Override
    // public String toString() {
    //     return toString(1, 0);
    // }

    // private String toString(int k, int space) {
    //     String s = "";
    //     if (k < N) s += toString(k << 1 | 1, space + 3) + "\n";
    //     s += " ".repeat(space) + Dat[k];
    //     if (k < N) s += "\n" + toString(k << 1 | 0, space + 3);
    //     return s;
    // }

    /******* Usage *******/
    
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5};
        IntSegmentTree t = new IntSegmentTree(a, 0, Integer::sum);
        System.out.println(t);
        System.out.printf("\nsum of [3, 5) = %d \n\n", t.fold(3, 5));
        t.update(2, e -> e * 2);
        System.out.println(t);
        System.out.printf("\nsum of [0, 4) = %d \n", t.fold(0, 4));
    }
}
