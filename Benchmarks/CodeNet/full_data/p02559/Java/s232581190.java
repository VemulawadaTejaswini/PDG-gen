import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = nextInt();
        int q = nextInt();
        var a = nextLongs(n);
        var t = new FenwickTree(a);
        while (q --> 0) {
            int query = nextInt();
            if (query == 0) {
                int p = nextInt();
                int x = nextInt();
                t.add(p, x);
            } else {
                int l = nextInt();
                int r = nextInt();
                sb.append(t.sum(l, r)).append('\n');
            }
        }
        pw.write(sb.toString());
        pw.flush();
        pw.close();
        sc.close();
    }

    static int nextInt() {
        return Integer.parseInt(sc.next());
    }

    static int[] nextInts(int n) {
        var dat = new int[n];
        Arrays.setAll(dat, i -> nextInt());
        return dat;
    }

    static long nextLong() {
        return Long.parseLong(sc.next());
    }

    static long[] nextLongs(int n) {
        var dat = new long[n];
        Arrays.setAll(dat, i -> nextLong());
        return dat;
    }

    static class FenwickTree{
        private int _n;
        private long[] data;
    
        public FenwickTree(int n){
            this._n = n;
            data = new long[n];
        }
    
        public FenwickTree(long[] data) {
            this(data.length);
            build(data);
        }
    
        public void add(int p, long x){
            assert(0<=p && p<_n);
            p++;
            while(p<=_n){
                data[p-1] += x;
                p += p&-p;
            }
        }
        public long sum(int l, int r){
            assert(0<=l && l<=r && r<=_n);
            return sum(r)-sum(l);
        }
    
        private long sum(int r){
            long s = 0;
            while(r>0){
                s += data[r-1];
                r -= r&-r;
            }
            return s;
        }
    
        private void build(long[] dat) {
            System.arraycopy(dat, 0, data, 0, _n);
            for (int i=1; i<=_n; i++) {
                int p = i+(i&-i);
                if(p<=_n){
                    data[p-1] += data[i-1];
                }
            }
        }
    }
    
}
