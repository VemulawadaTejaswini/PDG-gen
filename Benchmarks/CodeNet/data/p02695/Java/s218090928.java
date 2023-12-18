import java.util.*;
import java.util.stream.Collectors;

class Main {
    final Scanner sc = new Scanner(System.in);
    private int n;
    private int m;
    private int q;
    Row[] rows;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();

        rows = new Row[q];
        for (int i = 0; i < q; i++) {
            rows[i] = new Row(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        int[] A = new int[n+1];
        System.out.println(dfs(1, A));
    }

    private int dfs(int i, int[] A) {
        if (i == n+1) {
            int score = 0;
            for (int j = 0; j < q; j++) {
                if (A[rows[j].b] - A[rows[j].a] == rows[j].c) score += rows[j].d;
            }
            return score;
        }

        int max = 0;
        int start = i == 1 ? 1 : A[i-1];
        for (int j = start; j <= m; j++) {
            A[i] = j;
            int now = dfs(i+1, A);
            max = Math.max(now, max);
        }
        return max;
    }

    class Row {
        int a;
        int b;
        int c;
        int d;

        public Row(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
