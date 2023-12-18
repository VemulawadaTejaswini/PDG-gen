import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main
{
    public static void main(String[]args)
    {

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Solver solver = new Solver();
        solver.solve(1,in,out);
        out.close();
    }
    static class Solver
    {

        public int a[];

        public void solve(int ca,InputReader in,PrintWriter out)
        {
            while(ca -- != 0)
            {
                int n = in.nextInt();
                int w = in.nextInt();
                int h = in.nextInt();
                int ans = 0;
                for(int i = 0;i<n;i++)
                {
                    int a = in.nextInt();
                    int b =  in.nextInt();
                    if(a >= w && b >= h)
                    {
                        ans++;
                    }
                }
                out.print(ans);
            }
        }
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
        public BigInteger nextBigInteger()
        {
            return new BigInteger(next());
        }

    }
}
