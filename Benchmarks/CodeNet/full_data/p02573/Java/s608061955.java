import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    int[] root;

    private void connect(int friend1, int friend2) {
        int root1 = getRootOf(friend1);
        int root2 = getRootOf(friend2);

        root[root2] = root1;
    }

    private int getRootOf(int friend) {
        while (root[friend] != friend) {
            root[friend] = root[root[friend]];
            friend = root[friend];
        }

        return friend;
    }

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        root = new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
        }
        for (int i = 0; i < m; i++) {
            tokenizer = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(tokenizer.nextToken()) - 1;
            int b = Integer.parseInt(tokenizer.nextToken()) - 1;
            connect(a, b);
        }

        int[] inGroup = new int[n];
        for (int i = 0; i < n; i++) {
            inGroup[getRootOf(i)]++;
        }
        int max = 0;
        for (int i = 0; i < n; i++) max = Math.max(max, inGroup[i]);

        out.println(max);

        out.close();
    }
}