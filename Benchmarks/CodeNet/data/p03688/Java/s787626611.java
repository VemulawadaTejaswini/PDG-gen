import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public void solve() throws IOException {
        int n = nextInt();
        int a[] = new int[n];
        int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }
        if(max - min > 1) {
            out.print("No");
            return;
        }else if(max - min == 0){
            if(max <= n / 2 || max == n - 1) out.print("Yes");
            else out.print("No");
            return;
        }else{
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if(a[i] == min) cnt++;
            }
            if(cnt > min){
                out.print("No");
                return;
            }else{
                if(cnt + (max - cnt) * 2 > n){
                    out.print("No");
                }else out.print("Yes");
            }
        }
    }


    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
//            br = new BufferedReader(new FileReader("queue.in"));
//            out = new PrintWriter(new File("queue.out"));
            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}