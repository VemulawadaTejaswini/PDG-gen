import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
        int n = ni();
        int m = ni();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = ni();
        }
        for(int i = 0; i < m; i++){
            b[i] = ni();
        }
        int[][] res = new int[n+m][2];
        for(int i = 0; i < n; i++){
            res[i][0] = a[i];
            res[i][1] = 0;
        }
        for(int i = 0; i < m; i++){
            res[i+n][0] = b[i];
            res[i+n][1] = 1;
        }
        Arrays.sort(res, (c,d) -> d[0]-c[0]);
        long ans = 1;
        int[][] board = new int[n][m];
        for(int i = n*m; i >= 1; i--){
            long tmp = 0;
            boolean f = false;
            int l = -1;
            int r = -1;
            for(int j = 0; j < n; j++){
                if(a[j]==i){
                    l = j;
                    break;
                }
            }
            for(int j = 0; j < m; j++){
                if(b[j]==i){
                    r = j;
                    break;
                }
            }
            if(l!=-1&&r!=-1){
                if(board[l][r]!=0){
                    out.println(0);
                    return;
                }
                board[l][r] = i;
                tmp++;
            }
            else if(l!=-1){
                for(int j = 0; j < m; j++){
                    if(b[j]>=i&&board[l][j]==0){
                        if(!f){
                            board[l][j] = i;
                            f = true;
                        }
                        tmp++;
                    }
                }
            }
            else if(r!=-1){
                for(int j = 0; j < n; j++){
                    if(a[j]>=i&&board[j][r]==0){
                        if(!f){
                            board[j][r] = i;
                            f = true;
                        }
                        tmp++;
                    }
                }
            }
            else{
                ArrayList<Integer> listl = new ArrayList<>();
                ArrayList<Integer> listr = new ArrayList<>();
                for(int j = 0; j < n; j++){
                    if(a[j]>=i){
                        listl.add(j);
                    }
                }
                for(int j = 0; j < m; j++){
                    if(b[j]>=i){
                        listr.add(j);
                    }
                }
                tmp = listl.size()*listr.size()-(n*m-i);
            }
            ans *= tmp;
            ans %= mod;
        }
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         out.print(board[i][j]+" ");
        //     }
        //     out.println();
        // }

        for(int i = 0; i < n; i++){
            long m1 = 0;
            for(int j = 0; j < m; j++){
                m1 = Math.max(m1, board[i][j]);
            }
            if(m1!=a[i]){
                out.println(0);
                return;
            }
        }
        for(int j = 0; j < m; j++){
            long m1 = 0;
            for(int i = 0; i < n; i++){
                m1 = Math.max(m1, board[i][j]);
            }
            if(m1!=b[j]){
                out.println(0);
                return;
            }
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
