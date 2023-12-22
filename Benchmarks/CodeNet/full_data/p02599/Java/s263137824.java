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
    static class BIT{
        long input[];
        int n;
        BIT(int n){
            this.n=n;
            input=new long[n+1];
        }
        long query(int i){
            long sum=0;
            while(i>0){
                sum+=input[i];
                i-=(i&(-i));
            }
            return sum;
        }
        long query(int l,int r){
            if(r<l)return 0l;
            return query(r)-query(l-1);
        }
        void update(int i,long val){
            while(i<=n){
                input[i]+=val;
                i+=(i&(-i));
            }
        }
    }
    public static void main(String args[]) throws Exception{
        int n=pi();
        int q=pi();
        int input[]=new int[n];
        for(int i=0;i<n;i++){
            int a=pi();
            input[i]=a;
        }
        int m=500005;
        int last[]=new int[m];
        Arrays.fill(last,-1);
        ArrayList<Pair> ls[]=new ArrayList[n+1];
        for(int i=0;i<=n;i++)ls[i]=new ArrayList<>();
        for(int i=0;i<q;i++){
            int a=pi();
            int b=pi();
            ls[b].add(new Pair(a,i));
        }
        int ans[]=new int[q];

        BIT b=new BIT(n+1);
        for(int i=1;i<=n;i++){
            if(last[input[i-1]]!=-1){
                b.update(last[input[i-1]],-1);
            }
            b.update(i,1);
            
            last[input[i-1]]=i;
            for(Pair p:ls[i]){
                //debug(p,i);

                int l=p.u;
                int idx=p.v;
                int r=i;
                ans[idx]=(int)b.query(l,r);
                //debug(ans[idx]);

            }
        }
        for(int u:ans)out.println(u);
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