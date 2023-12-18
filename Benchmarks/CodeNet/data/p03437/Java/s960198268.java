import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    void solve() throws IOException {
        long x = getLong();
        long y = getLong();
        if(x == y){
            System.out.println(-1);
            return;
        }
        for(long i = 2; i < 1000000; ++i){
            long res = (long)(x * i);
            if(res % y != 0){
                System.out.println(res);
                return;
            }
        }
        System.out.println(-1);
    }

    BufferedReader bufferedReader;
    PrintWriter output;
    StringTokenizer tokenizer;

    public static void main(String[] args) throws IOException {
        Main contest = new Main();
        contest.run();
    }

    public String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(bufferedReader.readLine());
        }
        return tokenizer.nextToken();
    }

    public int getInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public long getLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    void run() throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        output = new PrintWriter(System.out);
        solve();
    }

}
