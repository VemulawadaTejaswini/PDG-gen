import java.util.*;
import java.awt.geom.Point2D.Double;

public class Main {
    private static final int    MAX = 500000;
    private static final int    SENTINEL = 2000000000;
    private static int[]        L = new int[MAX / 2 + 2];
    private static int[]        R = new int[MAX / 2 + 2];
    private static int          count = 0;

    static void merge(int A[], int n, int left, int mid, int right) {
        // 部分配列を用意する
        int n1 = mid - left;        // 左側の個数
        int n2 = right - mid;       // 右側の個数
        for (int i = 0; i < n1; i++) L[i] = A[left + i];
        for (int i = 0; i < n2; i++) R[i] = A[mid + i];
        L[n1] = R[n2] = SENTINEL;       // 番兵

        // マージ
        int litr = 0;
        int ritr = 0;
        for (int i = left; i < right; i++) {
            count++;
            // 小さい方からもとの配列を上書きしていく
            if (L[litr] <= R[ritr]) {
                A[i] = L[litr++];
            } else {
                A[i] = R[ritr++];
            }
        }
    }

    static void mergeSort(int[] A, int n, int left, int right) {
        if (left + 1 < right) {
            // leftは部分配列の先頭。rightは末尾+1
            int     mid = (left + right) / 2;
            mergeSort(A, n, left , mid);
            mergeSort(A, n, mid, right);
            merge(A, n, left, mid, right);
        }
    }
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

            // マージソート
            mergeSort(A, n, 0, n);

            // 出力
            for (int i = 0; i < n; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(A[i]);
            }
            System.out.println();

            System.out.println(count);
    }
}

