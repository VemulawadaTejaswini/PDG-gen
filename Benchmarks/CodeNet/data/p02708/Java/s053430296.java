//import java.math.*;
import java.io.*;
import java.util.*;
//import java.lang.*;

//solution classes here

public class Main {

    //main solution here

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static long mod = (long)1e9+7;
    static long MOD = 998244353;
    //static ArrayList<Integer> list[] = new ArrayList[(int)1e4+1];
    //static int color[] = new int[(int)2e6+1];
    //static int visit[] = new int[(int)1e4+1];
    //static int level[] = new int[(int)1e4+1];
    //static Deque<Integer> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long a[] = new long[(int)n+2];
        //long ans=0;
        for(long i=1;i<=n+1;i++) {
            long min = (i*(i-1))/2;
            long max = (n*(n+1))/2-(n-i+1)*(n-i)/2;
            a[(int)i]+=(max-min+1)%mod;
        }
        long ans=0;
        for(long i=k;i<n+2;i++) {
            ans += a[(int)i];
        }

        out.println(ans%mod);

        //out.println("Case #"+(test-t)+": "+fh+" "+fv);
        out.flush();
        out.close();
    }

    //solution functions here


    //---templates---
    public static void reverse (long[] array) {
        int len = array.length;
        for(int i=0;i<len/2;i++) {
            array[i]^=array[len-1-i];
            array[len-i-1]^=array[i];
            array[i]^=array[len-i-1];
        }
    }

    public static int low_bound(long[] array, long value) {
        int len = array.length;
        int lo = 0;
        int hi = len-1;
        int ans = -1;
        while(lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if(array[mid]<=value) {
                lo=mid+1;
                ans=mid;
            }
            else
                hi=mid-1;
        }
        return ans;
    }

    public static int up_bound(long[] array, long value) {
        int len = array.length;
        int lo = 0;
        int hi = len-1;
        int ans = -1;
        while(lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if(array[mid]>=value) {
                hi=mid-1;
                ans=mid;
            }
            else
                lo=mid+1;
        }
        return ans;
    }

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