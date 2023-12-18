    import java.util.*;
    import java.io.*;
    import java.math.*;
    public class Main{

        void solve(){
            boolean prime[]=new boolean[1000001];
            prime[1]=true;
            for(int i=2;i*i<=1e6;i++){
                if(!prime[i]){
                    for(int j=2*i;j<=1e6;j+=i) prime[j]=true;
                }
            }
            int sum[]=new int[1000001];
            for(int i=3;i<=1e6;i++){
                sum[i]=sum[i-1];
                if(!prime[i] && !prime[(i+1)/2]) sum[i]+=1;
            }
            int q=ni();
            while(q-->0){
                int l=ni(),r=ni();
                pw.println(sum[r]-sum[l-1]);
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