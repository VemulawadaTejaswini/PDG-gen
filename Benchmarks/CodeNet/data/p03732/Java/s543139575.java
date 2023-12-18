import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.IntStream;

public class Main {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
        Main main = new Main();
        try {
            in = new ContestScanner();
            out = new Writer();
            main.solve();
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void solve() throws IOException {
        int n = in.nextInt();
        int W = in.nextInt();
        long[][] dp = new long[n + 1][3 * n + 1];
        // dp[個数][重さ(w1を下駄とみなす)] = 価値の最大値
        long inf = Long.MAX_VALUE / 2;
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -inf);
        }
        long w1 = in.nextLong();
        long v1 = in.nextLong();
        dp[0][0] = 0;
        dp[1][0] = v1;
        for (int i = 1; i < n; i++) {
            long w = in.nextLong();
            int sw = (int)(w - w1);
            long v = in.nextLong();
            for (int j = i; j >= 0; j--) {
                for (int k = 0; k <= 3 * n - sw; k++) {
                    if(dp[j][k] == inf) continue;
                    dp[j + 1][k + sw] = Math.max(dp[j + 1][k + sw], dp[j][k] + v);
                }
            }
        }
        long best = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 3 * n; j++) {
                long w = i * w1 + j;
                if(w > W) continue;
                best = Math.max(best, dp[i][j]);
            }
        }
        System.out.println(best);
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