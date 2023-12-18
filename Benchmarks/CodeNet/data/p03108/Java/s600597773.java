/*Author: Satyajeet Singh, Delhi Technological University*/
import java.io.*;
import java.util.*;
import java.text.*; 
import java.lang.*;

public class Main {
/*********************************************Constants******************************************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    static boolean sieve[];
    static ArrayList<Integer> primes;
    static ArrayList<Long> factorial;
    static HashSet<Integer> graph[];
/****************************************Solutions Begins*****************************************/
    static int dsu[];
    static long dsu_size[];
    static int connected=0;
    static long curr=0;
    static void setInit(int n){
        dsu=new int[n];
        dsu_size=new long[n];
        Arrays.fill(dsu,-1);
        Arrays.fill(dsu_size,0l);
        connected=n;
    }
    static void makeSet(int v){
        dsu[v]=v;
        dsu_size[v]=1;
    }
    static int findSet(int v){
        if(dsu[v]==v){
            return v;
        }
        int v1=findSet(dsu[v]);
        dsu[v]=v1;
        return v1;
    }
    static long getSize(int s1){
        int a=findSet(s1);
        return dsu_size[a];
    }
    static void union(int s1,int s2){
        int a=findSet(s1);
        int b=findSet(s2);
        if(a!=b){
            connected--;
            if(dsu_size[a]>dsu_size[b]){
                int temp=a;
                a=b;
                b=temp;
            }
            curr-=(long)dsu_size[a]*dsu_size[b];
            dsu[a]=b;
            dsu_size[b]+=dsu_size[a];
        }
    }
    public static void main (String[] args) throws Exception {
        String st[]=br.readLine().split(" ");
        int n=Integer.parseInt(st[0]);
        int m=Integer.parseInt(st[1]);
        curr=n*(n-1)/2;
        setInit(n+1);
        for(int i=1;i<=n;i++){
            makeSet(i);
        }
        int input[][]=new int[m][2];
        long ans[]=new long[m];
        for(int i=0;i<m;i++){
            st=br.readLine().split(" ");
            int a=Integer.parseInt(st[0]);
            int b=Integer.parseInt(st[1]);
            input[i][0]=a;
            input[i][1]=b;
        }
       // debug(input);
        for(int i=m-1;i>=0;i--){
            ans[i]=curr;
           // System.out.println(input[i][0]+" "+input[i][1]);
            union(input[i][0],input[i][1]); 
           // debug(dsu);
       //  debug(dsu_size);  
        }
        for(int i=0;i<m;i++){
            out.println(ans[i]);
        }

/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
/****************************************Template Begins************************************************/
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.00000000000000000"); 
        out.println(ft.format(d));
    }
/******************************************Graph*********************************************************/
    static void Makegraph(int n){
        graph=new HashSet[n];
        for(int i=0;i<n;i++){
            graph[i]=new HashSet<>();
        }
    }
    static void addEdge(int a,int b){
        graph[a].add(b);
    }    

/*********************************************PAIR********************************************************/
    static class PairComp implements Comparator<Pair>{
        public int compare(Pair p1,Pair p2){
            if(p1.u>p2.u){
                return 1;
            }
            else if(p1.u<p2.u){
                return -1;
            }
            else{
                return p1.v-p2.v;
            }
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

    static class PairCompL implements Comparator<Pairl>{
        public int compare(Pairl p1,Pairl p2){
            if(p1.u>p2.u){
                return 1;
            }
            else if(p1.u<p2.u){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    static class Pairl implements Comparable<Pair> {
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
/*****************************************DEBUG***********************************************************/
    public static void debug(Object... o) {
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