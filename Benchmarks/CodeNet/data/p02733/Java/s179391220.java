import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private boolean testCases=false;
    private boolean console=false;
    private long MOD = 1000_000_007L;
    private int MAX = 1000_001;

    int[] X={-1,0,1,0};
    int[] Y={0,-1,0,1};


    public void solve() {
        int n=in.ni(),m=in.ni(),k=in.ni();
       int[][] arr=new int[n][m];

       for(int i=0;i<n;++i){
           char[] str=in.ns().toCharArray();
           for(int j=0;j<m;++j) {
               arr[i][j] = str[j] - '0';
           }
       }

       int ans=Integer.MAX_VALUE;

       for(int i=0;i<( 1<< n-1 );++i){

           int cuts=Integer.bitCount(i);
           ArrayList<Integer>[] sum=new ArrayList[m];

           for(int j=0;j<m;++j){
               sum[j]=new ArrayList<>();
           }

           int idx=0;

           for(int j=0;j<m;++j){

               int s=0;

               for(int l=0;l<n;++l){

                   s+=arr[l][j];
                   if( ( (1<<l) & i) > 0 ){
                       sum[j].add(s);
                       s=0;
                   }
               }

               sum[j].add(s);

//               out.println(sum[j]+ " "+ j);

           }


//           out.println(Arrays.toString(sum)+" -> "+ cuts);

           for(int j=0;j<m;++j){

               boolean isok=true;

               for(int l=0;l<sum[j].size();++l){

                   if(sum[j].get(l)>k){
                       cuts=Integer.MAX_VALUE;
                       break;
                   }

                   if(j>0) {

                       sum[j].set(l, sum[j - 1].get(l) + sum[j].get(l));

                       if (sum[j].get(l)  > k) {
                           cuts++;
                           isok = false;
                           break;
                       }

                   }
               }

               if(!isok){
                   for(int l=0;l<sum[j].size();++l){
                       sum[j].set(l, sum[j].get(l) -sum[j - 1].get(l) );
                   }
               }
           }

//           out.println(Arrays.toString(sum)+" -> "+ cuts);
//           out.println();

           ans=Math.min(ans,cuts);
       }

       out.println(ans);

    }

    /* -------------------- Templates and Input Classes -------------------------------*/

    @Override
    public void run() {
        try {
            init();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int t= testCases ? in.ni() : 1;
        while (t-->0) {
            solve();
            out.flush();
        }
    }

    private FastInput in;
    private PrintWriter out;
    public static void main(String[] args) throws Exception {
        new Main().run();
//        new Thread(null, new Main(), "Main", 1 << 27).start();
    }
    private void init() throws FileNotFoundException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        try {
            if (!console && System.getProperty("user.name").equals("puneet")) {
//                outputStream = new FileOutputStream("/home/puneet/Desktop/output.txt");
                inputStream = new FileInputStream("/home/puneet/Desktop/input.txt");
            }
        } catch (Exception ignored) {
        }
        out = new PrintWriter(outputStream);
        in = new FastInput(inputStream);
    }
    private void maualAssert(int a,int b,int c){
        if(a<b || a>c)
            throw new RuntimeException();
    }
    private void maualAssert(long a,long b,long c){
        if(a<b || a>c)
            throw new RuntimeException();
    }
    private void sort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int object : arr) list.add(object);
        Collections.sort(list);
        for (int i = 0; i < list.size(); ++i) arr[i] = list.get(i);
    }
    private void sort(long[] arr) {
        List<Long> list = new ArrayList<>();
        for (long object : arr) list.add(object);
        Collections.sort(list);
        for (int i = 0; i < list.size(); ++i) arr[i] = list.get(i);
    }
    public long ModPow(long x, long y, long MOD) {
        long res = 1L;
        x = x % MOD;
        while (y >= 1) {
            if ((y & 1) > 0) res = (res * x) % MOD;
            x = (x * x) % MOD;
            y >>= 1;
        }
        return res;
    }
    public int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
    public long gcd(long a, long b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
    static class FastInput { InputStream obj;
        public FastInput(InputStream obj) {
            this.obj = obj;
        }
        byte inbuffer[] = new byte[1024];
        int lenbuffer = 0, ptrbuffer = 0;
        int readByte() { if (lenbuffer == -1) throw new InputMismatchException();
            if (ptrbuffer >= lenbuffer) { ptrbuffer = 0;
                try { lenbuffer = obj.read(inbuffer);
                } catch (IOException e) { throw new InputMismatchException(); } }
            if (lenbuffer <= 0) return -1;return inbuffer[ptrbuffer++]; }
        String ns() { int b = skip();StringBuilder sb = new StringBuilder();
            while (!(isSpaceChar(b))) // when nextLine, (isSpaceChar(b) && b!=' ')
            { sb.appendCodePoint(b);b = readByte(); }return sb.toString();}
        int ni() {
            int num = 0, b;boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') { minus = true;b = readByte(); }
            while (true) { if (b >= '0' && b <= '9') { num = num * 10 + (b - '0'); } else {
                    return minus ? -num : num; }b = readByte(); }}
        long nl() { long num = 0;int b;boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') { minus = true;b = readByte(); }
            while (true) { if (b >= '0' && b <= '9') { num = num * 10L + (b - '0'); } else {
                    return minus ? -num : num; }b = readByte(); } }
        boolean isSpaceChar(int c) {
            return (!(c >= 33 && c <= 126));
        }
        int skip() { int b;while ((b = readByte()) != -1 && isSpaceChar(b)) ;return b; }
        float nf() {return Float.parseFloat(ns());}
        double nd() {return Double.parseDouble(ns());}
        char nc() {return (char) skip();}
    }

}