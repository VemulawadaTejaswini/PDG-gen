import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ConsoleIO io = new ConsoleIO(new InputStreamReader(System.in), new PrintWriter(System.out));
        //String test = "sample";
        //ConsoleIO io = new ConsoleIO(new FileReader("D:\\Dropbox\\code\\practice\\jb\\src\\" + test + ".in"), new PrintWriter(new File("D:\\Dropbox\\code\\practice\\jb\\src\\" + test + "-out.txt")));

        new Main(io).solve();
        io.close();
    }

    ConsoleIO io;
    Main(ConsoleIO io) {
        this.io = io;
    }

    long MOD = 1_000_000_007;
    List<List<Integer>> gr = new ArrayList<>();
    public void solve() {
        int[] l = io.readIntArray();
        int H = l[0], W = l[1], K = l[2];
        int[][] map = new int[H][W];
        int sh = -1, sw = -1;
        for (int i = 0; i < H; i++) {
            char[] c = io.readLine().toCharArray();
            for (int j = 0; j < W; j++) {
                char cc = c[j];
                if (cc == 'S') {
                    sh = i;
                    sw = j;
                }
                if (cc == '#')
                    map[i][j] = 1;
            }
        }

        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0, -1};
        Queue<Place> queue = new LinkedList<>();
        queue.add(new Place(sh,sw, K));
        int res= 1000_000;
        while(queue.size()>0){
            Place p = queue.poll();
            if(p.c==0||p.c==W-1 || p.r==0 || p.r == H-1){
                res = 1;
                break;
            }
            int dist = Math.min(Math.min(p.r, H-1-p.r), Math.min(p.c, W-1-p.c));
            res = Math.min(res, (dist+K-1)/K+1);
            if(p.have==0) {
                continue;
            }
            for(int i = 0;i<4;i++) {
                int r = p.r + dr[i];
                int c = p.c + dc[i];
                if (map[r][c] == 0)
                    queue.add(new Place(r, c, p.have - 1));
            }
        }

        io.writeLine(res+"");
    }

    class Place{
        public Place(int r, int c, int have){
            this.r = r;
            this.c = c;
            this.have = have;
        }
        public int r;
        public int c;
        public int have;
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