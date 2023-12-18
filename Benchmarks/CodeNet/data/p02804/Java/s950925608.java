import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }

    public static void solve(InputReader sc, PrintWriter pw) {
        int i,j=0;
        int t=1;
        // int t=sc.nextInt();
        u:while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            int mod=1000000007;
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            long h=1,sum=0,kk=1;
            int y=k;
            for(i=0;i<=n-k;i++){
                // if(i+k-1<n-k-i)
                //     continue;
                // kk+=h;
                sum=h*(a[i+k-1]-a[n-k-i])%mod+sum;
                // pw.println((i+k-1)+" "+(n-k-i)+" "+h);
                sum%=mod;
                // h*=y*modInverse(kk,mod)%mod;
                h*=y;
                h%=mod;
                h=h*modInverse(kk,mod)%mod;
                // h=h/kk%mod;
                kk++;
                h%=mod;
                y++;
                
            }
            pw.println(sum);
        }
    }

    static class Pair implements Comparable<Pair>{
        int a;int b;
        Pair(int a,int b){
            this.a=a;
            this.b=b;
            //this.z=z;
        }   
        public int compareTo(Pair p){
            return (a-p.a);
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
    static long gcd(long a, long b) { 
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
    }
}