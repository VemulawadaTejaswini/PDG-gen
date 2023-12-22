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
    static int n,input[],ans[];
    static class segmentTree{
        int n=0;
        int[] lo,hi;
        long[] value;
        segmentTree(int n){
            this.n=n;
            lo=new int[4*n+1];
            hi=new int[4*n+1];
            value=new long[4*n+1];
            init(1,1,n);
        } 
        void init(int i,int left,int right){
            lo[i]=left;
            hi[i]=right;
            if(left==right){
                return;
            }
            int mid=(left+right)/2;
            init(2*i,left,mid);
            init(2*i+1,mid+1,right);
        }
        void update(int left,int right,long val){
            update(1,left,right,val);
        }
        long updateFunction(long a,long b){
            long c=a+b;
            return c;
        }
        long queryFunction(long a,long b){
            long c=Math.max(a,b);
            return c;
        }
        long query(int left,int right){
            return query(1,left,right);
        }
        void update(int i){
            value[i]=queryFunction(value[2*i],value[2*i+1]);
        }
        void update(int i,int left,int right,long val){
            if(left>hi[i]||right<lo[i]){
                return;
            }
            if(lo[i]==hi[i]){
                value[i]=val;
                return ;
            }
            update(2*i,left,right,val);
            update(2*i+1,left,right,val);
            update(i);
        }
        long query(int i,int left,int right){
            if(left>hi[i]||right<lo[i]){
                return 0;
            }
            if(lo[i]>=left&&hi[i]<=right){
                return value[i];
            }
            long l=query(2*i,left,right);
            long r=query(2*i+1,left,right);
            return queryFunction(l,r);
        }
    }
    static segmentTree seg;
    static void dfs(int start,int par){
        int c=input[start];
        int prev=(int)seg.query(c,c);
        int v=(int)seg.query(1,c-1)+1;
        seg.update(c,c,v);
        ans[start]=(int)seg.query(1,n);
        for(int u:graph[start]){
            if(u==par)continue;
            dfs(u,start);   
        }
        seg.update(c,c,prev);
    }
    public static void main(String args[]) throws Exception{
        n=pi();
        input=new int[n+1];
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++){
            input[i+1]=pi();
            set.add(input[i+1]);
        }
        int c=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(!set.isEmpty()){
            int a=set.first();
            map.put(a,c++);
            set.remove(a);
        }
        for(int i=1;i<=n;i++){
            input[i]=map.get(input[i]);
        }
        Makegraph(n+1);
        for(int i=0;i<n-1;i++){
            int a=pi();
            int b=pi();
            addEdge(a,b);
            addEdge(b,a);
        }
        seg=new segmentTree(n);
        ans=new int[n+1];
        dfs(1,1);
        for(int i=1;i<=n;i++){
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
        DecimalFormat ft = new DecimalFormat("0.000000"); 
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