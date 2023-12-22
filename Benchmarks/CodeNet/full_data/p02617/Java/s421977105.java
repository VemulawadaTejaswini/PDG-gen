import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream;
        OutputStream outputStream;
        if(System.getProperty("ONLINE_JUDGE") == null) {
            File input = new File("test.inp");
            inputStream = new FileInputStream(input);
        }
        else {
            inputStream = System.in;
        }
        outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {

        public void solve(InputReader in, PrintWriter out) {
            int n;
            n = in.nextInt();
            long ans = 0;
            for(int i = 1;i <= n;++i){
                ans += (long)i * (long)(n - i + 1);
            }
            for(int i = 1;i < n;++i){
                int u,v;
                u = in.nextInt();
                v = in.nextInt();
                if(u > v){
                    int tmp = u;
                    u = v;
                    v = tmp;
                }
                ans -= (long)u * (long)(n - v + 1);
            }
            out.println(ans);
        }

    }
    
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
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

        String nextLine() {
            String str = "";
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}


