
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable t) {
            t.printStackTrace(System.err);
            System.exit(-1);
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    void solve() throws IOException {
        int n = readInt();
        int w = readInt();
        long[] dp = new long[(int)w+1];
        long res = 0;
        for(int i=0;i<n;i++) {
            int wi = readInt();
            int vi = readInt();
            for(int j=w-wi; j>=0; j--){
                if(dp[j+wi]<dp[j]+vi) {
                    dp[j + wi] = dp[j] + vi;
                    if(res<dp[j]+vi)
                        res=dp[j]+vi;
                }
            }
        }
        System.out.println(res);
    }
}

