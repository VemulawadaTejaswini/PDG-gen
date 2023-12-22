/*****Author: Satyajeet Singh************************************/
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
    static ArrayList<Integer> graph[];
    static int pptr=0,pptrmax=0;
    static String st[];
/*****************************************Solution Begins***************************************/    
    static boolean vis[];
    static long C[];
    static long k=0;
    static int cy=-1;
    static int levs[];
    static long ans=0;
    static long dp[];
    static int lev=0;

    static void dfs(int start){
        vis[start]=true;
        levs[start]=lev;
        dp[lev]=C[start];
        if(lev>=k)return;
        for(int u:graph[start]){
            if(vis[u]){
                cy=levs[u];
                return;
            }
            lev++;
            dfs(u);
        }
    }
    public static void main(String args[]) throws Exception{      
        int n=pi();
        k=pl();
        Makegraph(n+1);
        for(int i=1;i<=n;i++){
            int a=i;
            int b=pi();
            addEdge(a,b);
        }
        C=new long[n+1];
        for(int i=1;i<=n;i++){
            C[i]=pl();
        }
        levs=new int[n+1];
        dp=new long[n+1];
        vis=new boolean[n+1];
        ans=Long.MIN_VALUE;

        for(int i=1;i<=n;i++){
          
            Arrays.fill(levs,0);
            Arrays.fill(vis,false);
            Arrays.fill(dp,0);
            cy=-1;
            lev=1;
            dfs(i);
            if(cy==-1)cy=lev+1;
            long cc=0;
            int cha=0;
            for(int j=1;j<cy;j++){
                if(j>k)break;
                cc+=dp[j];
                ans=Math.max(ans,cc);
                cha++;
            }
            if(cha>=k)continue;
            if(cy==lev+1)continue;
            long cx=0;
            int len=0;
            for(int j=cy;j<=lev;j++){
                cx+=dp[j];
                len++;
                ans=Math.max(ans,cc+cx);
            }
            //debug(cc,cx,len);
            long k1=k-cha;
            long tim=k1/len;
            int r=(int)k1%len;
            long yy=cc+cx*tim;
            //debug(yy,r);

            ans=Math.max(ans,yy);
            for(int j=cy;j<cy+r;j++){
                yy+=dp[j];
                ans=Math.max(ans,yy);
            }
            
        }
        out.println(ans);
/****************************************Solution Ends**************************************************/
        clr();
    }
    static void clr(){
        out.flush();
        out.close();
    }
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
        DecimalFormat ft = new DecimalFormat("0.00000000000"); 
        out.println(ft.format(d));
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
    static void addEdge(int a,int b){
        graph[a].add(b);
    }
    // static void addEdge(int a,int b,int c){
    //     graph[a].add(new Pair(b,c));
    // }    
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