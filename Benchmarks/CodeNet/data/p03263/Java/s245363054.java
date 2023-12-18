
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int h = scanner.nextInt();
        final int w = scanner.nextInt();
        final int[][] table = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        final List<Integer> points = new ArrayList<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (table[i][j] % 2 == 0) {
                    int counter = 0;
                    if (isOdd(i - 1, j, table, h, w)) counter++;
                    if (isOdd(i, j - 1, table, h, w)) counter++;
                    if (isOdd(i, j + 1, table, h, w)) counter++;
                    if (isOdd(i + 1, j, table, h, w)) counter++;

                    if (counter % 2 == 0) {
                        if (isOdd(i - 1, j, table, h, w)) {
                            table[i][j]++;
                            table[i - 1][j]--;
                            points.add(i - 1);
                            points.add(j);
                            points.add(i);
                            points.add(j);
                        }

                        if (isOdd(i, j - 1, table, h, w)) {
                            table[i][j]++;
                            table[i][j - 1]--;
                            points.add(i);
                            points.add(j - 1);
                            points.add(i);
                            points.add(j);
                        }

                        if (isOdd(i, j + 1, table, h, w)) {
                            table[i][j]++;
                            table[i][j + 1]--;
                            points.add(i);
                            points.add(j + 1);
                            points.add(i);
                            points.add(j);
                        }

                        if (isOdd(i + 1, j, table, h, w)) {
                            table[i][j]++;
                            table[i + 1][j]--;
                            points.add(i + 1);
                            points.add(j);
                            points.add(i);
                            points.add(j);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (table[i][j] % 2 == 1) {
                    int counter = 0;
                    if (isOdd(i - 1, j, table, h, w)) counter++;
                    if (isOdd(i, j - 1, table, h, w)) counter++;
                    if (isOdd(i, j + 1, table, h, w)) counter++;
                    if (isOdd(i + 1, j, table, h, w)) counter++;

                    if (counter % 2 == 1) {
                        if (isOdd(i - 1, j, table, h, w)) {
                            table[i][j]++;
                            table[i - 1][j]--;
                            points.add(i - 1);
                            points.add(j);
                            points.add(i);
                            points.add(j);
                        }

                        if (isOdd(i, j - 1, table, h, w)) {
                            table[i][j]++;
                            table[i][j - 1]--;
                            points.add(i);
                            points.add(j - 1);
                            points.add(i);
                            points.add(j);
                        }

                        if (isOdd(i, j + 1, table, h, w)) {
                            table[i][j]++;
                            table[i][j + 1]--;
                            points.add(i);
                            points.add(j + 1);
                            points.add(i);
                            points.add(j);
                        }

                        if (isOdd(i + 1, j, table, h, w)) {
                            table[i][j]++;
                            table[i + 1][j]--;
                            points.add(i + 1);
                            points.add(j);
                            points.add(i);
                            points.add(j);
                        }
                    }
                }
            }
        }

        System.out.println(points.size() / 4);
        for (int i = 0; i < points.size(); i++) {
            System.out.print(points.get(i) + 1);
            if (i % 4 == 3) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }

    private static boolean isOdd(final int y, final int x, final int[][] table, final int yLength, final int xLength) {
        if (y < 0 || y >= yLength || x < 0 || x >= xLength) {
            return false;
        }

        return table[y][x] % 2 == 1;
    }
}
