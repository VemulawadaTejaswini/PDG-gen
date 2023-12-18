import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    final static int MOD = (int)1e9+7;
    final static long INF = Long.MAX_VALUE / 2;
    
    void solve(){
        int H = in.nextInt(), W = in.nextInt(), K = in.nextInt();
        CumulativeSum2D cs = new CumulativeSum2D(H, W);
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(in.nextChar() == '1') cs.addPoint(i, j, 1);
            }
        }
        cs.build();
        
        int min = Integer.MAX_VALUE;
        LOOP:for(int i = 0; i < (1 << (H - 1)); i++){
            int sum = Integer.bitCount(i);
            int px = 0, rx = 0;
            while(px < W){
                while(rx <= W){
                    boolean isOk = true;
                    int py = 0;
                    for(int j = 0; j < H; j++){
                        if((j < H - 1) && ((i >> j) & 1) == 0) continue;
                        if(i == 0b10){
                            //out.println("i " + py + " " + px + " " + (j + 1) + " " + rx);
                            //out.println(cs.getRectangle(py, px, j + 1, rx));
                        }
                        isOk &= (cs.getRectangle(py, px, j + 1, rx) <= K);
                        py = j;
                    }
                    if(isOk){
                        rx++;
                        continue;
                    }else{
                        break;
                    }
                }
                if(px == rx){
                    continue LOOP;
                }
                sum++;
                rx--;
                //if(i == 0b10) out.println(px + " " + rx);
                px = rx + 1;
                rx = px;
                if(i == 0b10){
                    //out.println("rx " + rx);
                }
            }
            sum--;
            min = Math.min(min, sum);
            if(i == 0b10){
                //out.println(sum);
            }
        }
        out.println(min);
    }
    
    class CumulativeSum2D {
        long[][] data;
        boolean isBuilt;
        
        public CumulativeSum2D(int H, int W){
            data = new long[H+1][W+1];
            isBuilt = false;
        }
        
        //0-indexed
        public void addPoint(int y, int x, long z){
            data[y+1][x+1] += z;
            isBuilt = false;
        }
        
        public void build(){
            for(int i = 1; i < data.length; i++){
                for(int j = 1; j < data[i].length; j++){
                    data[i][j] += data[i][j-1] + data[i-1][j] - data[i-1][j-1];
                }
            }
            isBuilt = true;
        }
        
        //矩形[y1,y2),[x1,x2)の和
        public long getRectangle(int y1, int x1, int y2, int x2){
            if(!isBuilt) System.err.println("Error : vector is not built .");
            return (data[y2][x2] - data[y2][x1] - data[y1][x2] + data[y1][x1]);
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