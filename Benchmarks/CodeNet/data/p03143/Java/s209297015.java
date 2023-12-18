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
    static ArrayList<Integer> graph[];
    static int pptr=0;
    static String st[];
/****************************************Solutions Begins***************************************/
    static class DSU{
        int dsu[];
        long dsu_size[];
        int unconnected=0;
        long wt[];
        Queue<Integer> pq[];
        DSU(int n){
            dsu=new int[n];
            dsu_size=new long[n];
            wt=new long[n];
            pq=new ArrayDeque[n];
            Arrays.fill(dsu,-1);
            Arrays.fill(dsu_size,0l);
            unconnected=n-1;
            for(int i=1;i<=n-1;i++){
                makeSet(i);
                pq[i]=new ArrayDeque<>();
                wt[i]=weight[i];
            }
        }
        void makeSet(int v){
            dsu[v]=v;
            dsu_size[v]=1;
        }
        int findSet(int v){
            if(dsu[v]==v){
                return v;
            }
            return dsu[v]=findSet(dsu[v]);
        }
        long getSize(int s){
            return dsu_size[findSet(s)];
        }
        void union(int s1,int s2,int w){
            int a=findSet(s1);
            int b=findSet(s2);
            if(a!=b){
                unconnected--;
                if(dsu_size[a]>dsu_size[b]){
                    int temp=a;
                    a=b;
                    b=temp;
                }
                dsu[a]=b;
                dsu_size[b]+=dsu_size[a];
                wt[b]+=wt[a];
                if(w>wt[b]){
                    while(!pq[a].isEmpty()){
                        int u=pq[a].remove();
                        pq[b].add(u);
                    }
                    pq[b].add(w);
                }
                else{
                    pq[b].clear();
                    pq[a].clear();
                }
            }
            else{
                if(w>wt[a]){
                    pq[a].add(w);
                }
            }
        }
    }
    static class edge{
        int u,v,w;
        edge(int u,int v,int w){
            this.u=u;
            this.v=v;
            this.w=w;
        }
    }
    static int weight[];
    public static void main(String args[]) throws Exception{
        nl();
        int n=pi();
        int m=pi();
        nl();
        weight=new int[n+1];
        for(int i=1;i<=n;i++){
            weight[i]=pi();
        }
        edge E[]=new edge[m];
        for(int i=0;i<m;i++){
            nl();
            E[i]=new edge(pi(),pi(),pi());
        }
        Arrays.sort(E,(a,b)->{
            return a.w-b.w;
        });
        DSU d=new DSU(n+1);
        for(edge e:E){
           d.union(e.u,e.v,e.w);
        }
        out.println(d.pq[d.findSet(1)].size());
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