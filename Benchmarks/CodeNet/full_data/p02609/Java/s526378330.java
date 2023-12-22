
import java.util.*;
import java.io.*;

class Main {

    Scanner in;
    InputStream is;
    PrintWriter out;
    String INPUT = "";

//----------------------------------------------------------------------------------------------------//
    int INF=Integer.MAX_VALUE;
    int mod=(int)(1e9)+7;
    /*int fastExpo(int x,int y,int m){
        if(y==0)return 1;
        long p=fastExpo(x, y>>1, m);
        p=(p*p)%m;
        if((y&1)==1)p=(p*x)%m;
        return (int)p;
    }*/
    int solver(int x){
        int cnt=1;
        int r=Integer.bitCount(x);
        while(x>0){
            x=x%r;
            r=Integer.bitCount(x);
            cnt++;
        }
        return cnt;
    }
     void solve() throws IOException {
        int t = 1;
        //t = ni();
        while (t-- > 0) {
           int n=ni();
           char s[]=ns(n);
           int r=0;
            for (int i = 0; i < n; i++) {
                if(s[i]=='1')r++;
            }
            if(r==0){
                for (int i = 0; i < n; i++) {
                    out.println(1);
                }
                return;
            }
            if(r==1){
                for (int i = 0; i < n; i++) {
                    if(s[i]=='0'){
                        if(s[n-1]=='0')out.println(1);
                        else out.println(2);
                    }
                    else out.println(0);
                }
                return;
            }
           long a=0;//r+1
           long b=0;//r+1
           int pow_a[]=new int[n];
           int pow_b[]=new int[n];
           pow_a[0]=pow_b[0]=1;
            for (int i = 1; i < n; i++) {
                pow_a[i]=(int)((2*1L*pow_a[i-1])%(r-1));
                pow_b[i]=(int)((2*1L*pow_b[i-1])%(r+1));
            }
            for (int i = 0; i < n; i++) {
                if(s[i]=='1'){
                    a=(a+pow_a[n-1-i])%(r-1);
                    b=(b+pow_b[n-1-i])%(r+1);
                }
            }
           
            long x;
            for (int i = 0; i < n; i++) {
                if(s[i]=='0'){
                    x=(b+pow_b[n-i-1])%(r+1);
                }
                else{
                    x=(a-pow_a[n-i-1]+r-1)%(r-1);
                }
                
                out.println(solver((int)x));
            }
            
        }

    }
//----------------------------------------------------------------------------------------------------//

    void run() throws Exception {
        is = System.in;
        out = new PrintWriter(System.out);

        //long s = System.currentTimeMillis();
        solve();
        out.flush();
        //tr(System.currentTimeMillis() - s + "ms");
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;

    private int readByte() {
        if (lenbuf == -1) {
            throw new InputMismatchException();
        }
        if (ptrbuf >= lenbuf) {
            ptrbuf = 0;
            try {
                lenbuf = is.read(inbuf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (lenbuf <= 0) {
                return -1;
            }
        }
        return inbuf[ptrbuf++];
    }

    private boolean isSpaceChar(int c) {
        return !(c >= 33 && c <= 126);
    }

    private int skip() {
        int b;
        while ((b = readByte()) != -1 && isSpaceChar(b));
        return b;
    }

    private double nd() {
        return Double.parseDouble(ns());
    }

    private char nc() {
        return (char) skip();
    }

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while (!(isSpaceChar(b))) {  // when nextLine(take whole line as input wid space), (!isSpaceChar(b) || b == ' ') 
            //if(b!=' ') to remove spaces in Str when taking spaces in Str
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while (p < n && !(isSpaceChar(b))) {
            buf[p++] = (char) b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for (int i = 0; i < n; i++) {
            map[i] = ns(m);
        }
        return map;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ni();
        }
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if (b == '-') {
            minus = true;
            b = readByte();
        }

        while (true) {
            if (b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    /*private boolean oj = System.getProperty("ONLINE_JUDGE") != null;
    
    private void tr(Object... o) {
        if (!oj) {
            System.out.println(Arrays.deepToString(o));
            
        }
    }*/

}
