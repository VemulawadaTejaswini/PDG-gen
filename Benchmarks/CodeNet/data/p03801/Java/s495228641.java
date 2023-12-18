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
    static int pptr=0;
    static String st[];
/****************************************Solutions Begins***************************************/
    static class segmentTree{
        int n=0;
        int[] lo,hi;
        long tr[][];
        long pref[][];
        segmentTree(int n){
            this.n=n;
            lo=new int[4*n+1];
            hi=new int[4*n+1];
            tr=new long[4*n+1][];
            pref=new long[4*n+1][];
            init(1,1,n);
        }
        long[] merge(long[] t1,long[] t2){
            if(t1==null) return t2;
            if(t2==null)return t1;
            int i=0;
            int j=0;
            int k=0;
            long tt[]=new long[t1.length+t2.length];
            while(i<t1.length&&j<t2.length){
                if(t1[i]<t2[j]){
                    tt[k++]=t1[i++];
                }
                else{
                    tt[k++]=t2[j++];
                }
            }
            while(i<t1.length){
                tt[k++]=t1[i++];
            }
            while(j<t2.length){
                tt[k++]=t2[j++];
            }
            return tt;
        }
        void init(int i,int left,int right){
            lo[i]=left;
            hi[i]=right;
            if(left==right){
                if(tr[i]==null){
                    tr[i]=new long[1];
                    pref[i]=new long[1];
                }
                tr[i][0]=input[left-1];//Add the elements of array you want to query
                pref[i][0]=input[left-1];
                return;
            }
            int mid=(left+right)/2;
            init(2*i,left,mid);
            init(2*i+1,mid+1,right);
            tr[i]=merge(tr[2*i],tr[2*i+1]);
            int lnt=tr[i].length;
            pref[i]=new long[lnt];
            pref[i][lnt-1]=tr[i][lnt-1];
            for(int j=lnt-2;j>=0;j--)
                pref[i][j]=pref[i][j+1]+tr[i][j];
        }        
        long query(int left,int right,long k){
            return query(1,left,right,k);
        }
        long query(int i,int left,int right,long k){
            if(left>hi[i]||right<lo[i]){
                return 0;
            }
            if(lo[i]>=left&&hi[i]<=right){
                if(tr[i]==null)return 0;
                int start=0;
                long nn=tr[i].length;
                int end=tr[i].length-1;
                int cur=-1;
                while(start<=end){
                    int mid=(start+end)/2;
                    if(tr[i][mid]>=k){
                        end=mid-1;
                        cur=mid;
                    }
                    else{
                        start=mid+1;
                    }
                }
                if(cur==-1)return 0;
                return pref[i][cur]-(nn-cur)*k;
            }
            long l=query(2*i,left,right,k);
            long r=query(2*i+1,left,right,k);
            return l+r;
        }
    }
    static class segmentTree1{
        int n=0;
        int[] lo,hi;
        long[] value,delta;
        int idx[];
        segmentTree1(int n){
            this.n=n;
            lo=new int[4*n+1];
            hi=new int[4*n+1];
            value=new long[4*n+1];
            delta=new long[4*n+1];
            idx=new int[4*n+1];
            init(1,1,n);
        } 
        void init(int i,int left,int right){
            lo[i]=left;
            hi[i]=right;
            if(left==right){
                idx[i]=left;
                return;
            }
            int mid=(left+right)/2;
            init(2*i,left,mid);
            init(2*i+1,mid+1,right);
        }
        void update(int left,int right,long val){
            update(1,left,right,val);
        }
        Pairl query(int left,int right){
            return query(1,left,right);
        }
        void prop(int i){
            delta[2*i]+=delta[i];
            delta[2*i+1]+=delta[i];
            delta[i]=0;
        }
        void update(int i){
            long a=value[2*i]+delta[2*i];
            long b=value[2*i+1]+delta[2*i+1];
            if(a>=b){
                value[i]=a;
                idx[i]=idx[2*i];
            }
            else{
                value[i]=b;
                idx[i]=idx[2*i+1];
            }
        }
        void update(int i,int left,int right,long val){
            if(left>hi[i]||right<lo[i]){
                return;
            }
            if(lo[i]>=left&&hi[i]<=right){
                delta[i]+=val;
                if(left==right){
                    idx[i]=left;
                    return;
                }
                return;
            }
            prop(i);
            update(2*i,left,right,val);
            update(2*i+1,left,right,val);
            update(i);
        }
        Pairl query(int i,int left,int right){
            if(left>hi[i]||right<lo[i]){
                return null;
            }
            if(lo[i]>=left&&hi[i]<=right){
                return new Pairl(value[i]+delta[i],idx[i]);
            }
            prop(i);
            Pairl l=query(2*i,left,right);
            Pairl r=query(2*i+1,left,right);
            update(i);
            if(l==null)return r;
            if(r==null)return l;
            if(l.u>=r.u){
                return l;
            }
            else{
                return r;
            }
        }
    }
    static int n;
    static long input[];
    public static void main(String[] args) throws Exception{
        nl();
        int n=pi();
        input=new long[n];
        nl();
        segmentTree1 seg1=new segmentTree1(n);
        for(int i=0;i<n;i++){
            input[i]=pi();
            seg1.update(i+1,i+1,input[i]);
        }
        segmentTree seg=new segmentTree(n);
        long f[]=new long[n+1];
        int right=n;
        long sum=0;
        while(right!=0){
            int idx=(int)seg1.query(1,right).v;
            right=idx-1;
            Pairl li=seg1.query(1,right);
            long lim=0;
            if(li!=null)lim=li.u;
            f[idx]=seg.query(idx,n,lim)-sum;
            sum+=f[idx];
        }
        for(int i=1;i<=n;i++)out.println(f[i]);
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
        graph[a].add(new Pair(b,1));
    }
    static void addEdge(int a,int b,int c){
        graph[a].add(new Pair(b,c));
    }    
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