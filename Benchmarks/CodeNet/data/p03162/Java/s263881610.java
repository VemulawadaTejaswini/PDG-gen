
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
        int[][] all = new int[n][3];
        int[][] res = new int[n][3];
        for(int i=0;i<n;i++) {
            all[i][0] = readInt();
            all[i][1] = readInt();
            all[i][2] = readInt();
        }
        res[0][0]=all[0][0];
        res[0][1]=all[0][1];
        res[0][2]=all[0][2];
        for(int i=1;i<n;i++){
            for(int k=0;k<3;k++) {
                int max = 0;
                for (int j = 0; j < 3; j++) {
                    if (k == j)
                        continue;
                    if (res[i - 1][j] > max)
                        max = res[i - 1][j];
                }
                res[i][k] = all[i][k]+max;
            }
        }
        System.out.println(Math.max(res[n-1][0], Math.max(res[n-1][1], res[n-1][2])));
    }
}
