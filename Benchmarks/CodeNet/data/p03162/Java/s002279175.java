import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        ModScanner ms = new ModScanner();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        int n = ms.nextInt();
        int a, b, c;
        int[] prev = new int[3];
        for (int i = 0; i < n; i++) {
            a = ms.nextInt();
            b = ms.nextInt();
            c = ms.nextInt();

            int[] curr = new int[3];

            curr[0] = a + Math.max(prev[1], prev[2]);
            curr[1] = b + Math.max(prev[0], prev[2]);
            curr[2] = c + Math.max(prev[0], prev[1]);
            prev = curr;
        }

        out.println(Math.max(prev[0], Math.max(prev[1], prev[2])));
        out.close();
    }


}

class ModScanner {

    BufferedReader br;
    StringTokenizer st;

    public ModScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextToken() throws Exception {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());

        }
        return st.nextToken();
    }

    String nextString() throws Exception {
        return br.readLine();
    }


    int nextInt() throws Exception, Exception {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }

}
