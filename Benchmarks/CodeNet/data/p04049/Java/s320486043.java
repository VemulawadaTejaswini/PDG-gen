
import java.io.*;
import java.util.*;

/**
 * Created by pdhinwa on 18/07/2016 AD.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    final int MAXN = (int) 1e5 + 10;
    int N, K;
    List<Integer>[] g = new List[MAXN];

    public void solve() throws IOException {
        Reader reader = new Reader();
        int[] val = reader.readArray();
        N = val[0];
        K = val[1];
        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i + 1 < N; i++) {
            val = reader.readArray();
            int from = val[0];
            int to = val[1];
            from--;
            to--;
            g[from].add(to);
            g[to].add(from);
        }
        int ans = N;
        for (int root = 0; root < N; root++) {
            //System.out.println(root + " " + doIt(root));
            ans = Math.min(ans, doIt(root));
        }
        System.out.println(ans);
    }

    private int doIt(int root) {
        Queue<Integer> Q = new LinkedList<>();
        int[] D = new int[N];
        Arrays.fill(D, -1);
        D[root] = 0;
        Q.add(root);
        while (!Q.isEmpty()) {
            int from = Q.poll();
            for (int to : g[from]) {
                if (D[to] == -1) {
                    D[to] = D[from] + 1;
                    Q.add(to);
                }
            }
        }
        int total = 0;
        if (K % 2 == 0) {
            for (int i = 0; i < N; i++) {
                if (D[i] > K / 2) {
                    total++;
                }
            }
        } else {
            int oddCount = 0;
            for (int i = 0; i < N; i++) {
                if (D[i] > (K + 1) / 2) {
                    total++;
                }
                if (D[i] == (K + 1) / 2) {
                    oddCount++;
                }
            }
            total += Math.max(0, oddCount - 1);
        }
        return total;
    }


    private static class Reader {
        String[] data;
        BufferedReader bufferedReader;

        Reader() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        Reader(File file) throws FileNotFoundException {
            bufferedReader = new BufferedReader(new FileReader(file));
        }

        String readString() throws IOException {
            return bufferedReader.readLine();
        }

        void readEof() throws IOException {
            //Checker.check(readString() == null);
        }

        int readInt() throws IOException {
            return Integer.parseInt(readString());
        }

        int[] readArray() throws IOException {
            data = readString().split(" ");
            int[] res = new int[data.length];
            for (int i = 0; i < res.length; i++) {
                res[i] = Integer.parseInt(data[i]);
            }
            return res;
        }
    }

}
