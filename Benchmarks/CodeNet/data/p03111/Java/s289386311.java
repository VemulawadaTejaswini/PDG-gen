import java.util.Scanner;

public class Main {
    private static int N;
    private static int A;
    private static int B;
    private static int C;
    private static int[] l;
    private static int INF = 1000000;

    static {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        A = Integer.parseInt(sc.next());
        B = Integer.parseInt(sc.next());
        C = Integer.parseInt(sc.next());
        l = new int[N];

        for (int i = 0; i < N; i++) {
            l[i] = Integer.parseInt(sc.next());
        }
    }

    public static void main(String[] args) {
        System.out.println(dfs(0, 0, 0, 0));
    }

    private static int dfs(int cursor, int a, int b, int c) {
        if (cursor == N) {
            // 足りない分とはみ出た分を調整しているコストを計算している。
            // -30 は初回に合成しているとみなしている分を減算している。
            return min(a, b, c) > 0 ? Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30 : INF;
        }

        // cursor が当たっている竹をa or b or c に合成する or どこにも合成しないのパターンを計算している。
        int noCompoundPattern = dfs(cursor + 1, a, b, c);
        int aCompoundPattern = dfs(cursor + 1, a + l[cursor], b, c) + 10;
        int bCompoundPattern = dfs(cursor + 1, a, b + l[cursor], c) + 10;
        int cCompoundPattern = dfs(cursor + 1, a, b, c + l[cursor]) + 10;
        return min(noCompoundPattern, aCompoundPattern, bCompoundPattern, cCompoundPattern);
    }

    private static int min(int a, int b, int... c) {
        int min = Math.min(a, b);
        for (int i : c) {
            min = Math.min(min, i);
        }

        return min;
    }
}
