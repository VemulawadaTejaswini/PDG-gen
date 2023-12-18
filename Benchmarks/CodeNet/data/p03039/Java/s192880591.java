import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    static ContestScanner in;static Writer out;static StringBuilder sb=new StringBuilder();
    public static void main(String[] args)
    {try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve();
        in.close();out.flush();out.close();}catch(IOException e){e.printStackTrace();}}
    void solve() throws NumberFormatException, IOException{
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        long[][] dp = new long[n][m];
        long mod = 1000000007;
        for (int i = 0; i < m - 1; i++) {
            dp[0][i + 1] = (dp[0][i] + i + 1) % mod;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                dp[i + 1][j] = (dp[i][j] + dp[0][j] + dp[0][m - j - 1] + m * (i + 1) % mod) % mod;
            }
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum = (sum + dp[i][j]) % mod;
            }
        }
        long[] fact = getFact(n * m, mod);
        long comb = modcomb(n * m - 2, k - 2, fact, mod);
        System.out.println(comb * sum % mod);
    }

    long modcomb(int n, int r, long[] fact, long mod) {
        return fact[n] * modinv(fact[n - r], mod) % mod * modinv(fact[r], mod) % mod;
    }

    long[] getFact(int n, long mod) {
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }
        return fact;
    }

    long modinv(long n, long mod){
        return modpow(n, mod-2, mod);
    }

    long modpow(long n, long a, long mod){
        long res = 1;
        while(a > 0){
            if((a&1)==1) res = (res * n) % mod;
            n = n * n % mod;
            a >>= 1;
        }
        return res;
    }
}

class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException{super(System.out);}
}
class ContestScanner implements Closeable{
    private BufferedReader in;private int c=-2;
    public ContestScanner()throws IOException
    {in=new BufferedReader(new InputStreamReader(System.in));}
    public ContestScanner(String filename)throws IOException
    {in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
    public String nextToken()throws IOException {
        StringBuilder sb=new StringBuilder();
        while((c=in.read())!=-1&&Character.isWhitespace(c));
        while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public String readLine()throws IOException{
        StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
        while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public long nextLong()throws IOException,NumberFormatException
    {return Long.parseLong(nextToken());}
    public int nextInt()throws NumberFormatException,IOException
    {return(int)nextLong();}
    public double nextDouble()throws NumberFormatException,IOException
    {return Double.parseDouble(nextToken());}
    public void close() throws IOException {in.close();}
}