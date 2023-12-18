import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    long MOD = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){ 
        int n = ni();
        long[][] res1 = new long[n][2];
        long[][] res2 = new long[n][2];
        PriorityQueue<Long> pq1 = new PriorityQueue<>();
        PriorityQueue<Long> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            long a = nl();
            long b = nl();
            if(a<b){
                long tmp = a;
                a = b;
                b = tmp;
            }
            res1[i][0] = a;
            res1[i][1] = b;
            res2[i][0] = b;
            res2[i][1] = a;
            pq1.add(a);
            pq1.add(b);
            pq2.add(a);
            pq2.add(b);
        }
        Arrays.sort(res1, (c,d)-> Long.compare(d[0],c[0]));
        Arrays.sort(res2, (c,d)-> Long.compare(c[0],d[0]));
        long[] min = new long[]{pq1.poll(), pq1.poll()};
        long[] max = new long[]{pq2.poll(), pq2.poll()};
        long[] list = new long[]{min[0], min[1], max[0], max[1]};
        ArrayList<long[]> arr = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            int flag1 = 0;
            int flag2 = 0;
            for(int j = 0; j < 4; j++){
                if(res1[i][0] == list[j] && flag1==0){
                    flag1 = 1;
                    list[j] = inf;
                }
                if(res1[i][1] == list[j]&& flag2==0){
                    flag2 = 1;
                    list[j] = inf;
                }
            }
            if(flag1>0||flag2>0) arr.add(res1[i]);
        }
        for(int i = 0; i < 2; i++){
            int flag1 = 0;
            int flag2 = 0;
            for(int j = 0; j < 4; j++){
                if(res2[i][0] == list[j] && flag1==0){
                    flag1 = 1;
                    list[j] = inf;
                }
                if(res2[i][1] == list[j]&& flag2==0){
                    flag2 = 1;
                    list[j] = inf;
                }
            }
            if(flag1>0||flag2>0) arr.add(res2[i]);
        }
        long ans = inf;
        for(int i = 0; i < (1<<arr.size()); i++){
            long[] list1 = new long[arr.size()];
            long[] list2 = new long[arr.size()];
            for(int j = 0; j < arr.size(); j++){
                if(((i>>j)&1)==1){
                    list1[j] = arr.get(j)[0];
                    list2[j] = arr.get(j)[1];
                }
                else{
                    list1[j] = arr.get(j)[1];
                    list2[j] = arr.get(j)[0];   
                }
            }
            Arrays.sort(list1);
            Arrays.sort(list2);
            long tmp = (list1[arr.size()-1]-list1[0]) * (list2[arr.size()-1]-list2[0]);
            ans = Math.min(ans,tmp);
        }
        out.println(ans);        
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