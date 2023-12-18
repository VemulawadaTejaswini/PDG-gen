import java.util.*;
import java.io.*;
import java.math.*;
public class Main{


    void solve() {
        int n=ni();
        int a[]=new int[n+1];
        int MX=0;
        for(int i=1;i<=n;i++){
            a[i]=ni();
            MX+=a[i];
        }
        //int MX=(int)(4*1e6);

        boolean sum[]=new boolean[MX+1];
        long dp[]=new long[MX+1];
        dp[0]=1;
        sum[0]=true;
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> v2=new ArrayList<>();
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        q.offer(0);


        hs.add(0);

        for(int i=1;i<=n;i++){
            v2.clear();
            for(int u : q){
                sum[u+a[i]]=true;
                    dp[u+a[i]]+=dp[u];
                    dp[u+a[i]]%=M;
                    if(!hs.contains(u+a[i])) {
                        v2.add(u + a[i]);
                        hs.add(u+a[i]);
                    }



            }
            q.addAll(v2);

        }
        long p=1;
        int d=0;
        while(d<n-1){
            p=(p*2)%M;
            d++;
        }

        long sm=0;
        for(int j=1;j<=MX;j++){

            if((sm%M+dp[j]%M)%M>=p) {
                pw.println(j);
                return;
            }


            sm+=dp[j];
            sm%=M;
        }




    }


    long M=(long)1e9+7;
    InputStream is;
    PrintWriter pw;
    String INPUT = "";
    void run() throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        pw = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        pw.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }

    public static void main(String[] args) throws Exception { new Main().run(); }

    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;

    private int readByte() {
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

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }

    private int ni() {
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

    private long nl() {
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

    private void tr(Object... o) { if(INPUT.length() > 0)System.out.println(Arrays.deepToString(o)); }
}