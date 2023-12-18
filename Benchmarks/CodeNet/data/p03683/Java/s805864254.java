import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ConsoleIO io = new ConsoleIO(new InputStreamReader(System.in), new PrintWriter(System.out));
        //String test = "A-large-practice";
        //ConsoleIO io = new ConsoleIO(new FileReader("D:\\Dropbox\\code\\practice\\jb\\src\\" + test + ".in"), new PrintWriter(new File("D:\\Dropbox\\code\\practice\\jb\\src\\" + test + "-out.txt")));

//        Random rand = new Random(19);
//        int tests = 100000;
//        for(int step = 0 ;step<tests;step++){
//            int n = rand.nextInt(1)+8;
//            char[] init = new char[n];
//            char[] moved = new char[n];
//            for(int i = 0;i<n;i++){
//                init[i] = (char)(rand.nextInt(26) + 'a');
//                moved[i] = init[i];
//            }
//
//            int m = rand.nextInt(2)+1;
//            for(int i = 0;i<m;i++){
//                int a = rand.nextInt(n);
//                int b = rand.nextInt(n);
//                int from = Math.min(a,b);
//                int to = Math.max(a,b);
//                if(a==b)continue;
//                char first= moved[from];
//                for(int j =from;j<to;j++)
//                    moved[j] = moved[j+1];
//                moved[to] = first;
//            }
//
//            int res = compute(moved,init);
//            if(res>m){
//                io.writeLine(new String(moved));
//                io.writeLine(new String(init));
//                io.writeLine(m + " " + res);
//            }
//        }

       new Main(io).solve();

        io.close();
    }

    ConsoleIO io;
    Main(ConsoleIO io) {
        this.io = io;
    }

    List<List<Integer>> gr1 = new ArrayList<>();
    List<List<Integer>> gr2 = new ArrayList<>();
    long MOD = 1_000_000_007;

    int N, M, K;
    public void solve() {
        int a = io.ri();
        int b = io.ri();
        if(Math.abs(a-b)>1){
            io.writeLine("0");
            return;
        }
        long res = 1;
        for(int i = 2;i<=a;i++){
            res = (res*i)%MOD;
        }
        for(int i = 2;i<=b;i++){
            res = (res*i)%MOD;
        }
        if(a==b) res = (res *2) %MOD;
        io.writeLine(res+"");
    }
}

class ConsoleIO {
    BufferedReader br;
    PrintWriter out;
    public ConsoleIO(Reader reader, PrintWriter writer){br = new BufferedReader(reader);out = writer;}
    public void flush(){this.out.flush();}
    public void close(){this.out.close();}
    public void writeLine(String s) {this.out.println(s);}
    public void writeInt(int a) {this.out.print(a);this.out.print(' ');}
    public void writeWord(String s){
        this.out.print(s);
    }
    public void writeIntArray(int[] a, int k, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i > 0) sb.append(separator);
            sb.append(a[i]);
        }
        this.writeLine(sb.toString());
    }
    public int read(char[] buf, int len){try {return br.read(buf,0,len);}catch (Exception ex){ return -1; }}
    public String readLine() {try {return br.readLine();}catch (Exception ex){ return "";}}
    public long[] readLongArray() {
        String[]n=this.readLine().trim().split("\\s+");long[]r=new long[n.length];
        for(int i=0;i<n.length;i++)r[i]=Long.parseLong(n[i]);
        return r;
    }
    public int[] readIntArray() {
        String[]n=this.readLine().trim().split("\\s+");int[]r=new int[n.length];
        for(int i=0;i<n.length;i++)r[i]=Integer.parseInt(n[i]);
        return r;
    }
    public int[] readIntArray(int n) {
        int[] res = new int[n];
        char[] all = this.readLine().toCharArray();
        int cur = 0;boolean have = false;
        int k = 0;
        boolean neg = false;
        for(int i = 0;i<all.length;i++){
            if(all[i]>='0' && all[i]<='9'){
                cur = cur*10+all[i]-'0';
                have = true;
            }else if(all[i]=='-') {
                neg = true;
            }
            else if(have){
                res[k++] = neg?-cur:cur;
                cur = 0;
                have = false;
                neg = false;
            }
        }
        if(have)res[k++] = neg?-cur:cur;
        return res;
    }
    public int ri() {
        try {
            int r = 0;
            boolean start = false;
            boolean neg = false;
            while (true) {
                int c = br.read();
                if (c >= '0' && c <= '9') {
                    r = r * 10 + c - '0';
                    start = true;
                } else if (!start && c == '-') {
                    start = true;
                    neg = true;
                } else if (start || c == -1) return neg ? -r : r;
            }
        } catch (Exception ex) {
            return -1;
        }
    }
    public long readLong() {
        try {
            long r = 0;
            boolean start = false;
            boolean neg = false;
            while (true) {
                int c = br.read();
                if (c >= '0' && c <= '9') {
                    r = r * 10 + c - '0';
                    start = true;
                } else if (!start && c == '-') {
                    start = true;
                    neg = true;
                } else if (start || c == -1) return neg ? -r : r;
            }
        } catch (Exception ex) {
            return -1;
        }
    }
    public String readWord() {
        try {
            boolean start = false;
            StringBuilder sb = new StringBuilder();
            while (true) {
                int c = br.read();
                if (c!= ' ' && c!= '\r' && c!='\n' && c!='\t') {
                    sb.append((char)c);
                    start = true;
                } else if (start || c == -1) return sb.toString();
            }
        } catch (Exception ex) {
            return "";
        }
    }
    public char readSymbol() {
        try {
            while (true) {
                int c = br.read();
                if (c != ' ' && c != '\r' && c != '\n' && c != '\t') {
                    return (char) c;
                }
            }
        } catch (Exception ex) {
            return 0;
        }
    }
    //public char readChar(){try {return (char)br.read();}catch (Exception ex){ return 0; }}
}
class Pair {
    public Pair(int a, int b) {this.a = a;this.b = b;}
    public int a;
    public int b;
}
class PairLL {
    public PairLL(long a, long b) {this.a = a;this.b = b;}
    public long a;
    public long b;
}
class Triple {
    public Triple(int a, int b, int c) {this.a = a;this.b = b;this.c = c;}
    public int a;
    public int b;
    public int c;
}