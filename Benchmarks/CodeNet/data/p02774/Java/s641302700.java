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
    static boolean sieve[];
    static ArrayList<Integer> primes;
    static long factorial[],invFactorial[];
    static ArrayList<Integer> graph[];
    static int pptr=0;
    static String st[];
/****************************************Solutions Begins***************************************/
    static ArrayList<Long> neg,pos;
    static long fn(ArrayList<Long> ls,long m){
        long ans=0;
        for(int i=0;i<ls.size();i++){
            int start=i+1;
            int end=ls.size()-1;
            long c=ls.get(i);
            long u=i;
            while(start<=end){
                int mid=(start+end)/2;
                long t=c*ls.get(mid);
            //    debug(mid,t,t-m,c,ls.get(mid));

                if(t<=m){
                    start=mid+1;
                    u=mid;
                }
                else{
                    end=mid-1;
                }
            }
         //   debug(i,u-i);

            ans+=(u-i);
        //    System.exit(0);

        }
        return ans;
    }
    static long fn1(long m){
        long ans=0;
        for(long u:neg){
            int start=0;
            int end=pos.size()-1;
            long p=pos.size();
            while(start<=end){
                int mid=(start+end)/2;
                long t=(u*pos.get(mid));
                if(t<=m){
                    end=mid-1;
                    p=mid;
                }
                else{
                    start=mid+1;
                }
            }
            ans+=(pos.size()-p);
        }
        return ans;
    }
    static long bf(ArrayList<Long> ls, long mid){
        ArrayList<Long> lf=new ArrayList<>();
        for(int i=0;i<ls.size();i++){
            int c=0;
            for(int j=i+1;j<ls.size();j++){
                long yy=(ls.get(i)*ls.get(j));
               // debug(j,yy-mid);

                if(yy<=mid)c++;
            }
           // debug(i,c);
           // System.exit(0);
        }
        Collections.sort(lf);
     //   debug(lf);

        long ans=0;
        for(long u:lf){
            if(u<=mid)ans++;
            else break;
        }
        return ans;
    }
    static long cal(long mid){
       // debug(fn(neg,mid),fn(pos,mid),fn1(mid));
       // debug(bf(neg,mid),bf(pos,mid));
        
        return fn(neg,mid)+fn(pos,mid)+fn1(mid);
    }

    public static void main(String args[]) throws Exception{
        nl();
        long n=pi();
        long k=pl();
        neg=new ArrayList<>();
        pos=new ArrayList<>();
        nl();      
        for(int i=0;i<n;i++){
            long y=pl();
            if(y<0)
                neg.add(y);
            else
                pos.add(y);
        }
        Collections.sort(neg,Collections.reverseOrder());
        Collections.sort(pos);
      //  debug(neg);
     //   debug(pos);

        // debug(neg.size(),pos.size());
        // debug(fn(neg,500000000000000000l));
          //  debug("hi");

       //  debug(bf(neg,500000000000000000l));
       //  System.exit(0);

        long ans=0;
        long start=-(long)1e18;
        long end=(long)1e18;
        while(start<=end){
            long mid=(start+end)/2;
            long cur=cal(mid);
           // debug(mid,cur);
            if(cur<k){
                start=mid+1;
            }
            else if(cur>=k){
                ans=mid;
                end=mid-1;
            }
        }
        out.println(ans);
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
/****************************************Template Begins************************************************/
    static void nl() throws Exception{
        pptr=0;
        st=br.readLine().split(" ");
    }
    static void nls() throws Exception{
        pptr=0;
        st=br.readLine().split("");
    }
    static int pi(){
        return Integer.parseInt(st[pptr++]);
    }
    static long pl(){
        return Long.parseLong(st[pptr++]);
    }
    static double pd(){
        return Double.parseDouble(st[pptr++]);
    }
    static String ps(){
        return st[pptr++];
    }
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.000000000000"); 
        out.print(ft.format(d));
    }
/**************************************Bit Manipulation**************************************************/
    static void printMask(long mask){
        System.out.println(Long.toBinaryString(mask));
    }
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
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
    }
    static void addEdge(int a,int b){
        graph[a].add(b);
    }
    // static void addEdge(int a,int b,int c){
    //     graph[a].add(new Pair(b,c));
    // }    
/*********************************************PAIR********************************************************/
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
    public static void debug(Object... o){
        System.out.println(Arrays.deepToString(o));
    }
/************************************MODULAR EXPONENTIATION***********************************************/
    static long modulo(long a,long b,long c){
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
    static long gcd(long x, long y){
        if(x==0)
            return y;
        if(y==0)
            return x;
        long r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0){
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