
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.*;

public class Main implements Runnable {

    private boolean console=false;
    private long MOD = 1000_000_007L;
    private int MAX = 1000_001;

    private void solve1(){
        int n =in.ni();
        long[] arr = arrLong(n);

        sort(arr);

        BigInteger bigInteger = new BigInteger(String.valueOf(arr[0]));

        BigInteger temp = new BigInteger("1000000000000000000");

        for(int i=1;i<n;++i){
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(arr[i])));
//            out.println(bigInteger.toString()+" "+bigInteger.compareTo(temp));
            if(bigInteger.compareTo(temp) > 0){
                out.println(-1);
                return;
            }
        }


        out.println(bigInteger.toString());
    }

    private void solve() {
        int testCases = 1;
//        testCases = in.ni();
        while (testCases-->0){
            solve1();
        }
    }

    private void add(Map<Integer,Integer> map,int key){
        map.put(key,map.getOrDefault(key,0)+1);
    }

    private void remove(Map<Integer,Integer> map,int key){
        if(!map.containsKey(key))
            return;
        map.put(key,map.getOrDefault(key,0)-1);
        if(map.get(key)==0)
            map.remove(key);
    }

    @Override
    public void run() {
        long time = System.currentTimeMillis();
        try {
            init();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            solve();
            out.flush();
            System.err.println(System.currentTimeMillis()-time);
            System.exit(0);
        }catch (Exception e){
            e.printStackTrace(); System.exit(1);
        }
    }

    /* -------------------- Templates and Input Classes -------------------------------*/

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
                outputStream = new FileOutputStream("/home/puneet/Desktop/output.txt");
                inputStream = new FileInputStream("/home/puneet/Desktop/input.txt");
            }
        } catch (Exception ignored) {
        }
        out = new PrintWriter(outputStream);
        in = new FastInput(inputStream);
    }
    private void maualAssert(int a,int b,int c){
        if(a<b || a>c) throw new RuntimeException();
    }
    private void maualAssert(long a,long b,long c){
        if(a<b || a>c) throw new RuntimeException();
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
    private long ModPow(long x, long y, long MOD) {
        long res = 1L;
        x = x % MOD;
        while (y >= 1L) {
            if ((y & 1L) > 0) res = (res * x) % MOD;
            x = (x * x) % MOD;
            y >>= 1L;
        }
        return res;
    }
    private int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
    private long gcd(long a, long b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
    private int[] arrInt(int n){
        int[] arr=new int[n];for(int i=0;i<n;++i)arr[i]=in.ni();
        return arr;
    }
    private long[] arrLong(int n){
        long[] arr=new long[n];for(int i=0;i<n;++i)arr[i]=in.nl();
        return arr;
    }

    private int arrMax(int[] arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;++i){
            ans = max(ans,arr[i]);
        }
        return ans;
    }
 
    private long arrMax(long[] arr){
        long ans = arr[0];
        for(int i=1;i<arr.length;++i){
            ans = max(ans,arr[i]);
        }
        return ans;
    }
 
    private int arrMin(int[] arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;++i){
            ans = max(ans,arr[i]);
        }
        return ans;
    }
 
    private long arrMin(long[] arr){
        long ans = arr[0];
        for(int i=1;i<arr.length;++i){
            ans = max(ans,arr[i]);
        }
        return ans;
    }
    
    static class FastInput { InputStream obj;
        public FastInput(InputStream obj) {
            this.obj = obj;
        }
        private byte inbuffer[] = new byte[1024];
        private int lenbuffer = 0, ptrbuffer = 0;
        private int readByte() { if (lenbuffer == -1) throw new InputMismatchException();
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
        private boolean isSpaceChar(int c) {
            return (!(c >= 33 && c <= 126));
        }
        int skip() { int b;while ((b = readByte()) != -1 && isSpaceChar(b)) ;return b; }
        float nf() {return Float.parseFloat(ns());}
        double nd() {return Double.parseDouble(ns());}
        char nc() {return (char) skip();}
    }

}
