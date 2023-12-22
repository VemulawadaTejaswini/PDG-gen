import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter pw;
    static Scanner sc;
    static int[] dp;
    static ArrayList<Integer>[] adj;
    static boolean[] visit;
    static long ceildiv(long x, long y) { return (x + y - 1) / y; }
    static int mod(long x, int m) { return (int) ((x % m + m) % m); }
    public static long gcd(long x, long y) {return y == 0 ? x : gcd(y, x % y);}
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        pw = new PrintWriter(System.out);
        long x=sc.nextLong();
        StringBuilder sb=new StringBuilder();
        while(x>=1){
            x--;
            sb.append((char)('a'+x%26));
            x/=26;
        }
        pw.println(sb.reverse().toString());
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
            pw.print(arr[i]);
        pw.println();
    }
    static void printArr(ArrayList list) {
        for (int i = 0; i < list.size(); i++)
            pw.print(list.get(i) + " ");
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
        long x;
        long y;
        public Pair(long x, long y) {
            this.x=x;
            this.y=y;
        }
        public int hashCode() {
            return (int)(this.x*1000+this.y);
        }
        public int compareTo(Pair p){
            return (int)(this.x-p.x);
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
        public Pair multiply(int x){
            return new Pair(x*this.x, x*this.y);
        }
    }
}
