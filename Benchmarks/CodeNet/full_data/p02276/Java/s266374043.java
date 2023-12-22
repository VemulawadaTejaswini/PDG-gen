import java.util.*;
import java.awt.geom.Point2D.Double;

public class Main {
    private static int MAX = 100000;

    public static void main(String[] args) throws Exception {
            // 入力
            int[]   A = new int[MAX];
            int     n;
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(sc.next());
            }
            sc.close();

            // パーティション
            int     q = partition(A, 0, n - 1);

            // 出力
            for (int i = 0; i < n; i++) {
                if (i > 0) System.out.print(" ");
                if (i == q) System.out.print("[");
                System.out.print(A[i]);
                if (i == q) System.out.print("]");
            }
            System.out.println();
    }

    static int partition(int[] A, int p, int r) {
        int         x = A[r];       // 配列の末尾。判定の基準になる
        int         i = p - 1;      // A[r]以下を差す
        int         temp = 0;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i = i + 1;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;
        return i + 1;
    }
}

