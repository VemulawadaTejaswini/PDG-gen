import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.*;
/**
 * Created by Aksenov239 on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public String nextToken() throws IOException{
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException{
        return Integer.parseInt(nextToken());
    }

    public void solve() throws IOException {
        String s = nextToken();
        out.println(s.substring(0, 4) + " " + s.substring(4, 12));
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solve();

            out.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
