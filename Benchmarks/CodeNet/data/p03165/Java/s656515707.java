
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
    static int n,m;
    static int memo[][];
    static String s,t;
    static StringBuilder sb;
    static final int inf=(int)(1e9+7);
    public static void main(String[] args) throws Exception {
        //============================================//
        //answer here:
        s=scanner.nextLine();
        t=scanner.nextLine();
        n=s.length();
        m=s.length();
        memo=new int[n][m];
        sb=new StringBuilder();
        for (int arr[]: memo) Arrays.fill(arr,-1);
        int ans=solve(0,0);
        out.println(ans);
        trace(0,0);
        out.println(sb);
        //============================================//
        out.close();
    }
    static int solve(int i, int j){
        if (i==n || j==m) return 0;
        if (memo[i][j]!=-1) return memo[i][j];
        int max=Math.max(solve(i+1,j),solve(i,j+1));  //only add to max when both idx move
        max = Math.max(max,(s.charAt(i)==t.charAt(j)?1:0)+solve(i + 1, j + 1));
        return memo[i][j]=max;
    }

    public static void trace(int i, int j){
        if (i==n || j==m) return;
        int cur=memo[i][j];
        if (s.charAt(i)==t.charAt(j) && solve(i+1,j+1)==cur-1){
            sb.append(s.charAt(i));
            trace(i+1,j+1);
        }else if(solve(i+1,j)==cur) trace(i+1,j);
        else trace(i,j+1);
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
