import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main implements Runnable {

    private void solve() throws IOException {

        int N = nextInt();
        int L = nextInt();
        String[] s = new String[N];
        for(int i = 0; i < N; ++i) {
            s[i] = reader.readLine();
        }
        Arrays.sort(s);
        String ret= "";
        for(int i = 0; i < s.length; ++i) ret += s[i];
        writer.println(ret);
    }

    public static void main(String[] args) {

        new Main().run();
    }

    BufferedReader reader;
    StringTokenizer tokenizer;
    PrintWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//             reader = new BufferedReader(new FileReader("input.txt"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
            solve();
            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    String nextToken() throws IOException {
        while(tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }
}
