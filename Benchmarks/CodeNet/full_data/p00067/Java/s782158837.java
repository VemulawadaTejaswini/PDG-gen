import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int[][] map = new int[12][12];
            for (int i = 0; i < 12; i++) {
                char[] line = scanner.next().toCharArray();
                for (int j = 0; j < 12; j++) {
                    map[i][j] = line[j] - '0';
                }
            }
            int[][] colors = new int[12][12];
            int color = 1;
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    if (map[i][j] == 1) {
                        if ((i > 0 && map[i - 1][j] == 1) && (j > 0 && map[i][j - 1] == 1)) {
                            colors[i][j] = Math.min(colors[i - 1][j], colors[i][j - 1]);
                        } else if (i > 0 && map[i - 1][j] == 1) {
                            colors[i][j] = colors[i - 1][j];
                        } else if (j > 0 && map[i][j - 1] == 1) {
                            colors[i][j] = colors[i][j - 1];
                        } else {
                            colors[i][j] = color++;
                        }
                    }
                }
            }
            for (int i = 11; i >= 0; i--) {
                for (int j = 11; j >= 0; j--) {
                    if (map[i][j] == 1) {
                        if (j < 11 && map[i][j + 1] == 1) {
                            colors[i][j] = colors[i][j + 1];
                        } 
                    }
                }
            }
            Set<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    if (map[i][j] == 1) {
                        set.add(colors[i][j]);
                    }
                }
            }
            System.out.println(set.size());
        }
    }

    public static void main(String... args) {
        solve();
    }
}