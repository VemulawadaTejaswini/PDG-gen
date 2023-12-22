import java.util.*;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }

    // public static String[] <T> ToStringArray(T[] arr) {
    // String[] res = new String[arr.length];
    // for(int i = 0; i < arr.length; ++i) {
    // res[i] = String.valueOf(arr[i]);
    // }

    // return res;
    // }

    private static List<Integer> asIntergerList(int[] arr) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            intList.add(arr[i]);
        }

        return intList;
    }

    private static int[][] deepCopy(int[][] arr) {
        int[][] res = new int[arr.length][];
        for (int i = 0; i < arr.length; ++i) {
            res[i] = arr[i].clone();
        }

        return res;
    }

    private static String asString(int[][] arr) {
        String str = new String();

        for (int i = 0; i < 2; ++i) {
            str += "" + arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3];
        }

        return str;
    }

    private static int dfs(int y, int x, int[][] arr) {
        int[] dy = { -1, 1, 0, 0, 1, 1, -1, -1 };
        int[] dx = { 0, 0, 1, -1, 1, -1, 1, -1 };

        if (arr[y][x] == 0) {
            return 0;
        }

        arr[y][x] = 0;
        for (int i = 0; i < 8; ++i) {
            int py = y + dy[i], px = x + dx[i];

            if (py < 0 || py >= arr.length || px < 0 || px >= arr[0].length) {
                continue;
            }

            if (arr[py][px] == 1) {
                dfs(py, px, arr);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        while (true) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();

            if (w == 0 && h == 0) {
                return;
            }
            int[][] arr = new int[h][w];

            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    arr[i][j] = scanner.nextInt();
                }
            }

            int counter = 0;

            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    counter += dfs(i, j, arr);
                }
            }
            System.out.println(counter);
        }

    }

}

