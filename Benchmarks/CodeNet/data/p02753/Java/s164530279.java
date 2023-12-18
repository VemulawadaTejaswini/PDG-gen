import java.io.*;
import java.util.*;
 import java.math.BigInteger; 
public class Main{
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }
    static int L,R;
    // static int ans;
    public static void solve(InputReader sc, PrintWriter pw) {
        // int t=sc.nextInt();
        int t=1;
        // int a=0,b=0;
        u:while(t-->0){
            long n=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a+b==0){
                pw.println(0);
                continue u;
            }
            long ans=(n/(a+b))*a+Math.min(a,n%(a+b));
            pw.println(ans);
        }
    }
    public static int helper(char []chrr,int i,int n,boolean vis[],int ans,HashMap<Pair,Integer> hset){
        int temp=Integer.MAX_VALUE,dist=ans;
        for(;i<n/2;i++){
            if(chrr[i]!=chrr[n-1-i]){
                if(i<n-1&&!vis[i+1]){
                    if(!hset.containsKey(new Pair(i,i+1))){
                        swap(chrr,i,i+1);
                        if(chrr[i]==chrr[n-1-i]&&chrr[i+1]==chrr[n-2-i]){
                            vis[i]=true;
                            vis[i+1]=true;
                            ans=helper(chrr,i+2,n,vis,dist+1,hset);
                            hset.put(new Pair(i,i+1),ans);
                            temp=Math.min(temp,ans);
                            vis[i]=false;
                            vis[i+1]=false;
                        }
                        else
                            hset.put(new Pair(i,i+1),Integer.MAX_VALUE);
                        swap(chrr,i,i+1);
                    }
                    else
                        temp=Math.min(temp,hset.get(new Pair(i,i+1)));
                }
                if(i>0&&!vis[i-1]){
                    if(!hset.containsKey(new Pair(i-1,i))){
                        swap(chrr,i,i-1);
                        if(chrr[i]==chrr[n-i-1]&&chrr[i-1]==chrr[n-i]){
                            vis[i]=true;
                            vis[i-1]=true;
                            ans=helper(chrr,i+1,n,vis,dist+1,hset);
                            hset.put(new Pair(i-1,i),ans);
                            temp=Math.min(temp,ans);
                            vis[i]=false;
                            vis[i-1]=false;
                        }
                        else
                            hset.put(new Pair(i-1,i),Integer.MAX_VALUE);
                        swap(chrr,i,i-1);
                    }
                    else
                        temp=Math.min(temp,hset.get(new Pair(i-1,i)));
                }
                if(n-i-1>0&&!vis[n-i-2]){
                    if(!hset.containsKey(new Pair(n-i-2,n-i-1))){
                        swap(chrr,n-i-2,n-i-1);
                        if(chrr[i]==chrr[n-1-i]&&chrr[i+1]==chrr[n-2-i]){
                            vis[n-i-1]=true;
                            vis[n-i-2]=true;
                            ans=helper(chrr,i+2,n,vis,dist+1,hset);
                            hset.put(new Pair(n-i-2,n-i-1),ans);
                            temp=Math.min(temp,ans);
                            vis[n-i-1]=false;
                            vis[n-i-2]=false;
                        }
                        else
                            hset.put(new Pair(n-i-2,n-i-1),Integer.MAX_VALUE);
                        swap(chrr,n-i-2,n-i-1);
                    }
                    else
                        temp=Math.min(temp,hset.get(new Pair(n-i-2,n-i-1)));
                }
                if(n-i<n&&!vis[n-i]){
                    if(!hset.containsKey(new Pair(n-i-1,n-i))){
                        swap(chrr,n-i-1,n-i);
                        if(chrr[i]==chrr[n-i-1]&&chrr[i-1]==chrr[n-i]){
                            vis[n-i-1]=true;
                            vis[n-i]=true;
                            ans=helper(chrr,i+1,n,vis,dist+1,hset);
                            hset.put(new Pair(n-i-1,n-i),ans);
                            temp=Math.min(temp,ans);
                            vis[n-i-1]=false;
                            vis[n-i]=false;
                        }
                        else
                            hset.put(new Pair(n-i-1,n-i),Integer.MAX_VALUE);
                        swap(chrr,n-i-1,n-i);
                    }
                    else
                        temp=Math.min(temp,hset.get(new Pair(n-i-1,n-i)));
                }
                return temp;
            }
        }
        return temp;
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
    static class Pair implements Comparable<Pair>{
        int a, b;
        Pair(int a,int b){
            this.a=a;
            this.b=b;
        }   
        public int compareTo(Pair p){
            return (b-p.b);
        }
        public int hashCode(){
            int hashcode = (a+" "+b).hashCode();
            return hashcode;
        }
         
        public boolean equals(Object obj){
            if (obj instanceof Pair) {
                Pair p = (Pair) obj;
                return (p.a==this.a && p.b == this.b);
            }
            return false;
        }
    }
 
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