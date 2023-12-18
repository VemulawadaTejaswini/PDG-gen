import java.io.*;
import java.util.*;
public class Main {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////                                                                                                               /////////
////////                                                                                                               /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMMMM      MMMMMM      OOO      OOO        SSSS   SSS     EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEE           MMMM MMM  MMM MMMM    OOO          OOO    SSSS       SSS   EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM  MMMMMM  MMMM   OOO            OOO   SSSS             EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM  OOO              OOO   SSSSSSS         EEEEE          /////////
////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO      SSSSSS       EEEEEEEEEEE    /////////
////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO         SSSSSSS   EEEEEEEEEEE    /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM   OOO            OOO              SSSS  EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM    OOO          OOO     SSS       SSSS  EEEEE          /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM      OOO      OOO        SSS    SSSS    EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////
////////                                                                                                               /////////
////////                                                                                                               /////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static int mod = (int) (1e9 + 7);
    // static int n;
    static StringBuilder sol;

    static class pair implements Comparable<pair> {
        int out, in;
        public pair(int x, int y) {
            out= x;
            in = y;

        }

        public int compareTo(pair o) {
            return o.in-in==0?out-o.out:o.in-in;
        }

        public String toString() {
            return out + " " + in;
        }
    }

    static class tri implements Comparable<tri> {
        int st, end,len, side;

        tri(int a, int b, int c,int d) {
            st = a;
            end = b;
            len = c;
            side=d;
        }

        public int compareTo(tri o) {
            if (st == o.st) return end - o.end;
            return st - o.st;
        }

        public String toString() {
            return st + " " + end ;
        }
    }
    static  class  p implements Comparable<p>{
        int val,idx;
        p(int a ,int b){
            val=a;
            idx=b;
        }

        @Override
        public int compareTo(p o) {
            if (o.val!=val)return o.val-val;
            return idx-o.idx;
        }
    }
    static long[][]memo;
    static int[]a;
    static long dp(int iseq,int idx){
        if (idx==a.length)return 1;
        if (memo[iseq][idx]!=-1)return memo[iseq][idx];
        long ans =0;
        if (iseq==1){
            if (a[idx]==0){
                ans+=dp(1,idx+1)%mod;
            }
            else {
                ans+=dp(0,idx+1)%mod;
                ans+=2*dp(1,idx+1)%mod;
            }
        }
        else {
            ans+=dp(0,idx+1)%mod;
            ans+=2*dp(0,idx+1)%mod;
        }
        return memo[iseq][idx]=ans%mod;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //FileWriter f = new FileWriter("C:\\Users\\Ibrahim\\out.txt");
        PrintWriter pw = new PrintWriter(System.out);
        String s = sc.nextLine();
        a= new int[s.length()];
        for (int i =0;i<s.length();i++){
            a[i]=s.charAt(i)-'0';
        }
        memo= new long[2][s.length()+1];
        for (long[]x:memo)Arrays.fill(x,-1);
        pw.println(dp(1,0));
        pw.flush();
    }
    static ArrayList<Integer> primes;
    static int[] isComposite;

    static void sieve(int N)	// O(N log log N)
    {
        isComposite = new int[N+1];
        isComposite[0] = isComposite[1] = 1;			// 0 indicates a prime number
        primes = new ArrayList<Integer>();

        for (int i = 2; i <= N; ++i) 					//can loop till i*i <= N if primes array is not needed O(N log log sqrt(N))
            if (isComposite[i] == 0) 					//can loop in 2 and odd integers for slightly better performance
            {
                primes.add(i);
                if(1l * i * i <= N)
                    for (int j = i * i; j <= N; j += i)	// j = i * 2 will not affect performance too much, may alter in modified sieve
                        isComposite[j] = 1;
            }
    }
    static long gcd(long a ,long b){
        if (a==0)return b;
        return gcd(b%a,a);
    }
    static int inver(long x,int mod){
        int a = (int) x;
        int e=(mod-2);
        int res = 1;
        while(e > 0)
        {
            if((e & 1) == 1) {
                //System.out.println(res*a);
                res = (int) ((1l*res * a) % mod);
            }
            a = (int) ((1l*a * a) % mod);
            e >>= 1;
        }
        //out.println(res+" "+x);
        return res%mod;
    }
    static class UnionFind {
        int[] p, rank, setSize;
        int numSets;

        public UnionFind(int N)
        {
            p = new int[numSets = N];
            rank = new int[N];
            setSize = new int[N];
            for (int i = 0; i < N; i++) {  p[i] = i; setSize[i] = 1; }
        }

        public int findSet(int i) { return p[i] == i ? i : (p[i] = findSet(p[i])); }

        public boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }

        public void unionSet(int i, int j)
        {
            if (isSameSet(i, j))
                return;
            numSets--;
            int x = findSet(i), y = findSet(j);
            if(rank[x] > rank[y]) { p[y] = x; setSize[x] += setSize[y]; }
            else
            {	p[x] = y; setSize[y] += setSize[x];
                if(rank[x] == rank[y]) rank[y]++;
            }
        }

        public int numDisjointSets() { return numSets; }

        public int sizeOfSet(int i) { return setSize[findSet(i)]; }
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
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

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}