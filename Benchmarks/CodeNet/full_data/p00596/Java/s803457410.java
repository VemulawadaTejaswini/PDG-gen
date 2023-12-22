
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    int n;
    int[][] ns;
    boolean[] used;
    String[] lines;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        for (int i = 0; i < m.lines.length; i += 2) {
            m.read(i);
            m.solve();
        }
    }

    private void read(int y) {
        String x = lines[y];
        String s = lines[y+1];
        this.n = Integer.parseInt(x);
        String[] ss = s.split(" ");
        ns = new int[n][2];
        for (int i = 0; i < n; i++) {
            ns[i][0] = ss[i].charAt(0) - '0';
            ns[i][1] = ss[i].charAt(1) - '0';
        }
        used = new boolean[n];
    }
    private void read() {
        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null &&
                    !line.equals("")) {
                sb.append(line);
                sb.append("\n");
            }
            lines = sb.toString().split("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void solve() {
        boolean ans = false;
        for (int i = 0; i < ns.length; i++) {
            used[i] = true;
            ans |= dfs(0, ns[i][1]);
        }
        if (ans)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private boolean dfs(int depth, int current) {
//        System.out.printf("depth = %d, curr = %d\n", depth, current);
        if (depth == n - 1)
            return true;
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                if (ns[i][0] == current) {
                    used[i] = true;
                    boolean b = dfs(depth+1, ns[i][1]);
                    if (b)
                        return true;
                    used[i] = false;
                }
                if (ns[i][1] == current) {
                    used[i] = true;
                    if(dfs(depth+1, ns[i][0]))
                        return true;
                    used[i] = false;
                }
            }
        }
        return false;
    }
}