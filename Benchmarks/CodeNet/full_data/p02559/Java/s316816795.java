import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        BIT bit = new BIT(n);
        for (int i = 0; i < n; i++) {
            bit.add(i+1, sc.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if(t == 0){
                int p = sc.nextInt()+1;
                int x = sc.nextInt();
                bit.add(p, x);
            }else{
                int l = sc.nextInt()+1;
                int r = sc.nextInt();
                sb.append(bit.sum(l, r) + "\n");
            }
        }
        System.out.println(sb.toString());
        sc.close();

    }

}
class BIT {

    private int n;
    private long[] bit;

    /**
     * コンストラクタ.<br>
     * 長さ n+1、初期値 0の配列を生成する.<br>
     * 計算量：O(N)
     * @param n
     */
    public BIT(int n){
        this.n = n;
        this.bit = new long[n+1];
    }

    /**
     * i番目の要素にxを加算する.<br>
     * 計算量：O(logN)
     * @param i
     * @param x
     */
    public void add(int i, int x){
        while(i <= n){
            bit[i] += x;
            i += i & -i;
        }
    }

    /**
     * 0～i番目までの要素の総和.<br>
     * 計算量：O(logN)
     * @param i
     */
    public long sum(int i){
        long s = 0L;
        while(0 < i){
            s += bit[i];
            i -= i & -i;
        }
        return s;
    }
    public long sum(int l, int r) {
        return sum(r) - sum(l-1);
    }

    /**
     * k ≦ sum(x) となる最小のxを求める.<br>
     * 計算量：O(logN)
     * @param k
     * @return
     */
    public int lowerBound(int k){
        if(k <= 0) return 0;
        int x = 0;
        int max = 1;
        while(max < n) max *= 2;
        for (int i = max; i > 0; i /= 2) {
            if(x + i <= n && bit[x + i] < k){
                k -= bit[x + i];
                x += i;
            }
        }
        return x + 1;
    }

}
