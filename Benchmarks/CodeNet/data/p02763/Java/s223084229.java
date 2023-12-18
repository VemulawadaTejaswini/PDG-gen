import java.util.*;
import java.util.function.BiFunction;
import java.io.*;


public class a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int q = sc.nextInt();
        StringBuilder result = new StringBuilder();
        SegmentTree<Long> t = new SegmentTree<>(N, (x, y)->x|y, 0L);
        for(int i=0;i<N;i++){
            t.update(i, (x, y)->y, 1L<<(S[i]-'a'));
        }
        for(int i=0;i<q;i++){
            if(sc.nextInt()==1){
                int iq = sc.nextInt();
                char cq = sc.next().charAt(0);
                t.update(iq-1, (x, y)->y, 1L<<(cq-'a'));
            }
            else{
                int l = sc.nextInt();
                int r = sc.nextInt();
                long bit = t.query(l-1, r);
                result.append(Long.bitCount(bit)+"\n");
            }
        }

        out.println(result);
        out.flush();
    }

}

@SuppressWarnings("unchecked")
class SegmentTree<T> {
    private BiFunction<T, T, T> f;
    private int n;
    private T d1;
    private T[] dat;
    private  SegmentTree(T[] dat, int n_, BiFunction<T, T, T> f, T d1){
        this.f = f;
        this.d1 = d1;
        init(n_);
        build(dat);
    }

    public SegmentTree(T[] dat, BiFunction<T, T, T> f, T d1){
        this(dat, dat.length, f, d1);
    }

    public SegmentTree(int n_, BiFunction<T, T, T> f, T d1){
        this((T[]) new Object[0], n_, f, d1);
    }

    private void init(int n_){
        n = 1;
        while(n<n_) this.n *= 2;
        this.dat = (T[]) new Object[2 * this.n - 1];
    }

    private void build(T[] v){
        for(int i=0;i<n;i++) dat[i+n-1] = i < v.length ? v[i]: d1;
        for(int i=n-2;i>=0;i--) dat[i] = f.apply(dat[i*2+1], dat[i*2+2]);
    }

    public <E> void update(int k,BiFunction<T,E,T> g, E a){
        k += n-1;
        dat[k] = g.apply(dat[k], a);
        while(k>0){
            k = (k-1)/2;
            dat[k] = f.apply(dat[k*2+1], dat[k*2+2]);
        }
    }

    private T query(int a, int b, int k,int l, int r){
        if(r<=a || b<=l) return d1;
        if(a<=l&&r<=b) return dat[k];
        T vl = query(a, b, k*2+1, l, (l+r)/2);
        T vr = query(a, b, k*2+2, (l+r)/2, r);
        return f.apply(vl, vr);
    }

    public T query(int a, int b){
        return query(a, b, 0, 0, n);
    }
}