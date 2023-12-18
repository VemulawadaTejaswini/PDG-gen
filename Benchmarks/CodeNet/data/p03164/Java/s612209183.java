
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
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
        long w = readLong();
        long[] wi = new long[n];
        int[] vi = new int[n];
        long res = 0;
        int sum = 0;
        for(int i=0;i<n;i++) {
            wi[i] = readLong();
            vi[i] = readInt();
            sum+=vi[i];
        }
        long[] dp = new long[sum+1];
        Arrays.fill(dp,Long.MAX_VALUE-1000000000-100);
        dp[0]=0;
        for(int i=0;i<n;i++){
            long tw = wi[i];
            int tv = vi[i];
            for(int j=sum-tv;j>=0;j--){
                if(dp[j]+tw>w)
                    continue;
                if(dp[j+tv]>dp[j]+tw){
                    dp[j+tv] = dp[j]+tw;
                    if(res<j+tv)
                        res=j+tv;
                }
            }
        }
        System.out.println(res);
    }
}
