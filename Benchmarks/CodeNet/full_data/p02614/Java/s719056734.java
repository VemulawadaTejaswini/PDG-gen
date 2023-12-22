import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            c[i] = sc.next().toCharArray();
        }
        sc.close();

        // 主処理
        int result = 0;

        List<List<Integer>> lineCombinationList = combinationList(h);
        List<List<Integer>> columnCombinationList = combinationList(w);

        for (List<Integer> lineList : lineCombinationList) {
            char[][] grid = cloneArray(c, h, w);
            for (int lineNum : lineList) {
                for (int i = 0; i < w; i++) {
                    grid[lineNum][i] = '.';
                }
            }
            for (List<Integer> columnList : columnCombinationList) {
                char[][] grid2 = cloneArray(grid, h, w);
                for (int columnNum : columnList) {
                    for (int i = 0; i < h; i++) {
                        grid2[i][columnNum] = '.';
                    }
                }
                if (countBlack(grid2) == k) {
                    result++;
                }
            }
        }

        // 出力
        System.out.println(result);

    }

    public static List<List<Integer>> combinationList(int n) {
        List<List<Integer>> combinationList = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((1 & i >> j) == 1) {
                    list.add(j);
                }
            }
            combinationList.add(list);
        }
        return combinationList;
    }

    public static int countBlack(char c[][]) {
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j] == '#') {
                    count++;
                }
            }
        }
        return count;
    }

    public static char[][] cloneArray(char[][] array, int h, int w) {
        char[][] grid = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                grid[i][j] = array[i][j];
            }
        }
        return grid;
    }
}
