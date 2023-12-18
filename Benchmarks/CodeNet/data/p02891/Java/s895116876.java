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
    public static void main(String[] args) throws Exception{
        String st[]=nl();
        String str=st[0];
        int n=str.length();
        st=nl();
        long k=pl(st[0]);
        int j=0;
        char ch=str.charAt(0);
        long a=0,b=0;

        while(j<n&&ch==str.charAt(j)){
            j++;
        }
        a=j;
        j=n-1;
        ch=str.charAt(n-1);
        while(j>=0&&ch==str.charAt(j)){
            j--;
        }
        b=n-j-1;
        //debug(a,b,j);
        long c=0;
        boolean done=false;
        for(int i=(int)a;i<n-1&&i<=j;i++){
            //debug(i);
            if(!done&&str.charAt(i)==str.charAt(i+1)){
                c+=k;
                done=true;
            }
            else{
                done=false;
            }
        }
        long ans=0;
        if(j==-1){
            ans=(k*n)/2;
        }
        else{
            //debug(c);
            long o=0;
            if(str.charAt(0)==str.charAt(n-1)){
                o=((a+b)/2)*(k-1)+a/2+b/2;
            }
            else{
                c=0;
                done=false;
                for(int i=0;i<n-1;i++){
                    //debug(i);
                    if(!done&&str.charAt(i)==str.charAt(i+1)){
                        c+=k;
                        done=true;
                    }
                    else{
                        done=false;
                    }
                }       
            }
            ans=c+o;
        }
        out.println(ans);
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
        out.println(ft.format(d));
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
            return p1.u-p2.u;
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