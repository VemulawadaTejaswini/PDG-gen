import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;
import java.io.*;
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

public class Main {
    static int[][][]a;
    static int[][][]memo;
    static int n,m;
    static int inf = (int) 1e8;
    static int dp(int i,int j,int diff){
        if (i==n-1&&j==m){
            return Math.abs(diff-2000);
        }
        if (i==n&&j==m-1){
            return Math.abs(diff-2000);
        }
        if (i==n||j==m||diff>4000||diff<0)return inf;
        if (memo[i][j][diff]!=-1)return memo[i][j][diff];
        int x1=a[i][j][0]-a[i][j][1];
        int x2=-a[i][j][0]+a[i][j][1];
        int ans =inf;
        ans=Math.min(ans,dp(i+1,j,diff+x1));
        ans=Math.min(ans,dp(i,j+1,diff+x1));
        ans=Math.min(ans,dp(i+1,j,diff+x2));
        ans=Math.min(ans,dp(i,j+1,diff+x2));
        return memo[i][j][diff]=ans;
    }
    static class Arr implements Comparable<Arr>{
        int[]a;
        Arr(int[]x){
            a=x;
        }
        @Override
        public int compareTo(Arr arr) {
            for (int i =0;i<4;i++){
                if (a[i]!=arr.a[i])return a[i]-arr.a[i];
            }
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = sc.nextInt();
        m = sc.nextInt();
        a=new int[n][m][2];
        for (int i =0;i<n;i++){
            for (int j =0;j<m;j++)
                a[i][j][0]=sc.nextInt();
        }
        for (int i =0;i<n;i++){
            for (int j =0;j<m;j++)
                a[i][j][1]=sc.nextInt();
        }
        memo=new int[n][m][2*2000+1];
        for (int[][]x:memo)for (int[]z:x)Arrays.fill(z,-1);
        pw.println(dp(0,0,2000));
        pw.flush();
    }
    static class UnionFind {
        int[] p, rank, setSize;
        int numSets;
        HashSet<Integer>[]ele;
        public UnionFind(int N)
        {
            ele=new HashSet[N];
            p = new int[numSets = N];
            rank = new int[N];
            setSize = new int[N];
            for (int i = 0; i < N; i++) {
                ele[i]=new HashSet<>();
                p[i] = i; setSize[i] = 1;
                ele[i].add(i);
            }
        }

        public int findSet(int i) { return p[i] == i ? i : (p[i] = findSet(p[i])); }

        public boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }

        public void unionSet(int i, int j)
        {
            if (isSameSet(i, j))
                return;
            numSets--;
            int x = findSet(i), y = findSet(j);
            if(rank[x] > rank[y]) {
                for (int zz:ele[y])ele[x].add(zz);
                p[y] = x; setSize[x] += setSize[y]; }
            else
            {	for (int zz:ele[x])ele[y].add(zz);
                p[x] = y; setSize[y] += setSize[x];
                if(rank[x] == rank[y]) rank[y]++;
            }
        }

        public int numDisjointSets() { return numSets; }

        public int sizeOfSet(int i) { return setSize[findSet(i)]; }
    }
    static long gcd(long a, long b) {
        if (a == 0) return b;
        return gcd(b % a, a);
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