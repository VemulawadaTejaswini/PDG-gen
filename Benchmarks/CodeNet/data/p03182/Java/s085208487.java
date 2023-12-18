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
    static ArrayList<Pair> graph[];
    static boolean oj = System.getProperty("ONLINE_JUDGE") != null;
/****************************************Solutions Begins***************************************/  
    static class segmentTree{
        int n=0;
        int[] lo,hi;
        long[] value,delta;
        segmentTree(int n){
            this.n=n;
            lo=new int[4*n+1];
            hi=new int[4*n+1];
            value=new long[4*n+1];
            delta=new long[4*n+1];
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
        void prop(int i){
            delta[2*i]=updateFunction(delta[2*i],delta[i]);
            delta[2*i+1]=updateFunction(delta[2*i+1],delta[i]);
            delta[i]=0;
        }
        void update(int i){
            value[i]=queryFunction(updateFunction(value[2*i],delta[2*i]),updateFunction(value[2*i+1],delta[2*i+1]));
        }
        void update(int i,int left,int right,long val){
            if(left>hi[i]||right<lo[i]){
                return;
            }
            if(lo[i]>=left&&hi[i]<=right){
                delta[i]=updateFunction(delta[i],val);
                return;
            }
            prop(i);
            update(2*i,left,right,val);
            update(2*i+1,left,right,val);
            update(i);
        }
        long query(int i,int left,int right){
            if(left>hi[i]||right<lo[i]){
                return Long.MIN_VALUE/3;
            }
            if(lo[i]>=left&&hi[i]<=right){
                return updateFunction(value[i],delta[i]);
            }
            prop(i);
            long l=query(2*i,left,right);
            long r=query(2*i+1,left,right);
            update(i);
            return queryFunction(l,r);
        }
    }
    public static void main(String[] args) throws Exception{
        String st[]=nl();
        int n=pi(st[0]);
        int m=pi(st[1]);
        ArrayList<Pair> ls[]=new ArrayList[n+1];
        for(int i=0;i<m;i++){
            st=nl();
            int a=pi(st[0]);
            int b=pi(st[1]);
            int c=pi(st[2]);
            if(ls[b]==null)ls[b]=new ArrayList<>();
            ls[b].add(new Pair(a,c));
        }
        segmentTree seg=new segmentTree(n);
        for(int i=1;i<=n;i++){
            long cur=0;
            if(i>1)cur=seg.query(1,i-1);
            seg.update(i,i,cur);
            if(ls[i]==null)continue;
            for(Pair p:ls[i]){
                seg.update(p.u,i,p.v);
            }
        }
        out.println(Math.max(0,seg.query(1,n)));
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
        out.print(ft.format(d));
    }
/**************************************Bit Manipulation**************************************************/
    static void printMask(long mask){
        System.out.println(Long.toBinaryString(mask));
    }
    static int countBit(long mask){
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
        graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
    }
    static void addEdge(int a,int b){
        graph[a].add(new Pair(b,1));
    }
    static void addEdge(int a,int b,int c){
        graph[a].add(new Pair(b,c));
    }    
/*********************************************PAIR********************************************************/
    static class PairComp implements Comparator<Pair>{
        public int compare(Pair p1,Pair p2){
            if(p1.u!=p2.u)
            return p1.u-p2.u;
            else
            return p1.v-p2.v;
        }
    }
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
    static class PairCompL implements Comparator<Pairl>{
        public int compare(Pairl p1,Pairl p2){
            long a=p1.u*p2.v;
            long b=p2.u*p1.v;
            if(a>b){
                return -1;
            }
            else if(a<b){
                return 1;
            }
            else{
                return 0;
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