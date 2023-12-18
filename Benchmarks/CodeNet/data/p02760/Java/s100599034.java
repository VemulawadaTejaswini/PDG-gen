import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    final BigInteger mod = BigInteger.valueOf(1000000007L);

    public static boolean bingo(int[][] grid) {
        for (int i = 0; i < 3; i++) {
            boolean row = true;
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] != 0) {
                    row = false;
                    break;
                }
            }

            if (row) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            boolean row = true;
            for (int i = 0; i < 3; i++) {
                if (grid[i][j] != 0) {
                    row = false;
                    break;
                }
            }

            if (row) {
                return true;
            }
        }

        boolean d = true;
        for (int i = 0; i < 3; i++) {
            if (grid[i][i] != 0) {
                d = false;
                break;
            }
        }
        if (d) {
            return true;
        }

        d = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                if (grid[i][j] != 0) {
                    d = false;
                    break;
                }
            }
        }
        if (d) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];
        Map<Integer, Pair> idx = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sc.nextInt();
                idx.put(grid[i][j], new Pair(i, j));
            }
        }
        int n = sc.nextInt();
        int[] bs = new int[n];

        for (int i = 0; i < n; i++) {
            bs[i] = sc.nextInt();
            if (idx.containsKey(bs[i])) {
                Pair p = idx.get(bs[i]);

                grid[p.a][p.b] = 0;
            }
        }

        if (bingo(grid)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static class Pair {
        public int a;
        public int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}