import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        PrintWriter pw = new PrintWriter(System.out);
        final int N = nextInt(sc);
        final int Q = nextInt(sc);
        // Integer[] a = new Integer[N];
        // Arrays.fill(a, Integer.MAX_VALUE);
        IntDualSegmentTree t = new IntDualSegmentTree(N, Integer.MAX_VALUE, -1, (u, v) -> v, (u, v) -> v);
        for (int j = 0; j < Q; j++) {
            int q = nextInt(sc);
            switch (q) {
                case 0:
                    int l = nextInt(sc);
                    int r = nextInt(sc) + 1;
                    int x = nextInt(sc);
                    t.apply(l, r, x);
                    break;
                case 1:
                    int i = nextInt(sc);
                    out.append(t.get(i)).append('\n');
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
 * 双対セグ木．長さ N の列に対して区間作用と一点取得がそれぞれ O(log N) で可能．
 * 遅延セグ木から不必要な処理を除いて簡略化したものなので，定数倍はこっちの方が軽い．
 * 
 * verified:
 *  - http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=DSL_2_D
 *  - http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=DSL_2_E
 */
class IntDualSegmentTree {
    
    /**
     * データを格納する配列．一点取得のみなので，葉部分しか持たなくてよい．
     */
    final int[] Dat;

    /**
     * 遅延配列
     */
    final int[] Laz;

    /**
     * 葉の個数
     */
    final int N;

    /**
     * 元々の列のサイズ．配列外参照を検知するために用いる．
     */
    final int L;

    /**
     * 作用素をマージする二項演算 H の単位元
     */
    final int E1;

    /**
     * 作用関数
     */
    final IntBinaryOperator G;

    /**
     * 作用素をマージする二項演算
     */
    final IntBinaryOperator H;

    /**
     * ボトムアップに区間を列挙する際にこのスタックに区間を積み，
     * トップダウンに遅延配列から伝播する際にこのスタックから区間を pop していく．
     */
    final int[] Stack = new int[64];
    
    /**
     * 配列を用いない初期化．O(N)
     * @param n 列の長さ
     * @param initialValue 列の初期値
     * @param e1 作用素をマージする二項演算の単位元
     * @param g 作用
     * @param h 作用素をマージする二項演算
     */
    public IntDualSegmentTree(int n, int initialValue, int e1, IntBinaryOperator g, IntBinaryOperator h) {
        this.E1 = e1;
        this.G = g;
        this.H = h;
        int k = 1;
        while (k < n) k <<= 1;
        this.N = k;
        this.L = n;
        this.Dat = new int[k];
        this.Laz = new int[k << 1];
        Arrays.fill(Dat, initialValue);
        Arrays.fill(Laz, e1);
    }

    /**
     * 配列を用いて初期化．O(N)
     * @param src 列 (初期データ)
     * @param e1 作用素をマージする二項演算の単位元
     * @param g 作用
     * @param h 作用素をマージする二項演算
     */
    public IntDualSegmentTree(int[] src, int e1, IntBinaryOperator g, IntBinaryOperator h) {
        this.E1 = e1;
        this.G = g;
        this.H = h;
        int n = src.length;
        int k = 1;
        while (k < n) k <<= 1;
        this.N = k;
        this.L = n;
        this.Dat = new int[k];
        this.Laz = new int[k << 1];
        System.arraycopy(src, 0, Dat, 0, src.length);
        Arrays.fill(Laz, e1);
    }

    /**
     * 半開区間 [l, r) に作用素 v を作用させる．O(log N)
     * @param l 半開区間の左端 (含まれる)
     * @param r 半開区間の右端 (含まれない)
     * @param v 作用素
     */
    public void apply(int l, int r, int v) {
        if (l < 0 || l > L || r < 0 || r > L) {
            throw new IndexOutOfBoundsException(
                String.format("Segment [%d, %d) is not in [%d, %d)", l, r, 0, L)
            );
        }
        if (l >= r) return;
        updown(l, r);
        l += N; r += N;
        for (; l < r; l >>= 1, r >>= 1) {
            if ((l & 1) != 0) {Laz[l] = H.applyAsInt(Laz[l], v); l++;}
            if ((r & 1) != 0) {r--; Laz[r] = H.applyAsInt(Laz[r], v);}
        }
    }

    /**
     * 一点取得．O(log N)
     * @param i index (0-indexed)
     * @return i 番目の値
     */
    public int get(int i) {
        if (i < 0 || i >= L) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d is not in [%d, %d)", i, 0, L)
            );
        }
        int k = 1;
        int l = 0, r = N;
        while (k < N) {
            propagate(k);
            int kl = k << 1 | 0;
            int kr = k << 1 | 1;
            int m = (l + r) >> 1;
            if (m > i) {r = m; k = kl;} 
            else {l = m; k = kr;}
        }
        propagate(k);
        return Dat[k - N];
    }

    /**
     * [l, r) と共通部分を持つ区間をボトムアップに列挙 (up) してから，
     * トップダウンに列挙区間の遅延値を伝播する (down)
     * @param l 半開区間の左端 (含まれる)
     * @param r 半開区間の右端 (含まれない)
     * @return 列挙した区間の数
     */
    void updown(int l, int r) {
        int i = 0;
        int kl = l + N, kr = r + N;
        for (int x = kl / (kl & -kl) >> 1, y = kr / (kr & -kr) >> 1; 0 < kl && kl < kr; kl >>= 1, kr >>= 1) {
            if (kl <= x) Stack[i++] = kl;
            if (kr <= y) Stack[i++] = kr;
        }
        for (; kl > 0; kl >>= 1) Stack[i++] = kl;
        while (i > 0) propagate(Stack[--i]);
    }

    /**
     * 遅延値を子に伝播する
     * @param k 木上の index (1-indexed)
     */
    void propagate(int k) {
        int lz = Laz[k];
        if (lz != E1) {
            if (k < N) {
                int l = k << 1 | 0, r = k << 1 | 1;
                Laz[l] = H.applyAsInt(Laz[l], lz);
                Laz[r] = H.applyAsInt(Laz[r], lz);
            } else {
                Dat[k - N] = G.applyAsInt(Dat[k - N], lz);
            }
            Laz[k] = E1;
        }
    }

    /***************************** DEBUG *********************************/

    // @Override
    // public String toString() {
    //     return toString(1, 0);
    // }

    // String toString(int k, int space) {
    //     String s = "";
    //     if (k < N) s += toString(k << 1 | 1, space + 6) + "\n";
    //     if (k < N) {
    //         s += " ".repeat(space) + Laz[k];
    //     } else {
    //         s += " ".repeat(space) + Dat[k - N] + "/" + Laz[k];
    //     }
    //     if (k < N) s += "\n" + toString(k << 1 | 0, space + 6);
    //     return s;
    // }

    /******* Usage *******/
    
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5};
        IntDualSegmentTree t1 = new IntDualSegmentTree(a, 0, (u, v) -> u + v, (u, v) -> u + v); // 区間加算クエリ
        System.out.println(t1);
        t1.apply(0, 3, 10);
        System.out.println(t1);
        System.out.printf("\na[2] = %d \n\n", t1.get(2));
        t1.apply(2, 4, 10);
        System.out.println(t1);
        System.out.printf("\na[2] = %d \n\n", t1.get(2));
    }
}
