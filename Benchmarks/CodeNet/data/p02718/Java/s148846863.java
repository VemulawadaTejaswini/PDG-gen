
import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int n = in.nextInt();
        int m = in.nextInt();
        int[]a = new int[n];
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            if(a[i] >= (double)sum / (4 * m)){
                cnt++;
            }
        }
        if(cnt >= m) in.out.println("Yes");
        else in.out.println("No");
        in.out.close();
    }
}


class FastScanner {
    BufferedReader br;
    StringTokenizer st = new StringTokenizer("");
    PrintWriter out;

    FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
    }

    FastScanner(String in, String out_) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(in));
        out = new PrintWriter(out_);
    }

    String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}