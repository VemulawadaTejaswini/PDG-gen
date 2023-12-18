
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int h,w,arr[][],dx[],dy[];
    static long memo[][];
    static final int inf=(int)(1e9+7);
    public static void main(String[] args) throws Exception {
        //============================================//
        //answer here:
        h=scanner.nextInt(); w=scanner.nextInt();
        memo=new long[h][w];
        arr=new int[h][w];
        dx=new int[]{0,1};
        dy=new int[]{1,0};
        for (int i=0; i<h; i++){
            String s=scanner.nextLine();
            for (int j=0; j<w; j++){
                if (s.charAt(j)=='.') arr[i][j]=0;
                else arr[i][j]=1;
            }
        }
        for (long[] a: memo){
            Arrays.fill(a,-1);
        }
        long ans=solve(0,0)%inf;
        out.println(ans);
        //============================================//
        out.close();
    }
    public static boolean valid(int x, int y){
        return (x>=0 && x<h && y>=0 && y<w && arr[x][y]==0);
    }
    static long solve(int i, int j){
        long cnt=0;
        if (i==w-1 && j==h-1) return 1;
        if (memo[i][j]!=-1) return memo[i][j];
        for (int idx=0; idx<2; idx++){
            if (valid(i+dy[idx],j+dx[idx]))
                cnt+=solve(i+dy[idx],j+dx[idx]);
        }
        return memo[i][j]=cnt;
    }

}
class Scanner {
    StringTokenizer st;
    BufferedReader br;

    public Scanner(InputStream system) {
        br = new BufferedReader(new InputStreamReader(system));
    }

    public Scanner(String file) throws Exception {
        br = new BufferedReader(new FileReader(file));
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public char nextChar() throws IOException {
        return next().charAt(0);
    }

    public Long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public boolean ready() throws IOException {
        return br.ready();
    }

    public void waitForInput() throws InterruptedException {
        Thread.sleep(3000);
    }

    int[] readArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    long[] readLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
}

class pair implements Comparable<pair> {
    int u;
    int v;

    public pair(int u, int v) {
        this.u= u;
        this.v = v;
    }

    @Override
    public String toString() {
        return v+""+u;
    }

    @Override
    public int compareTo(pair o) {
        return o.v-v;
    }
}
