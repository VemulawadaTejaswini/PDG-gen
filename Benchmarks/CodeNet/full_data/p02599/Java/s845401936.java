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
    
    static class PairCompkl implements Comparator<Pairkl>{
        public int compare(Pairkl p1,Pairkl p2){
            int aa=p1.u/sq;
            int bb=p2.u/sq;
            if(aa!=bb){
                return aa-bb;
            }
            else{
                if((aa&1)==1)
                return p1.v-p2.v;
                else
                return p2.v-p1.v;
            }
        }
    }
    static class Pairkl implements Comparable<Pairkl> {
        int u;
        int v;
        int i;
        int index=-1;
        public Pairkl(int u, int v,int i) {
            this.u = u;
            this.v = v;
            this.i = i;
        }
 
        public int hashCode() {
            int hu = (int) (u ^ (u >>> 32));
            int hv = (int) (v ^ (v >>> 32));
            return 31 * hu + hv;
        }
 
        public boolean equals(Object o) {
            Pairkl other = (Pairkl) o;
            return u == other.u && v == other.v;
        }
 
        public int compareTo(Pairkl other) {
            if(index!=other.index)
                return Long.compare(index, other.index);
            return Long.compare(v, other.v)!=0?Long.compare(v, other.v):Long.compare(u, other.u);
        }
 
        public String toString() {
            return "[u=" + u + ", v=" + v +", "+i+ "]";
        }
    }
    static int freq[],n,sq;
    static int fans=0;

    static void add(int a){
        if(freq[a]==0){
            fans++;
        }
        freq[a]++;
    }
    static void sub(int a){
        if(freq[a]==1){
            fans--;
        }
        freq[a]--;
    }
    
    
    public static void main(String args[]) throws Exception{
        
        n=pi();
        int q=pi();
        sq=(int)Math.sqrt(n)+1;    

        int rem[]=new int[n+1];
        for(int i=1;i<=n;i++){
            rem[i]=pi();
        }

        Pairkl query[]=new Pairkl[q];
        for(int i=0;i<q;i++){
            int l=pi();
            int r=pi();
            query[i]=new Pairkl(l,r,i);
        }
        Arrays.sort(query,new PairCompkl());
        long ans[]=new long[q];
        int z=5000005;
        freq=new int[z];
        int l=1;
        int r=1;
        add(rem[1]);
        for(int i=0;i<q;i++){
            int rl=query[i].u;
            int rr=query[i].v;
            //debug(query[i]);

            while(r<rr){
                r++;
                add(rem[r]);
            }
            
            // debug(fans,l,r);
            // debug(freq);

            while(l<rl){
                sub(rem[l]);
                l++;
            }
            // debug(fans,l,r);
            // debug(freq);

            while(l>rl){
                l--;
                add(rem[l]);
            }
            //debug(fans,l,r);

            while(r>rr){
                sub(rem[r]);
                r--;
            }
            ans[query[i].i]=fans;
            // debug(fans,l,r);
            // debug(freq);

        }
        for(int i=0;i<q;i++){
            out.println(ans[i]);
        }
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