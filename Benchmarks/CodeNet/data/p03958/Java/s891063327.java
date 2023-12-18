import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Aksenov239 on 23.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public String nextToken() throws  IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException{
        return Integer.parseInt(nextToken());
    }

    public void solveA() throws IOException {
        String s = nextToken();
        String f = "CF";
        int p = 0;
        for (int i = 0; i < s.length() && p < f.length(); i++) {
            if (s.charAt(i) == f.charAt(p)) {
                p++;
            }
        }
        if (p == 2) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }

    public void solveB() throws IOException {
        int k = nextInt();
        int t = nextInt();
        int[] a = new int[t];
        int max = 0;
        for (int i = 0; i < t; i++) {
            a[i] = nextInt();
            max = Math.max(a[i], max);
        }

        if (2 * max > k) {
            out.println(max - 1 - (k - max));
        } else {
            out.println(0);
        }
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solveB();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
