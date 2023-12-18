import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    // int mod = 998244353;
    long inf = Long.MAX_VALUE/2;

    void solve(){
        int n = ni();
        int q = ni();
        long[] a = new long[2*n];
        long[] b = new long[2*n];
        long S = 0;
        long T = 0;
        for(int i = 0; i < 2*n; i++){
            a[i] = nl();
            S += a[i];
        }
        for(int i = 0; i < 2*n; i++){
            b[i] = nl();
            b[i] -= a[i];
        }
        Multiset<Long> pos = new Multiset<>();
        Multiset<Long> neg = new Multiset<>();
        for(int i = 0; i < 2*n; i++){
            if(i==0||i==2*n-1) continue;
            if(b[i]>0){
                pos.add(b[i]);
                T += b[i];
            }
            else{
                neg.add(-b[i]);
            }
        }
        neg.add(inf);
        for(int i = 0; i < q; i++){
            int p = ni()-1;
            long x = nl();
            long y = nl();
            if(p!=0 && p!=2*n-1){
                if(b[p]>0){
                    pos.remove(b[p]);
                    T -= b[p];
                }
                else{
                    neg.remove(-b[p]);
                }
            }
            S = S - a[p] + x;
            b[p] = y-x;
            a[p] = x;
            if(p!=0 && p!=2*n-1){
                if(b[p]>0){
                    pos.add(b[p]);
                    T += b[p];
                }
                else{
                    neg.add(-b[p]);
                }
            }
            long ans = 0;
            if(pos.size()%2==0){
                ans = S + T;
            }
            else{
                ans = S + Math.max(T - pos.peek(), T - neg.peek());
            }
            out.println(ans);
        }

    }

    static class Multiset<A> {

        private TreeSet<A> set = new TreeSet<>();
        private Map<A, Integer> cnt = new HashMap<>();
        private int size;

        public void add(A a) {
            size++;
            if (cnt.containsKey(a)) {
                cnt.put(a, cnt.get(a) + 1);

            } else {
                set.add(a);
                cnt.put(a, 1);
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public A pollLast() {
            if (isEmpty()) return null;

            size--;
            A last = set.last();
            if (cnt.get(last) == 1) {
                cnt.remove(last);
                return set.pollLast();

            } else {
                cnt.put(last, cnt.get(last) - 1);
                return last;
            }
        }

        public A peek() {
            if (isEmpty()) return null;
            return set.first();
        }

        public A poll() {
            if (isEmpty()) return null;

            size--;
            A first = set.first();
            if (cnt.get(first) == 1) {
                cnt.remove(first);
                return set.pollFirst();

            } else {
                cnt.put(first, cnt.get(first) - 1);
                return first;
            }
        }

        public void remove(A a) {
            size--;
            if( cnt.get(a) == 1 ) {
                cnt.remove(a);
                set.remove(a);

            } else {
                cnt.put(a, cnt.get(a)-1);
            }
        }

        public String toString() {
            List<A> list = new ArrayList<>();
            for (A k : set) {
                for (int i = 0; i < cnt.get(k); i++) {
                    list.add(k);
                }
            }
            return list.toString();
        }
    }


    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    public static void main(String[] args) throws Exception { new Main().run(); }
    
    private byte[] inbuf = new byte[1024];
    private int lenbuf = 0, ptrbuf = 0;
    
    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }
    
    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }
    
    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b) && b != ' ')){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    
    private char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }
    
    private char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }
    
    private int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }
    
    private int ni()
    {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private long nl()
    {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
 
}
