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
    static long w=0,weight[],dp[][];
    static int n=0,profit[];
    static long dfs(int i,int prof){
        if(i==n){
            if(prof!=0){
                return Long.MAX_VALUE;
            }
            else return 0;
        }
        if(prof<0){
            return Long.MAX_VALUE;
        }
        if(dp[i][prof]!=-1){
            return dp[i][prof];
        }
        long op1=Long.MAX_VALUE,op2=Long.MAX_VALUE;
        op1=dfs(i+1,prof-profit[i]);
        if(op1!=Long.MAX_VALUE){
            op1+=weight[i];
        }
        op2=dfs(i+1,prof);
        dp[i][prof]=Math.min(op1,op2);
        return dp[i][prof];
    }
    public static void main (String[] args) throws Exception {
        String st[]=br.readLine().split(" ");
        n=Integer.parseInt(st[0]);
        w=Long.parseLong(st[1]);
        profit=new int[n];
        weight=new long[n];
        int sum=0;
        for(int i=0;i<n;i++){
            st=br.readLine().split(" ");
            weight[i]=Long.parseLong(st[0]);
            profit[i]=Integer.parseInt(st[1]);
            sum+=profit[i];
        }
        //out.println(sum+1);
        dp=new long[n][sum+1];
        for(long arr[]:dp){
            Arrays.fill(arr,-1);
        }
        dp[0][0]=0;
        for(int i=0;i<=sum;i++)
        dfs(0,i);
        //debug(dp);
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=sum;j++){
                if(dp[i][j]<=w&&dp[i][j]!=-1){
                    max=Math.max(max,j);
                }
            }
        }
        out.println(max);
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
/****************************************Template Begins************************************************/
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.000000"); 
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