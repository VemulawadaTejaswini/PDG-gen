import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter pw;
    static Scanner sc;
    static int inf=(int)1e9;
    static String a, b;
    static int[] arr;
    static int[][] dp;
    static HashMap<Pair, Integer> map= new HashMap<Pair, Integer>();
    static long ceildiv(long x, long y){ return (x+y-1)/y;}
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        pw = new PrintWriter(System.out);
        a=sc.nextLine(); b=sc.nextLine();
        dp=new int[a.length()][b.length()];
        for(int i=0; i<a.length(); i++)
            Arrays.fill(dp[i], -1);
        solve(0, 0);
        trace();
        pw.close();
    }
    static int solve(int i, int j){
        if(i==a.length() || j==b.length())
            return 0;
        if(dp[i][j]==-1)
            dp[i][j]=a.charAt(i)==b.charAt(j)?1+solve(i+1, j+1):Math.max(solve(i, j+1), solve(i+1, j));
        return dp[i][j];
    }
    static void trace(){
        StringBuilder ans= new StringBuilder();
        int i=0, j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                ans.append(a.charAt(i++));
                j++;
            }else{
                if(i<a.length()-1 && j<b.length()-1){
                    if(dp[i+1][j]>dp[i][j+1])
                        i++;
                    else
                        j++;
                }else if(i!=a.length()-1){
                    i++;
                }else if(j!=b.length()-1){
                    j++;
                }else{
                    break;
                }
            }
        }
        pw.println(ans);
    }
    static boolean test(char[][] arr){
        for(int i=1; i<arr.length; i++){
            if(!test(arr[0], arr[i]))
                return false;
        }
        return true;
    }
    static boolean test(char[] a, char[] b){
        int diff=0;
        for(int i=0; i<a.length; i++){
            diff+=a[i]==b[i]?0:1;
            if(diff==2)
                return false;
        }
        return true;
    }
    static void printArr(int[] arr){
        for(int i=0; i<arr.length-1; i++)
            pw.print(arr[i]+" ");
        pw.println(arr[arr.length-1]);
    }
    static void printArr(long[] arr){
        for(int i=0; i<arr.length-1; i++)
            pw.print(arr[i]+" ");
        pw.println(arr[arr.length-1]);
    }
    static void printArr(Integer[] arr){
        for(int i=0; i<arr.length-1; i++)
            pw.print(arr[i]+" ");
        pw.println(arr[arr.length-1]);
    }
    static void printArr(char[] arr){
        for(int i=0; i<arr.length; i++)
            pw.print(arr[i]);
        pw.println();
    }
    static void printArr(ArrayList list){
        for(int i=0; i<list.size(); i++)
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
            return this.x*1000+this.y;
        }
        public int compareTo(Pair p) {
            int st1=p.x==0?arr[p.y+1]:arr[p.x-1];
            int end1=p.y==arr.length-1?arr[p.x-1]:arr[p.y+1];
            int st2=this.x==0?arr[this.y+1]:arr[this.x-1];
            int end2=this.y==arr.length-1?arr[this.x-1]:arr[this.y+1];
            int a=st1%2==end1%2?1:0;
            int b=st2%2==end2%2?1:0;
            if(a>b)
                return 1;
            if(a<b)
                return -1;
            return this.y-this.x-p.y+p.x;
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
    }
    static class Triple implements Comparable<Triple>{
        int x;
        int y;
        char c;
        public Triple(int x, int y, char c){
            this.x=x;
            this.y=y;
            this.c=c;
        }
        public int compareTo(Triple t){
            return this.y-t.y;
        }
        public String toString(){
            if(this.x==1)
                return "INSERT "+(this.y+1)+" "+this.c;
            else if(this.x==0)
                return "REPLACE "+(this.y+1)+" "+this.c;
            else
                return "DELETE "+(this.y+1);
        }
    }
    static class decimal{
        int x;
        int dec;
        public decimal(String s){
            x=Integer.parseInt(s.substring(0, s.length()-3));
            dec=Integer.parseInt(s.substring(s.length()-2));
        }
        public decimal(int x, int dec){
            this.x=x;
            this.dec=dec;
        }
        public decimal plus(decimal a){
            return new decimal(this.x+a.x+(this.dec+a.dec)/100, (this.dec+a.dec)%100);
        }
        public decimal minus(decimal a){
            return new decimal(this.x-a.x-(this.dec>=a.dec?0:1), (this.dec+100-a.dec)%100);
        }
        public decimal min(decimal a){
            if(a.x>this.x)
                return this;
            if(this.x>a.x)
                return a;
            if(a.dec>this.dec)
                return this;
            return a;
        }
        public String toString(){
            return this.x+"."+this.dec;
        }
        public decimal clone(){
            return new decimal(this.x, this.dec);
        }
        public boolean equal(decimal a){
            return a.x==this.x && a.dec==this.dec;
        }
    }
}
