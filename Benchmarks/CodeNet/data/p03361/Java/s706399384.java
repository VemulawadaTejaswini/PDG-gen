import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int H = 0;
    private static int W = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        H = Integer.parseInt(scanner.next());
        W = Integer.parseInt(scanner.next());
        scanner.nextLine();

        boolean[][] searchedField = new boolean[H][W];
        char[][] field = new char[H][W];
        for (int i = 0; i < H; i++) {
            char[] tmp = scanner.nextLine().toCharArray();
            field[i] = tmp;
        }
        scanner.close();

        for (boolean[] f : searchedField) {
            Arrays.fill(f, false);
        }

        for (int y = 0; y < H; y++) {
            for (int x = 0; x < W; x++) {
                char[][] f = deepCopy(field);
                boolean[][] s = deepCopy(searchedField);

                // 埋めてみる
                if (f[y][x] == '#') {
                    f[y][x] = 'o';
                }

                // 探索
                dfs(f, s, x, y);

                // 探索済みの数と比較
                if (countSearchedArea(s) == countArea(f)) {
                    System.out.println("Yes");
                    return;
                }

//                print(f, s);
//                System.out.println("------------------------");
            }
        }
        System.out.println("No");
    }

    private static void dfs(char[][] field, boolean[][] searchedField, int x, int y) {
        if (x < 0 || x >= W || y < 0 || y >= H) return;
        if (field[y][x] == '#') return;
        if (searchedField[y][x]) return;
        searchedField[y][x] = true;

        dfs(field, searchedField, x + 1, y); // 右
        dfs(field, searchedField, x - 1, y); // 左
        dfs(field, searchedField, x, y - 1); // 下
        dfs(field, searchedField, x, y + 1); // 上
    }


    private static boolean[][] deepCopy(boolean[][] original) {
        if (original == null) {
            return null;
        }

        final boolean[][] result = new boolean[original.length][];
        for (int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    private static char[][] deepCopy(char[][] original) {
        if (original == null) {
            return null;
        }

        final char[][] result = new char[original.length][];
        for (int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }

    private static int countArea(char[][] field) {
        int count = 0;
        for (char[] a : field) {
            for (char c : a) {
                if (c == 'o') count++;
            }
        }
        return count;
    }

    private static int countSearchedArea(boolean[][] field) {
        int count = 0;
        for (boolean[] a : field) {
            for (boolean c : a) {
                if (c) count++;
            }
        }
        return count;
    }

    private static void print(char[][] field, boolean[][] searchedField) {
        for (char[] a : field) {
            for (char c : a) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }
}
