

import java.math.*;
import java.io.*;
import java.util.*;
import java.lang.*;

//solution classes here

public class Main {

    //main solution here

    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static long mod = (long)1e9+7;
    static long MOD = 998244353;
    static long INF = (long)1e18;
    static int inf = (int)1e9;
    //static ArrayList<Integer> list[] = new ArrayList[(int)3e3+1];
    //static int color[] = new int[(int)2e6+1];
    //static int visit[] = new int[(int)1e4+1];
    //static int level[] = new int[(int)1e4+1];
    //static Deque<Integer> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        double a,b,h,m;
        a = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();
        m = sc.nextDouble();
        h= h + m/60;
        double y = 2 * a * b * Math.cos((Math.PI*Math.abs(h*30-m*6))/180);
        double ans = a*a+b*b-y;
        out.println(Math.sqrt(ans));

        out.flush();
        out.close();
    }

    //solution functions here

    //---templates---
    public static boolean ispal(char[] c) {
        int n = c.length;
        for(int i=0;i<n/2;i++) {
            if(c[i]!=c[n-i-1])
                return false;
        }
        return true;
    }

    static long pow(long base, long exp)
    {
        long t = 1L;
        while (exp > 0) {
            if (exp % 2 != 0)
                t = (t * base) % mod;

            base = (base * base) % mod;
            exp /= 2;
        }
        return t % mod;
    }
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

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
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