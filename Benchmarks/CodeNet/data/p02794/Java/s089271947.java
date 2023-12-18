/***********************************************************************************************/
    import java.io.*;
    import java.util.*;
    import java.text.*; 
    import java.lang.*;
    import java.math.*;
public class Main{
/*********************************************Constants******************************************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    static boolean sieve[];
    static ArrayList<Integer> primes;
    static long factorial[],invFactorial[];
    static ArrayList<Integer> graph[];
    static int pptr=0;
    static String st[];
/****************************************Solutions Begins***************************************/
    static int n;
    static int a,b;
    static int dp[];
    static int lca[][];
    static int Lca(int start,int par){
        if(start==a||start==b){
            return start;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int u:graph[start]){
            if(u==par)continue;
            int d=Lca(u,start);
            if(d!=0)
                set.add(d);
        }
      //  debug(start,set,a,b);

        if(set.size()==0)return 0;
        else if(set.size()==1){
            for(int u:set)return u;
        }
        return start;
    }
    static void update(int u,int v){
        dp[u]--;
        dp[v]++;
    }
    static int c=0;

    static int dfs(int start,int par){
        int sm=0;
        for(int u:graph[start]){
            if(u==par)continue;
            int y=dfs(u,start);
            if(y!=0){
               // debug(u,start);
                c++;
            }
            sm+=y;
        }
        sm+=dp[start];

      //  debug(start,sm,c);

        return sm;
    }
    public static void main(String args[]) throws Exception{
        nl();
        n=pi();
        Makegraph(n+1);
        for(int i=0;i<n-1;i++){
            nl();
            int a=pi();
            int b=pi();
            addEdge(a,b);
            addEdge(b,a);
        }
        lca=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(lca[j][i]!=0){
                    lca[i][j]=lca[j][i];
                    continue;
                }
                a=i;
                b=j;
                lca[i][j]=Lca(1,-1);
            }
        }
        // a=7;
        // b=8;

        // debug(Lca(1,-1));

        nl();
        int m=pi();
        int arr[][]=new int[n][2];
        for(int i=0;i<m;i++){
            nl();
            arr[i][0]=pi();
            arr[i][1]=pi();
        }
       // debug(lca[7][8]);

        dp=new int[n+1];
    

        long ans=0;
        for(int mask=1;mask<(1<<m);mask++){
            Arrays.fill(dp,0);
            int nm=0;
            for(int i=0;i<m;i++){
                if((mask&(1<<i))==0)continue;
                nm++;
                update(lca[arr[i][0]][arr[i][1]],arr[i][0]);
                update(lca[arr[i][0]][arr[i][1]],arr[i][1]);
            }
            c=0;
            dfs(1,-1);
        //     printMask(mask);
        //     debug(c);

        //    debug(dp);

            if(nm%2==1)
                ans+=(1l<<(n-1-c));
            else
                ans-=(1l<<(n-1-c));
              //  break;
        }
        
        ans=((1l<<(n-1))-ans);
        out.println(ans);
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
/****************************************Template Begins************************************************/
    static void nl() throws Exception{
        pptr=0;
        st=br.readLine().split(" ");
    }
    static void nls() throws Exception{
        pptr=0;
        st=br.readLine().split("");
    }
    static int pi(){
        return Integer.parseInt(st[pptr++]);
    }
    static long pl(){
        return Long.parseLong(st[pptr++]);
    }
    static double pd(){
        return Double.parseDouble(st[pptr++]);
    }
    static String ps(){
        return st[pptr++];
    }
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.000000000000"); 
        out.print(ft.format(d));
    }
/**************************************Bit Manipulation**************************************************/
    static void printMask(long mask){
        System.out.println(Long.toBinaryString(mask));
    }
    static int countBit(long mask){
        int ans=0;
        while(mask!=0){
            mask&=(mask-1);
            ans++;
        }
        return ans;
    }
/******************************************Graph*********************************************************/
    static void Makegraph(int n){
        graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
    }
    static void addEdge(int a,int b){
        graph[a].add(b);
    }
    // static void addEdge(int a,int b,int c){
    //     graph[a].add(new Pair(b,c));
    // }    
/*********************************************PAIR********************************************************/
    static class Pair implements Comparable<Pair> {
        int u;
        int v;
        int index=-1;
        public Pair(int u, int v) {
            this.u = u;
            this.v = v;
        }
        public int hashCode() {
            int hu = (int) (u ^ (u >>> 32));
            int hv = (int) (v ^ (v >>> 32));
            return 31 * hu + hv;
        }
        public boolean equals(Object o) {
            Pair other = (Pair) o;
            return u == other.u && v == other.v;
        }
        public int compareTo(Pair other) {
            if(index!=other.index)
                return Long.compare(index, other.index);
            return Long.compare(v, other.v)!=0?Long.compare(v, other.v):Long.compare(u, other.u);
        }
        public String toString() {
            return "[u=" + u + ", v=" + v + "]";
        }
    }
/******************************************Long Pair*******************************************************/
    static class Pairl implements Comparable<Pairl> {
            long u;
            long v;
            int index=-1;
            public Pairl(long u, long v) {
                this.u = u;
                this.v = v;
            }
            public int hashCode() {
                int hu = (int) (u ^ (u >>> 32));
                int hv = (int) (v ^ (v >>> 32));
                return 31 * hu + hv;
            }
            public boolean equals(Object o) {
                Pairl other = (Pairl) o;
                return u == other.u && v == other.v;
            }
            public int compareTo(Pairl other) {
                if(index!=other.index)
                    return Long.compare(index, other.index);
                return Long.compare(v, other.v)!=0?Long.compare(v, other.v):Long.compare(u, other.u);
            }
            public String toString() {
                return "[u=" + u + ", v=" + v + "]";
            }
        }
/*****************************************DEBUG***********************************************************/
    public static void debug(Object... o){
        System.out.println(Arrays.deepToString(o));
    }
/************************************MODULAR EXPONENTIATION***********************************************/
    static long modulo(long a,long b,long c){
        long x=1;
        long y=a%c;
        while(b > 0){
            if(b%2 == 1){
                x=(x*y)%c;
            }
            y = (y*y)%c; // squaring the base
            b /= 2;
        }
        return  x%c;
    }
/********************************************GCD**********************************************************/
    static long gcd(long x, long y){
        if(x==0)
            return y;
        if(y==0)
            return x;
        long r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
/******************************************SIEVE**********************************************************/
    static void sieveMake(int n){
        sieve=new boolean[n];
        Arrays.fill(sieve,true);
        sieve[0]=false;
        sieve[1]=false;
        for(int i=2;i*i<n;i++){
            if(sieve[i]){
                for(int j=i*i;j<n;j+=i){
                    sieve[j]=false;
                }
            }
        }
        primes=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(sieve[i]){
                primes.add(i);
            }
        }        
    }
/********************************************End***********************************************************/
}