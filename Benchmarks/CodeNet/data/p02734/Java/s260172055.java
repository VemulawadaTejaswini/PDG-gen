import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
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
    static boolean[][] dp;
    static int start[];
    static int stop[];
    // static int ans;
    public static void solve(InputReader sc, PrintWriter pw) {
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int []arr=new int [n];
        feedArr(arr,sc);
        start=new int [n];
        stop=new int [n];
        printAllSubsets(arr, n, sum);
        long ans=0;
        long []temp=new long[n];
        for(int i=1;i<n;i++){
            start[i]+=start[i-1];
            stop[i]+=stop[i-1];
        }
        for(int i=0;i<n;i++){
            if(i>0){
                ans-=start[i-1];
            }
            for(int j=i;j<n;j++){
                ans+=stop[j];
            }
        }
        pw.println(ans%998244353);
    }
    static void printSubsetsRec(int arr[], int i, int sum, ArrayList<Integer> p) 
    {
        if (i == 0 && sum != 0 && dp[0][sum]) 
        { 
            p.add(i); 
            start[p.get(p.size()-1)]++;
            stop[p.get(0)]++;
            p.clear(); 
            return; 
        } 
        if (i == 0 && sum == 0) 
        {  
            start[p.get(p.size()-1)]++;
            stop[p.get(0)]++;
            p.clear(); 
            return; 
        } 
        if (dp[i-1][sum]) 
        { 
            ArrayList<Integer> b = new ArrayList<>(); 
            b.addAll(p); 
            printSubsetsRec(arr, i-1, sum, b); 
        } 
        if (sum >= arr[i] && dp[i-1][sum-arr[i]]) 
        { 
            p.add(i); 
            printSubsetsRec(arr, i-1, sum-arr[i], p); 
        } 
    } 
    static void printAllSubsets(int arr[], int n, int sum) 
    { 
        if (n == 0 || sum < 0) 
            return; 
        dp = new boolean[n][sum + 1]; 
        for (int i=0; i<n; ++i) 
        { 
            dp[i][0] = true; 
        }
        if (arr[0] <= sum) 
            dp[0][arr[0]] = true; 
        for (int i = 1; i < n; ++i) 
            for (int j = 0; j < sum + 1; ++j) 
                dp[i][j] = (arr[i] <= j) ? (dp[i-1][j] || 
                                        dp[i-1][j-arr[i]]) 
                                        : dp[i - 1][j]; 
        if (dp[n-1][sum] == false) 
            return;
        ArrayList<Integer> p = new ArrayList<>(); 
        printSubsetsRec(arr, n-1, sum, p); 
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