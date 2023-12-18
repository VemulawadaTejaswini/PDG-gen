import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

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

    public String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        int q = nextInt();
        int[] a = new int[q];
        for (int i = 0; i < q; i++) {
            a[q - i - 1] = nextInt();
        }
        ArrayList<Integer> b = new ArrayList<Integer>();
        HashMap<Integer, Integer> pos = new HashMap<Integer, Integer>();
        int[] waiting = new int[q];
        for (int i = 0; i < q; i++) {
            if (!pos.containsKey(a[i])) {
                b.add(a[i]);
                waiting[b.size() - 1] = 1;
                pos.put(a[i], b.size() - 1);
                continue;
            }
            int p = pos.get(a[i]);
            if (waiting[p] == n) {
                continue;
            }
            waiting[p]++;
        }
        int j = b.size() - 1;
        int z = b.get(b.size() - 1);
        while (j >= 0 && b.get(j) == z) {
            j--;
            z--;
        }
        for (int i = 0; i < (z == 0 ? j + 1 : b.size()); i++) {
            if (waiting[i] != n) {
                out.println("No");
                return;
            }
        }
        out.println("Yes");
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solve();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
