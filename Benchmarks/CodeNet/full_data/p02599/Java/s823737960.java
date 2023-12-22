import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    static int SIZE = 500001;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt() - 1;
            r[i] = sc.nextInt() - 1;
        }
        
        List<int[]>[] queries = new List[n];
        for (int i = 0; i < n; i++) {
            queries[i] = new ArrayList<int[]>();
        }
        for (int i = 0; i < q; i++) {
            queries[l[i]].add(new int[]{r[i], i});
        }
        
        List<Integer>[] rights = new List[n];
        for (int i = 0; i < n; i++) {
            rights[i] = new ArrayList<Integer>();
        }
        int[] last_app = new int[SIZE];
        Arrays.fill(last_app, -1);
        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (last_app[num] != -1) {
                rights[last_app[num]].add(i);
            }
            last_app[num] = i;
        }
        
        SegmentTree seg = new SegmentTree(SIZE, Integer::sum, 0);
        
        int[] ans = new int[q];
        for (int i = n - 1; i >= 0; i--) {
            for (Integer right : rights[i]) {
                int now = seg.query(right, right + 1);
                seg.update(right, ++now);
            }
            
            for (int[] query : queries[i]) {
                int left = i;
                int right = query[0];
                int q_idx = query[1];
                ans[q_idx] = right - left + 1 - seg.query(left, right+1);
            }
        }
        
        for (Integer a : ans) {
            System.out.println(a);
        }
    }
}

class SegmentTree {
    // dat: 0-indexed
    // 00000000
    // 11112222
    // 33445566
    // 789ABCDE ... a[0]-a[n]
    
    final int[] dat;            // データを格納する配列
    final int n;                // datの一番下のレベルの要素数
    final BinaryOperator<Integer> f;  // 二項演算子
    final int e;                // 単位元

    // 単位元で埋めて新規作成
    public SegmentTree(int len, BinaryOperator<Integer> f, int e) {
        int n = 1;
        while (n < len) n <<= 1;
        this.n = n;
        this.f = f;
        this.e = e;
        this.dat = new int[n << 1];
        Arrays.fill(dat, e);
    }
    
    // 一点更新(a[i] = x) O(logN)
    public void update(int i, int x) {
        i += n - 1;
        dat[i] = x;
        while (i > 0) {
            i = (i - 1) / 2;  // i: parent of vl/vr
            int vl = dat[i * 2 + 1];
            int vr = dat[i * 2 + 2];
            dat[i] = vl + vr;
        }
    }
    
    // 区間取得[a, b) O(logN)
    public int query(int a, int b) { return query_sub(a, b, 0, 0, n); }
    public int query_sub(int a, int b, int k, int l, int r) {
        if (r <= a || b <= l) {             // outside completely
            return e;
        } else if (a <= l && r <= b) {      // inside completely
            return dat[k];
        } else {
            int vl = query_sub(a, b, k * 2 + 1, l, (l + r) / 2);
            int vr = query_sub(a, b, k * 2 + 2, (l + r) / 2, r);
            return vl + vr;
        }
    }
    
    // 使用例
    // Range Sum Query
    // SegmentTree<Integer> seg = new SegmentTree<>(n, Integer::sum, 0);
    // SegmentTree<Long> seg = new SegmentTree<>(n, Long::sum, 0L);
    
    // Range Minimum Query
    // SegmentTree<Integer> seg = new SegmentTree<>(n, Integer::min, Integer.MAX_VALUE);
    
    // Range Maximum Query
    // SegmentTree<Long> seg = new SegmentTree<>(n, Long::max, Long.MIN_VALUE);
}