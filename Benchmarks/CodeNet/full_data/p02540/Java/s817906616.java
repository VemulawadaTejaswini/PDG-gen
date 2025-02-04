/******************Author: Satyajeet Singh************************************/
    import java.io.*;
    import java.util.*;
    import java.text.*; 
    import java.lang.*;
    import java.math.*;
public class Main{
/*********************************************Constants***********************************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    static ArrayList<Integer> graph[];
    static int pptr=0,pptrmax=0;
    static String st[];
/*****************************************Solution Begins*********************************/
    static class DSU{
        int dsu[];
        long dsu_size[];
        int unconnected=0;
        DSU(int n){
            dsu=new int[n];
            dsu_size=new long[n];
            Arrays.fill(dsu,-1);
            Arrays.fill(dsu_size,0l);
            unconnected=n-1;
            for(int i=1;i<=n-1;i++){
                makeSet(i);
            }
        }
        void makeSet(int v){
            dsu[v]=v;
            dsu_size[v]=1;
        }
        int findSet(int v){
            if(dsu[v]==v){
                return v;
            }
            return dsu[v]=findSet(dsu[v]); 
        }
        long getSize(int s){
            return dsu_size[findSet(s)];
        }
        void union(int s1,int s2){
            int a=findSet(s1);
            int b=findSet(s2);
            if(a!=b){
                unconnected--;
                if(dsu_size[a]>dsu_size[b]){
                    int temp=a;
                    a=b;
                    b=temp;
                }
                dsu[a]=b;
                dsu_size[b]+=dsu_size[a];
            }
        }
    }
    public static void main(String args[]) throws Exception{
        int n=pi();
        Pair input[]=new Pair[n];

        TreeSet<Pair> set1=new TreeSet<>((A,B)->{
            return A.v-B.v;
        });
        TreeSet<Pair> set2=new TreeSet<>((A,B)->{
            return A.v-B.v;
        });
        for(int i=0;i<n;i++){
            input[i]=new Pair(pi(),pi(),i+1);
            set1.add(input[i]);
        }

        Arrays.sort(input,(A,B)->{
            return A.u-B.u;
        });
        DSU d=new DSU(n+1);
        int output[]=new int[n];
        //debug(input);


        for(int i=0;i<n;i++){
            set2.add(input[i]);

            set1.remove(input[i]);
            int id=input[i].i;
            //debug("hi",input[i]);
            Pair prev=input[i];
            boolean flag=true;
            Pair p=null;

            while(flag){
                flag=false;
                p=prev;
                p=set1.higher(p);

                while(p!=null){
                    //debug(p);
                    flag=true;
                    d.union(id,p.i);
                    set1.remove(p);
                    prev=p;
                    p=set1.higher(p);
                }

                p=prev;
                p=set2.lower(p);
                while(p!=null){
                    flag=true;

                    d.union(id,p.i);
                    set2.remove(p);
                    prev=p;
                    p=set2.lower(p);
                }
            }

            //output[id-1]=(int)d.getSize(id);
        }
        for(int i=0;i<n;i++){
            output[input[i].i-1]=(int)d.getSize(input[i].i);
        }
        for(int u:output)out.println(u);

/****************************************Solution Ends*************************************/
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
/***************************************Precision Printing*********************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.00000000000"); 
        out.println(ft.format(d));
    }
/**************************************Bit Manipulation************************************/
    static int countBit(long mask){
        int ans=0;
        while(mask!=0){
            mask&=(mask-1);
            ans++;
        }
        return ans;
    }
/******************************************Graph******************************************/
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
/*********************************************PAIR*****************************************/
    static class Pair{
        int u;
        int v;
        int i;

        public Pair(int u, int v,int i) {
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
            Pair other = (Pair) o;
            return u == other.u && v == other.v;
        }
        public String toString() {
            return "[u=" + u + ", v=" + v + "]";
        }
    }
/******************************************Long Pair***************************************/
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
/*****************************************DEBUG********************************************/
    public static void debug(Object... o){
        System.out.println(Arrays.deepToString(o));
    }
/************************************MODULAR EXPONENTIATION********************************/
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
/********************************************GCD*******************************************/
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