/*Author: Satyajeet Singh, Delhi Technological University*/
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
    static HashSet<Pair> graph[];
    static boolean oj = System.getProperty("ONLINE_JUDGE") != null;
/****************************************Solutions Begins***************************************/
    static int D[],L[][],ln,q,n,sol[],qcost[],qcol[],curcost[],freq[];
    static ArrayList<Integer> queries[];
    static void dfs1(int start,int par,int d){
        D[start]=d;
        L[start][0]=par;
        for(int i=1;i<ln;i++){
            L[start][i]=L[L[start][i-1]][i-1];
        }
        for(Pair p:graph[start]){
            if(p.u==par)continue;
            dfs1(p.u,start,d+1);
        }
    }
    static int lca(int u,int v){
        if(D[u]<D[v]){
            int t=u;
            u=v;
            v=t;
        }
        int diff=D[u]-D[v];
        for(int i=0;i<ln;i++){
            if((diff&(1<<i))!=0){
                u=L[u][i];
            }
        }
        if(u==v)return u;
        for(int i=ln-1;i>=0;i--){
            if(L[u][i]!=L[v][i]){
                u=L[u][i];
                v=L[v][i];
            }
        }
        return L[u][0];
    }
    static void dfs(int start,int par,int cst){
        for(int u:queries[start]){
            int sgn=1;
            if(u<0)sgn=-2;
            u=Math.abs(u);
            sol[u]+=sgn*(cst+freq[qcol[u]]*qcost[u]-curcost[qcol[u]]);
        }
        for(Pair p:graph[start]){
            if(p.u==par)continue;
            freq[p.v]++;
            curcost[p.v]+=p.d;
            dfs(p.u,start,cst+p.d);
            freq[p.v]--;
            curcost[p.v]-=p.d;
        }
    }
    public static void main (String[] args) throws Exception {
        String st[]=nl();
        n=pi(st[0]);
        q=pi(st[1]);
        Makegraph(n+1);
        for(int i=0;i<n-1;i++){
            st=nl();
            int a=pi(st[0]);
            int b=pi(st[1]);
            int c=pi(st[2]);
            int d=pi(st[3]);
            addEdge(a,b,c,d);
            addEdge(b,a,c,d);
        }
        ln=20;
        L=new int[n+1][ln];
        D=new int[n+1];
        dfs1(1,1,0);
        sol=new int[q+1];
        qcost=new int[q+1];
        qcol=new int[q+1];
        queries=new ArrayList[n+1];
        freq=new int[n+1];
        curcost=new int[n+1];
        for(int i=1;i<=n;i++){
            queries[i]=new ArrayList<>();
        }
        for(int i=1;i<=q;i++){
            st=nl();
            int a=pi(st[0]);
            int b=pi(st[1]);
            int c=pi(st[2]);
            int d=pi(st[3]);
            int u=lca(c,d);
            qcol[i]=a;
            qcost[i]=b;
            queries[c].add(i);
            queries[d].add(i);
            queries[u].add(-i);
        }
        dfs(1,1,0);
        for(int i=1;i<=q;i++){
            out.println(sol[i]);
        }
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
/****************************************Template Begins************************************************/
    static String[] nl() throws Exception{
        return br.readLine().split(" ");
    }
    static String[] nls() throws Exception{
        return br.readLine().split("");
    }
    static int pi(String str) {
        return Integer.parseInt(str);
    }
    static long pl(String str){
        return Long.parseLong(str);
    }
    static double pd(String str){
        return Double.parseDouble(str);
    }
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.000000000000000000000"); 
        out.println(ft.format(d));
    }
/**************************************Bit Manipulation**************************************************/
    static void printMask(long mask){
        System.out.println(Long.toBinaryString(mask));
    }
    static int countBit(int mask){
        int ans=0;
        while(mask!=0){
            if(mask%2==1){
                ans++;
            }
            mask/=2;
        }
        return ans;
    }
/******************************************Graph*********************************************************/
    static void Makegraph(int n){
        graph=new HashSet[n];
        for(int i=0;i<n;i++){
            graph[i]=new HashSet<>();
        }
    }
    // static void addEdge(int a,int b){
    //     graph[a].add(new Pair(b,1));
    // }
    static void addEdge(int a,int b,int c,int d){
        graph[a].add(new Pair(b,c,d));
    }    
/*********************************************PAIR********************************************************/
    static class PairComp implements Comparator<Pair>{
        public int compare(Pair p1,Pair p2){
            return p1.u-p2.u;
        }
    }
    static class Pair implements Comparable<Pair> {
        int u;
        int v;
        int d;
        int index=-1;
        public Pair(int u, int v,int d) {
            this.u = u;
            this.v = v;
            this.d = d;
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
    static class PairCompL implements Comparator<Pairl>{
        public int compare(Pairl p1,Pairl p2){
            if(p1.u-p2.u<0){
                return -1;
            }
            else if(p1.u-p2.u>0){
                return 1;
            }
            else{
                if(p1.v-p2.v<0){
                    return -1;
                }
                else if(p1.v-p2.v>0){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        }
    }
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
    public static void debug(Object... o) {
        if(!oj)
        System.out.println(Arrays.deepToString(o));
    }
/************************************MODULAR EXPONENTIATION***********************************************/
    static long modulo(long a,long b,long c) {
        long x=1;
        long y=a;
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
    static long gcd(long x, long y)
    {
        if(x==0)
            return y;
        if(y==0)
            return x;
        long r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0)
        {
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