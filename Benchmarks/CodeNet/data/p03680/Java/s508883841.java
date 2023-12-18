import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    int n;
    int next[];
    boolean used[];

    public void solve() throws IOException {
        n = nextInt();
        next = new int[n];
        for (int i = 0; i < n; i++) {
            next[i] = nextInt() - 1;
        }
        int cnt = 0;
        used = new boolean[n];
        int k = 0;
        while(k != 1 && !used[k]){
            used[k] = true;
            k = next[k];
            cnt++;
        }
        if(k == 1) out.print(cnt);
        else out.print(-1);

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