import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out=new PrintWriter(outputStream);
            int ans =TaskA.solve(0,in);
            out.println(ans);
        out.close();
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
        public double nextDouble() { return Double.parseDouble(next()); }
    }
}
class TaskA {
    public static int solve(int testNumber, Main.InputReader in) {
        int ans=0;
        int max=Integer.MIN_VALUE;
        String s=in.next();
        for(int i=0;i<3;i++)
        {
            if(s.charAt(i)=='R'){
             ans++;
                if(ans>max)
                    max=ans;
            }
            else {
                ans = 0;
            }
        }
        return max;
    }
}
