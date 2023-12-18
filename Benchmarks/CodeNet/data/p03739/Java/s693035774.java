import java.io.*;
import java.math.BigInteger;

public class Main  implements Runnable {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
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
        n = in.nextInt();
        s = new long[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.nextLong();
        }
        long left = Integer.MIN_VALUE;
        long right = Integer.MAX_VALUE;
        long ans = right;
        while (left <= right) {
            long m1 = (left * 2 + right) / 3;
            long m2 = (left + right * 2) / 3;
            long a1 = apply(m1);
            long a2 = apply(m2);
            if (a1 < a2) {
                ans = Math.min(ans, a1);
                right = m2 - 1;
            } else {
                ans = Math.min(ans, a2);
                left = m1 + 1;
            }
        }

        System.out.println(ans);
    }

    int n;
    long[] s;
    long apply(long diff) {
        long ans = Math.abs(diff);
        long sum = s[0] + diff;

        for (int i = 1; i < n; i++) {
            long a = s[i];
            long target = -Long.signum(sum);
            if ((a + sum) * target > 0) sum += a;
            else {
                ans += Math.abs(a + sum - target);
                sum = target;
            }
        }
        return ans;
    }
}

class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException {super(System.out);}
}
class ContestScanner implements Closeable {
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