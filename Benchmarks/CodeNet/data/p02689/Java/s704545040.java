import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] h = new int[n+1];
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
        }

        int a, b;
        int[] maxNeighbor = new int[n+1];
        for (int j = 0; j < m; j++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (maxNeighbor[a] < h[b]) {
                maxNeighbor[a] = h[b];
            }
            if (maxNeighbor[b] < h[a]) {
                maxNeighbor[b] = h[a];
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (h[i] > maxNeighbor[i]) {
                count++;
            }
        }

        // 出力
        System.out.println(count);
    }
}
