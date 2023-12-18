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

        int a, b, currentH;
        int[] maxNeighbor = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a = sc.nextInt();
                b = sc.nextInt();
                if (a - 1 == i) {
                    // A側が一致する場合
                    currentH = h[b - 1];
                    if (currentH > maxNeighbor[i]) {
                        maxNeighbor[i] = currentH;
                    }
                }
                else if (b - 1 == i) {
                    // B側が一致する場合
                    currentH = h[a - 1];
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
