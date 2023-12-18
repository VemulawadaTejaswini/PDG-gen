/*****Author: Satyajeet Singh, Delhi Technological University************************************/
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
    static ArrayList<Pair> graph[];
    static int pptr=0,pptrmax=0;
    static String st[];
/*****************************************Solution Begins***************************************/
    static class PairA{
        int i,coins;
        long cost;
        PairA(int i,int coins,long cost){
            this.i = i;
            this.coins = coins;
            this.cost = cost;
        }
        public String toString(){
            return "[ "+ i+" "+coins+" "+cost+" ]";
        }
    }
    public static void main(String args[]) throws Exception{
        int n=pi();
        int m=pi();
        int s=pi();
        int A[][]=new int[m][2];
        Makegraph(n+1);
        for(int i=0;i<m;i++){
            int a=pi();
            int b=pi();
            A[i][0]=pi();
            A[i][1]=pi();
            addEdge(a,b,i);
            addEdge(b,a,i);
        }
        int B[][]=new int[n+1][2];
        for(int i=0;i<n;i++){
            B[i+1][0]=pi();
            B[i+1][1]=pi();
        }
        PriorityQueue<PairA> pq=new PriorityQueue<>((AA,BB)->{
            long x=AA.cost-BB.cost;
            if(x<0)
                return -1;
            else if(x>0)
                return 1;
            return 0;
        });
        int lim = 2505;
        long dist[][]=new long[n+1][lim+5];
        for(long arr[]:dist)
            Arrays.fill(arr,Long.MAX_VALUE);
        int x = Math.min(lim,s);
        pq.add(new PairA(1,x,0l));
        dist[1][x]=0;
        while(!pq.isEmpty()){
            PairA p = pq.remove();
           // debug(pq);

            int cur = p.i;
            int coins = p.coins;
            long cost = p.cost;
            if(dist[cur][coins]<cost)
                continue;
            long t_req = B[cur][1];
            int cns = B[cur][0];
            for(Pair g:graph[cur]){
                int nx = g.u;
                int b = g.v;
                int coins_req = A[b][0];
                long time = A[b][1];
                int cc = coins - coins_req;
                long cst = cost+time;
                while(true){
                    if(cc>lim){
                        cc=lim;
                        if(dist[nx][cc]>cst){
                            dist[nx][cc] = cst;
                            pq.add(new PairA(nx,cc,cst));
                        }
                        break;
                    }
                    else if(cc>=0){
                        if(dist[nx][cc]>cst){
                            dist[nx][cc] = cst;
                            pq.add(new PairA(nx,cc,cst));
                        }
                    }
                    cc+=cns;
                    cst+=t_req;                
                }
            }
        }
        //debug(dist);

        long ans[]=new long[n+1];
        Arrays.fill(ans,Long.MAX_VALUE);
        for(int i=2;i<=n;i++){
            //debug(dist[i]);
            for(long u:dist[i]){
                ans[i]=Math.min(ans[i],u);
            }
            out.println(ans[i]);
        }

/****************************************Solution Ends**************************************************/
        out.flush();
        out.close();
    }
/****************************************Template Begins************************************************/
    static void nl() throws Exception{
        pptr=0;
        st=br.readLine().split(" ");
        pptrmax=st.length;
    }
    static void nls() throws Exception{
        pptr=0;
        st=br.readLine().split("");
        pptrmax=st.length;
    }
    static int pi() throws Exception{
        if(pptr==pptrmax)
            nl();
        return Integer.parseInt(st[pptr++]);
    }
    static long pl() throws Exception{
        if(pptr==pptrmax)
            nl();
        return Long.parseLong(st[pptr++]);
    }
    static double pd() throws Exception{
        if(pptr==pptrmax)
            nl();
        return Double.parseDouble(st[pptr++]);
    }
    static String ps() throws Exception{
        if(pptr==pptrmax)
            nl();
        return st[pptr++];
    }
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.000000000000"); 
        out.print(ft.format(d));
    }
/**************************************Bit Manipulation**************************************************/
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
        for(int i=0;i<n;i++)
            graph[i]=new ArrayList<>();
    }
    // static void addEdge(int a,int b){
    //     graph[a].add(b);
    // }
    static void addEdge(int a,int b,int c){
        graph[a].add(new Pair(b,c));
    }    
/*********************************************PAIR********************************************************/
    static class Pair{
        int u;
        int v;
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
        public String toString() {
            return "[u=" + u + ", v=" + v + "]";
        }
    }
/******************************************Long Pair*******************************************************/
    static class Pairl{
        long u;
        long v;
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
        long x=1,y=a%c;
        while(b > 0){
            if(b%2 == 1)
                x=(x*y)%c;
            y = (y*y)%c;
            b = b>>1;
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
        a = (x > y) ? x : y; 
        b = (x < y) ? x : y;
        r = b;
        while(a % b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}