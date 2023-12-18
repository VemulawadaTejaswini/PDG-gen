import java.io.*;
import java.util.StringTokenizer;

//solution classes here

public class Main {

    //main solution here

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static long mod = (long)1e9+7;
    static long MOD = 998244353;
    //static ArrayList<Integer> list[] = new ArrayList[(int)1e6+1];
    //static int color[] = new int[(int)1e6+1];
    //static int visit[] = new int[(int)1e5+1];
    //static Deque<Integer> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        long a[] = new long[n+1];
        long dp[][] = new long[n+1][2];
        for(int i=1;i<=n;i++) {
            a[i]=sc.nextLong();
        }
        // Here dp[i][0] means excluding ith element and taking floor(i/2) total elements
        // Here dp[i][1] means including ith element and taking floor(i/2) total elements
        dp[2][0] = a[1];
        dp[2][1] = a[2];
        for(int i=3;i<=n;i++) {
            if(i%2==1) {
                dp[i][0] = Math.max(a[i-2]+dp[i-3][0],Math.max(a[i-1]+dp[i-2][0],a[i-1]+Math.max(dp[i-3][1],dp[i-3][0])));
                dp[i][1] = a[i]+Math.max(dp[i-3][0],Math.max(dp[i-3][1],Math.max(dp[i-2][0],dp[i-2][1])));
            }
            else {
                dp[i][1] = a[i]+Math.max(dp[i-2][0],Math.max(dp[i-2][1],dp[i-1][0]));
                dp[i][0] = a[i-1]+dp[i-2][0];
            }
        }

        out.println(Math.max(dp[n][0],dp[n][1]));


        out.flush();
        out.close();
    }
    //solution functions here

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}

/* *****************************************************************************************************************************
 * I'M NOT IN DANGER, I'M THE DANGER!!!
 * *****************************************************************************************************************************
 */