import java.util.Scanner;

public class Main {
    int n;
    int[][] ns;
    boolean[] used;
    Scanner sc;

    public static void main(String[] args) {
        Main m = new Main();
        boolean f = m.read();
        while (f) {
            m.solve();
            m.read();
        }
    }

    private boolean read() {
        if (sc == null)
             sc = new Scanner(System.in);
        if (!sc.hasNext())
            return false;
        n = sc.nextInt();
        sc.nextLine();
        String[] ss = sc.nextLine().split(" ");
        ns = new int[n][2];
        for (int i = 0; i < n; i++) {
            ns[i][0] = ss[i].charAt(0) - '0';
            ns[i][1] = ss[i].charAt(1) - '0';
        }
        used = new boolean[n];
        return true;
    }

    private void solve() {
        used[0] = true;
        boolean ans = dfs(0, ns[0][1]);
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