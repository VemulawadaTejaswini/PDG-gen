import java.util.Scanner;

public class Main {
    public static int islandsNum;
    public static int maxWidth;
    public static int maxHeight;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            // ???width
            maxWidth = sc.nextInt();
            // ??????height
            maxHeight = sc.nextInt();
            if (maxWidth == 0 && maxHeight == 0)
                break;

            int[][] map = scanMap(maxWidth, maxHeight, sc);

            islandsNum = 0;
            countIslands(map);
            System.out.println(islandsNum);
        }
        sc.close();
    }

    // ??°???????????????????´?????????¢??°
    public static int[][] scanMap(int w, int h, Scanner sc) {
        int[][] returnMap = new int[h][w];
        for (int i = 0; i < returnMap.length; i++) {
            for (int j = 0; j < returnMap[i].length; j++) {
                returnMap[i][j] = sc.nextInt();
            }
        }
        return returnMap;
    }

    // ??°????????¶(?????????????´????1)?????????????????¢?´¢
    public static void countIslands(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 1) {
                    islandsNum++;
                    deleteIsland(map, i, j);
                }
            }
        }
    }

    public static void deleteIsland(int[][] map, int h, int w) {
        // ??¢?´¢??????8??????????¨????
        int[] x = { -1, -1, -1, 0, 1, 1, 1, 0 };
        int[] y = { -1, 0, 1, 1, 1, 0, -1, -1 };

        // countIslands??§?????????????????£???????´????0?????????
        map[h][w] = 0;

        for (int i = 0; i < 8; i++) {
            boolean boundCheckFlag = (0 <= h + x[i] && h + x[i] < maxHeight
                    && 0 <= w + y[i] && w + y[i] < maxWidth);
            if (boundCheckFlag && map[h + x[i]][w + y[i]] == 1) {
                deleteIsland(map, h + x[i], w + y[i]);
            }
        }

    }

    // ??°????????¨???????????¢??°
    // public static void showMap(int[][] map) {
    // for (int i = 0; i < map.length; i++) {
    // for (int j = 0; j < map[i].length; j++) {
    // System.out.print(map[i][j] + " ");
    // }
    // System.out.println();
    // }
    // }
}