import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Q = sc.nextInt();
        Integer[] A = new Integer[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        SegTree<Integer> seg = new SegTree<Integer>(A, -1, Integer::max);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int q = sc.nextInt();
            if(1 == q){
                int k = sc.nextInt()-1, a = sc.nextInt() ;
                seg.set(k, a);
            }else if(2 == q){
                int l = sc.nextInt()-1, r = sc.nextInt();
                sb.append(seg.query(l, r) + "\n");
            }else{
                int l = sc.nextInt()-1, v = sc.nextInt();
                int j = seg.maxRight(l, x -> x < v) + 1;
                sb.append(j + "\n");
            }
        }
        System.out.println(sb.toString());
        sc.close();

    }

}

class SegTree<T> {

    /** SegTreeで扱う要素数 */
    private final int N;
    /** nより大きい最小の2の累乗数 */
    private final int SIZE;
    /** 単位元 */
    private final T E;
    /** 演算 */
    private final BinaryOperator<T> OP;
    /**
     * 要素全体を含むノードのindex：1.
     * k番目(0-indexed)の要素のindex：k + size
     * ノードkの親要素のindex：k/2.
     * ノードkの子要素のうち左側のindex：k*2.
     * ノードkの子要素のうち右側のindex：k*2+1.
     */
    private final T[] DATA;

    /**
     * 全てのノードを単位元で初期化するコンストラクタ.<br>
     * 計算量：O(N)
     * @param n 要素数
     * @param e 単位元
     * @param op 演算
     */
    @SuppressWarnings("unchecked")
    public SegTree(int n, T e, BinaryOperator<T> op){
        int tmpSize = 1;
        while(tmpSize < n) tmpSize *= 2;
        this.N = n;
        this.SIZE = tmpSize;
        this.E = e;
        this.OP = op;
        this.DATA = (T[]) new Object[SIZE*2];
        Arrays.fill(DATA, e);
    }

    /**
     * 引数で指定された配列で初期化するコンストラクタ.<br>
     * 計算量：O(N)
     * @param a 初期配列
     * @param e 単位元
     * @param op 演算
     */
    @SuppressWarnings("unchecked")
    public SegTree(T[] a, T e, BinaryOperator<T> op){
        int tmpSize = 1;
        while(tmpSize < a.length) tmpSize *= 2;
        this.N = a.length;
        this.SIZE = tmpSize;
        this.E = e;
        this.OP = op;
        this.DATA = (T[]) new Object[SIZE*2];
        Arrays.fill(DATA, e);
        for (int i = 0; i < N; i++) DATA[i + SIZE] = a[i];
        for (int i = SIZE-1; i > 0; i--) update(i);
    }

    /**
     * k番目の要素を取得する.
     * 計算量：O(1)
     * @param k
     * @return k番目の要素の値
     */
    public T get(int k) {
        return DATA[k + SIZE];
    }

    /**
     * k番目（0-indexed）の要素をaに更新する.<br>
     * 計算量：O(logN)
     * @param k 変更対象要素のindex（0-indexed）
     * @param v 変更後の値
     */
    public void set(int k, T v){
        k += SIZE;
        DATA[k] = v;
        while(0 < k){
            k >>= 1;
            update(k);
        }
    }

    /**
     * ノードkに演算を適用する.<br>
     * 計算量：O(1)
     * @param k
     */
    private void update(int k) {
        DATA[k] = OP.apply(DATA[k*2], DATA[k*2+1]);
    }

    /**
     * 区間[a, b)の結果を取得する.<br>
     * 計算量：O(logN)
     * @param l 求める区間の下限（含む）
     * @param r 求める区間の上限（含まない）
     * @return 区間[a, b)の結果
     */
    public T query(int l, int r){
        return query(l, r, 0, 0, SIZE);
    }

    /**
     * 区間[a, b)の結果を取得する.<br>
     * @param l 求める区間の下限（含む）
     * @param r 求める区間の上限（含まない）
     * @param k 確認するノードのindex
     * @param a 確認するノードの下限（含む）
     * @param b 確認するノードの上限（含まない）
     * @return 区間[a, b)の結果
     */
    private T query(int l, int r, int k, int a, int b){
        if(b <= l || r <= a) return E;

        if(l <= a && b <= r) return DATA[k];

        T vl = query(l, r, k*2, a, (a+b)/2);
        T vr = query(l, r, k*2+1, (a+b)/2, b);
        return OP.apply(vl, vr);
    }

    /**
     * pr(op(l, l+1, ... , x-1)) = true かつ
     * pr(op(l, l+1, ... , x)) = false
     * を満たす最大のxを求める.<br>
     * @param l 対象範囲下限
     * @param pr 判定条件
     * @return 条件を満たす最大のIndex
     */
    public int maxRight(int l, Predicate<T> pr) {
        return maxRight(l, N, pr);
    }

    /**
     * [l, r)の範囲において
     * pr(op(l, l+1, ... , x-1)) = true かつ
     * pr(op(l, l+1, ... , x)) = false
     * を満たす最大のxを求める.<br>
     * @param l 対象範囲下限（含む）
     * @param r 対象範囲上限（含まない）
     * @param pr 判定条件
     * @return 条件を満たす最大のIndex
     */
    public int maxRight(int l, int r, Predicate<T> pr) {
        int idx = l + SIZE;
        int li = l, ri = l, width = 1;
        T applied = E;
        while(ri < SIZE) {
            T tmp = OP.apply(applied, DATA[idx]);
            if(ri < r && pr.test(tmp)) {
                applied = tmp;
                if((idx&1) == 0) {
                    idx++;
                }else {
                    idx = idx/2 +1;
                    width *= 2;
                }
                li = ri + 1;
                ri = li + width -1;
            }else {
                if(SIZE <= idx) {
                    return li;
                }
                idx = idx*2;
                width /= 2;
                ri -= width;
            }
        }
        return r;
    }

    // TODO minLeft()
}
