import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter pw;
    static Scanner sc;
    static int[][][] dp;
    static char[] arr, b;
    static int ceildiv(int x, int y) { return (x+y-1)/y; }
    static int mod(long x, int m) { return (int)((x%m+m)%m); }
    static long gcd(long x, long y) {return y==0?x:gcd(y, x%y);}
    static int bool(boolean x){ return x?1:0; }
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        pw = new PrintWriter(System.out);
        int n=sc.nextInt(), k=sc.nextInt(), arr[]=sc.nextArr(n);
        double ans=0d;
        for(int i=0; i<k; i++)
            ans+=(arr[i]+1)/2d;
        double res=ans;
        for(int i=k; i<n; i++){
            ans+=(arr[i]+1)/2d-(arr[i-k]+1)/2d;
            res=Math.max(ans, res);
        }
        pw.println(res);
        pw.close();
    }
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            pw.print(arr[i] + " ");
        pw.println(arr[arr.length - 1]);
    }
    static void printArr(long[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            pw.print(arr[i] + " ");
        pw.println(arr[arr.length - 1]);
    }
    static void printArr(Integer[] arr) {
        for (int i = 0; i < arr.length; i++)
            pw.print(arr[i] + " ");
        pw.println();
    }
    static void printArr(char[] arr) {
        for (int i = 0; i < arr.length; i++)
            pw.print(arr[i]==0? '1': arr[i]);
        pw.println();
    }
    static void printArr(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            pw.print(list.get(i)+" ");
        pw.println();
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = nextInt();
            return arr;
        }
        public Integer[] nextsort(int n) throws IOException{
            Integer[] arr=new Integer[n];
            for(int i=0; i<n; i++)
                arr[i]=nextInt();
            return arr;
        }
        public Pair nextPair() throws IOException{
            return new Pair(nextInt(), nextInt());
        }
        public Pair[] nextPairArr(int n) throws IOException{
            Pair[] arr=new Pair[n];
            for(int i=0; i<n; i++)
                arr[i]=new Pair(nextInt(), nextInt());
            return arr;
        }
        public boolean ready() throws IOException {
            return br.ready();
        }
    }
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x=x;
            this.y=y;
        }
        public int hashCode() {
            return (this.x*1000+this.y);
        }
        public int compareTo(Pair p){
            return Long.compare(this.x, p.x);
        }
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            Pair p = (Pair) obj;
            return this.x==p.x && this.y==p.y;
        }
        public boolean equal(Pair p){
            if(this.x==p.x)
                return this.y==p.y;
            if(this.x==p.y)
                return this.y==p.x;
            else
                return false;
        }
        public Pair clone(){
            return new Pair(x, y);
        }
        public String toString(){
            return this.x+" "+this.y;
        }
        public void add(Pair p){
            x+=p.x;
            y+=p.y;
        }
    }
    static class Union{
        int[] rep, size;
        public Union(int n){
            rep=new int[n];
            size=new int[n];
            for(int i=0; i<n; i++){
                rep[i]=i;
                size[i]=1;
            }
        }
        public void join(int x, int y){
            int a=getSet(x), b=getSet(y);
            if(a==b) return;
            if(size[a]>size[b]){
                rep[b]=a;
                size[a]+=size[b];
            }else{
                rep[a]=b;
                size[b]+=size[a];
            }
        }
        public int getSet(int x){
            if(rep[x]==x)
                return x;
            return rep[x]=getSet(rep[x]);
        }
    }
}