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
    static ArrayList<Integer> graph[];
    static int pptr=0,pptrmax=0;
    static String st[];
/*****************************************Solution Begins***************************************/    
    static class Pair{
        int u;
        int v;
        int c;
        public Pair(int u, int v, int c) {
            this.u = u;
            this.v = v;
            this.c = c;
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
    public static void main(String args[]) throws Exception{
        int n=pi();
        int m=pi();
        int k=pi();
        int x1=pi()-1;
        int y1=pi()-1;
        int x2=pi()-1;
        int y2=pi()-1;
        
        boolean input[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            String in=ps();
            for(int j=0;j<m;j++){
                if(in.charAt(j)=='.')
                    input[i][j]=true;
            }
        }

        TreeSet<Pair> set=new TreeSet<>((A,B)->{
            if(A.c!=B.c)
                return A.c-B.c;
            if(A.u!=B.u)
                return A.u-B.u;
            return A.v-B.v;
        });
        int dx[]={1,-1,0,0};
        int dy[]={0,0,1,-1};
        set.add(new Pair(x1,y1,0));
        int dp[][]=new int[n][m];
        dp[x1][y1]=0;
        for(int arr[]:dp)
            Arrays.fill(arr,Integer.MAX_VALUE/4);
        while(!set.isEmpty()){
            Pair p=set.first();
            set.remove(p);
            int x=p.u;
            int y=p.v;
            int c=p.c;
            if(x==x2&&y==y2)
                break;
            for(int i=0;i<4;i++){
                for(int j=1;j<=k;j++){
                    int xx=x+dx[i]*j;
                    int yy=y+dy[i]*j;
                    if(xx<0||yy<0||xx>=n||yy>=m||!input[xx][yy])break;
                    if(dp[xx][yy]<c+1)break;
                    else{
                        Pair prev=new Pair(xx,yy,dp[xx][yy]);
                        set.remove(prev);
                    }
                    dp[xx][yy]=c+1;
                    set.add(new Pair(xx,yy,c+1));
                }
            }
        }
        int ans=dp[x2][y2];
        if(ans==Integer.MAX_VALUE/4)out.println(-1);
        else out.println(ans);
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
        DecimalFormat ft = new DecimalFormat("0.0000000000"); 
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
    // static class Pair{
    //     int u;
    //     int v;
    //     public Pair(int u, int v) {
    //         this.u = u;
    //         this.v = v;
    //     }
    //     public int hashCode() {
    //         int hu = (int) (u ^ (u >>> 32));
    //         int hv = (int) (v ^ (v >>> 32));
    //         return 31 * hu + hv;
    //     }
    //     public boolean equals(Object o) {
    //         Pair other = (Pair) o;
    //         return u == other.u && v == other.v;
    //     }
    //     public String toString() {
    //         return "[u=" + u + ", v=" + v + "]";
    //     }
    // }
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