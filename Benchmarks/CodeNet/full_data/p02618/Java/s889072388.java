import java.io.*;
import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    
    long startTime = 0, endTime = 0, timeLimit = 2000, eps = 200;
    Random rnd = new Random(System.currentTimeMillis());
    
    int D = 365, K = 26;
    long[] c;
    long[][] s;
    
    int[] tmp, ans;
    long tmpScore = 0, ansScore = 0;
    
    //[l,r)c
    int randomLR(int l, int r){
        return rnd.nextInt(r - l) + l;
    }
    
    void solve(){
        startTime = System.currentTimeMillis();
        endTime = startTime + timeLimit - eps;
        input();
        init();
        while(System.currentTimeMillis() < endTime){
            simulation();
        }
        output();
    }
    
    void input(){
        D = in.nextInt();
        c = new long[K];
        for(int i = 0; i < K; i++){
            c[i] = in.nextLong();
        }
        s = new long[D][K];
        for(int i = 0; i < D; i++){
            for(int j = 0; j < K; j++){
                s[i][j] = in.nextLong();
            }
        }
        tmp = new int[D];
        ans = new int[D];
    }
    
    void init(){
        for(int i = 0; i < D; i++){
            ans[i] = i % 26;
        }
        
        ansScore = 0;
        for(int i = 0; i < D; i++){
            ansScore += s[i][ans[i]];
        }
        for(int k = 0; k < K; k++){
            ansScore -= calc(k, ans);
        }
    }
    
    void simulation(){
        int d = randomLR(0, D);
        for(int j = 0; j < K; j++){
            eval(d, j);
            if(tmpScore > ansScore){
                ansScore = tmpScore;
                ans = Arrays.copyOf(tmp, tmp.length);
            }
        }
    }
    
    void eval(int d, int q){
        int p = ans[d];
        tmpScore = ansScore;
        tmp = Arrays.copyOf(ans, ans.length);
        
        tmpScore -= s[d][p];
        tmpScore += s[d][q];
        
        tmpScore += calc(p, tmp);
        tmpScore += calc(q, tmp);
        tmp[d] = q;
        tmpScore -= calc(p, tmp);
        tmpScore -= calc(q, tmp);
    }
    
    long calc(int k, int[] arr){
        int dist = 0;
        long res = 0;
        for(int i = 0; i < D; i++){
            if(k == arr[i]){
                dist = 0;
            }else{
                dist++;
            }
            res += dist * c[k];
        }
        return res;
    }
    
    void output(){
        for(int i = 0; i < D; i++){
            out.println(ans[i] + 1);
        }
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
        
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        
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