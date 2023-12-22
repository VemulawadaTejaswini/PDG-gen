import java.util.Scanner;

public class Main {
    public static int count(int x, int y, int S, int T, int[][] map) {
        int c = 0;
        for (int i = x; i < S+x; i++) {
            for (int j = y; j < T+y; j++) {
                c += map[j][i];
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, W, H, S, T, c;
        int[][] treeMap;

        while (true) {
            n = Integer.parseInt(sc.next());
            c = 0;
            if (n == 0)
                break;

            W = Integer.parseInt(sc.next());
            H = Integer.parseInt(sc.next());

            treeMap = new int[H][W];

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(sc.next());
                int y = Integer.parseInt(sc.next());
                treeMap[y-1][x-1] = 1;
            }
            S = Integer.parseInt(sc.next());
            T = Integer.parseInt(sc.next());

            int max = 0;
            for (int x = 0; x <= W-S; x++) {
                for (int y = 0; y <= H-T; y++) {
                    if (count(x, y, S, T, treeMap) > max)
//                        System.out.println(x + "," + y + " ");
                        max = count(x, y, S, T, treeMap);
                }
            }

//            System.out.println(Arrays.deepToString(treeMap));
            System.out.println(max);
        }
    }
}