import java.io.*;
import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }
    static int L,R,top,bottom;
    // static int ans;
    public static void solve(InputReader sc, PrintWriter pw) {
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        long [][]arr=new long [n][m];
        String s;
        for(int i=0;i<n;i++){
            s=sc.next();
            for(int j=0;j<m;j++){
                if(s.charAt(j)=='.')
                    arr[i][j]=0;
                else
                    arr[i][j]=1;
            }
        }
        boolean [][]vis=new boolean[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                vis[i][j]=false;
        vis[n-1][m-1]=true;
        ff(arr,0,0,vis,n,m);
        pw.println(arr[0][0]);
    }
    public static void ff(long [][]arr, int i,int j, boolean [][]vis, int n, int m){
        if(vis[i][j])
            return;
        if(i<n-1&&j<m-1){
            ff(arr,i+1,j,vis,n,m);
            ff(arr,i,j+1,vis,n,m);
            arr[i][j]+=Math.min(arr[i+1][j],arr[i][j+1]);
        }
        else if(i<n-1){
            ff(arr,i+1,j,vis,n,m);
            arr[i][j]+=arr[i+1][j];
        }
        else if(j<m-1){
            ff(arr,i,j+1,vis,n,m);
            arr[i][j]+=arr[i][j+1];
        }
        vis[i][j]=true;
    }
    public static void swap(char []chrr, int i, int j){
        char temp=chrr[i];
        chrr[i]=chrr[j];
        chrr[j]=temp;
    }
    public static int num(int n){
        int a=0;
        while(n>0){
            a+=(n&1);
            n>>=1;
        }
        return a;
    }
    static class Pair{
        int u, v;
        Pair(int a,int b){
            this.u=a;
            this.v=b;
        }   
    }
        // public int compareTo(Pair p){
        //     return (b-p.b);
        // }
        // public int hashCode(){
        //     int hashcode = (a+" "+b).hashCode();
        //     return hashcode;
        // }
         
        // public boolean equals(Object obj){
        //     if (obj instanceof Pair) {
        //         Pair p = (Pair) obj;
        //         return (p.a==this.a && p.b == this.b);
        //     }
        //     return false;
        // }
 
    static boolean isPrime(int n) { 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
        return true; 
    } 
    static int gcd(int a, int b) { 
        if (b == 0) 
            return a; 
        return gcd(b, a % b);  
    } 
    static long fast_pow(long base,long n,long M){
        if(n==0)
           return 1;
        if(n==1)
        return base;
        long halfn=fast_pow(base,n/2,M);
        if(n%2==0)
            return ( halfn * halfn ) % M;
        else
            return ( ( ( halfn * halfn ) % M ) * base ) % M;
    }
    static long modInverse(long n,long M){
        return fast_pow(n,M-2,M);
    }
    public static void feedArr(long []arr,InputReader sc){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextLong();
    }
    public static void feedArr(double []arr,InputReader sc){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextDouble();
    }
    public static void feedArr(int []arr,InputReader sc){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
    }
    public static void feedArr(String []arr,InputReader sc){
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.next();
    }
    public static String printArr(int []arr){
        StringBuilder sbr=new StringBuilder();
        for(int i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    public  static String printArr(long []arr){
        StringBuilder sbr=new StringBuilder();
        for(long i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    public static String printArr(String []arr){
        StringBuilder sbr=new StringBuilder();
        for(String i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    public static String printArr(double []arr){
        StringBuilder sbr=new StringBuilder();
        for(double i:arr)
            sbr.append(i+" ");
        return sbr.toString();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}   