import java.util.*;
import java.lang.*;

/**
 * HowManyIslands
 */
public class Main {

    public static void main(String[] args) {
        int tate[] = { -1, -1, -1, 0 };
        int yoko[] = { -1, 0, 1, -1 };

        Scanner sc = new Scanner(System.in);
        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            int list[][] = new int[h][w];

            if (w == 0 && h == 0)
                return;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    list[i][j] = sc.nextInt();
                }
            }

            // ここでUnionFind
            int parent[] = new int[w * h]; // 親の番号(親なら全体の大きさをマイナスで)格納
            for (int i = 0; i < w * h; i++) {
                parent[i] = -1;
            }

            for (int i = 1; i < h; i++) {
                for (int j = 1; j < w; j++) {
                    // 1マスずつ見る
                    if (list[i][j] == 1) {
                        for (int k = 0; k < 4; k++) {
                            if (list[i + tate[k]][j + yoko[k]] == 1) {
                                connect(i * w + j, (i + tate[k]) * w + j + yoko[k], parent);
                            }
                        }
                    }
                }
            }

            int ans = 0;
            for (int i = 0; i < w * h; i++) {
                if (parent[i] < 0) {
                    ans++;
                }
            }

            System.out.println(ans);

        }

    }

    // 親の番号を返す
    private static int root(int n, int[] parent) {
        if (parent[n] < 0) {
            return n;
        } else {
            return root(parent[n], parent);
        }
    }

    private static int size(int n, int[] parent) {
        return -parent[root(n, parent)];
    }

    private static boolean connect(int a, int b, int[] parent) {
        a = root(a, parent);
        b = root(b, parent);

        if (a == b) // 元々同じ仲間なら
            return false;

        if (size(a, parent) < size(b, parent)) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        parent[a] += parent[b];
        parent[b] = a;

        return true;
    }
}
