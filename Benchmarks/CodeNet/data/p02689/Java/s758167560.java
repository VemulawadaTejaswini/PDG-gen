import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int[] maxNeighbor = new int[n];
        int currentH;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[j] - 1 == i) {
                    // A側が一致する場合
                    currentH = h[b[j] - 1];
                    if (currentH > maxNeighbor[i]) {
                        maxNeighbor[i] = currentH;
                    }
                }
                else if (b[j] - 1 == i) {
                    // B側が一致する場合
                    currentH = h[a[j] - 1];
                    if (currentH > maxNeighbor[i]) {
                        maxNeighbor[i] = currentH;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (maxNeighbor[i] == 0 || h[i] > maxNeighbor[i]) {
                count++;
            }
        }

        // 出力
        System.out.println(count);
    }
}
