import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}
    long gcd(long a, long b){return b == 0 ? a : gcd(b, a % b);}
    long lcm(long a, long b){return a / gcd(a, b) * b;}
    
    ArrayList<Long> p = new ArrayList<>(), m = new ArrayList<>(), z = new ArrayList<>();
    int N;
    long K;
    long[] A;
    
    void solve(){
        N = in.nextInt();
        K = in.nextInt();
        A = in.nextLongArray(N);
        for(int i = 0; i < N; i++){
            if(A[i] > 0) p.add(A[i]);
            else if(A[i] < 0) m.add(A[i]);
            else z.add(A[i]);
        }
        long numM = (long)p.size() * m.size();
        long numP = (long)p.size() * (p.size() - 1) / 2 + (long)m.size() * (m.size() - 1) / 2;
        long numZ = (long)N * (N - 1) / 2 - numM - numP;
        
        if(K <= numM){
            //minus
            Collections.sort(p, Collections.reverseOrder());
            Collections.sort(m);
            long ok = -(long)1e18;
            long ng = 0;
            while(Math.abs(ok - ng) > 1){
                long mid = (ok + ng) / 2;
                if(isOk1(mid)) ok = mid;
                else ng = mid;
            }
            out.println(ok);
        }else if(K <= numM + numZ){
            //zero
            out.println("0");
        }else{
            //plus
            K -= numM + numZ;
            Collections.sort(p);
            Collections.sort(m, Collections.reverseOrder());
            long ok = 1;
            long ng = (long)1e18+1;
            while(Math.abs(ok - ng) > 1){
                long mid = (ok + ng) / 2;
                if(isOk2(mid)) ok = mid;
                else ng = mid;
            }
            out.println(ok);
        }
    }
    
    boolean isOk2(long k){
        long sum = 0;
        if(p.size() >= 2) for(int i = 0; i < p.size() - 1; i++) sum += num2(i, k);
        if(m.size() >= 2) for(int i = 0; i < m.size() - 1; i++) sum += num3(i, k);
        return sum < K;
    }
    
    int num2(int i, long k){
        int ok = 0, ng = p.size() - i;
        while(Math.abs(ok - ng) > 1){
            int mid = (ok + ng) / 2;
            if(p.get(i) * p.get(i+mid) < k) ok = mid;
            else ng = mid;
        }
        return ok;
    }
    
    int num3(int i, long k){
        int ok = 0, ng = m.size() - i;
        while(Math.abs(ok - ng) > 1){
            int mid = (ok + ng) / 2;
            if(m.get(i) * m.get(i+mid) < k) ok = mid;
            else ng = mid;
        }
        return ok;
    }
    
    boolean isOk1(long k){
        long sum = 0;
        for(int i = 0; i < p.size(); i++) sum += num1(i, k);
        return sum < K;
    }
    
    int num1(int i, long k){
        int ok = 0, ng = m.size()+1;
        while(Math.abs(ok - ng) > 1){
            int mid = (ok + ng) / 2;
            if(p.get(i) * m.get(mid-1) < k) ok = mid;
            else ng = mid;
        }
        return ok;
    }
    
    public static void main(String[] args) {
        new Main().m();
    }
    
    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "input.txt";
            out = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        solve();
        out.flush();
        in.close();
        out.close();
    }
    
    static class FastScanner {
        private Reader input;
        
        public FastScanner() {this(System.in);}
        public FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
        public void close() {
            try {
                this.input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        public int nextInt() {return (int) nextLong();}
        
        public long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
        
        public double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
        
        public char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
        
        public String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public String nextLine() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (b != -1 && b != '\n') {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }
        
        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }
        
        public int[] nextIntArray1Index(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextInt();
            }
            return res;
        }
        
        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }
        
        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }
        
        public long[] nextLongArray1Index(int n) {
            long[] res = new long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }
        
        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }
    }
}