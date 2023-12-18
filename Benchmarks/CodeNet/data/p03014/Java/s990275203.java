import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

public class Dev {
    private static final Consumer<List<String>> consumer = solve();
    private static final File TESTCASE = new File("src/testcase.txt");
    private static Scanner SCANNER;

    static {
        try {
            System.out.println(System.getProperty("user.dir"));
            SCANNER = new Scanner(TESTCASE);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        readInput().forEach(consumer);
    }

    private static List<List<String>> readInput() {
        final List<List<String>> caseList = new ArrayList<>();
        List<String> lineList = new ArrayList<>();
        while (SCANNER.hasNextLine()) {
            final String line = SCANNER.nextLine();
            if (line.isEmpty()) {
                if (!lineList.isEmpty()) {
                    caseList.add(lineList);
                }
                lineList = new ArrayList<>();
            } else {
                lineList.add(line);
            }
        }
        if (!lineList.isEmpty()) {
            caseList.add(lineList);
        }
        return caseList;
    }

    private static Consumer<List<String>> solve() {
        return args -> {
            int H = Integer.valueOf(args.get(0).split(" ")[0]);
            int W = Integer.valueOf(args.get(0).split(" ")[1]);
            List<String> table = args.stream().skip(1).collect(toList());
            Point[] points = new Point[H * W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    boolean open = table.get(i).charAt(j) == '.';
                    points[W * i + j] = new Point(open);
                }
            }

            for (int i = 0; i < H; i++) {
                // left
                for (int j = 1; j < W; j++) {
                    if (table.get(i).charAt(j - 1) == '.') {
                        points[W * i + j].left = points[W * i + j - 1].left + 1;
                    }
                }
                // right
                for (int j = W - 2; j >= 0; j--) {
                    if (table.get(i).charAt(j + 1) == '.') {
                        points[W * i + j].right = points[W * i + j + 1].right + 1;
                    }
                }
            }

            for (int i = 0; i < W; i++) {
                // up
                for (int j = 1; j < H; j++) {
                    if (table.get(j - 1).charAt(i) == '.') {
                        points[W * j + i].up = points[W * (j - 1) + i].up + 1;
                    }
                }
                // down
                for (int j = H - 2; j >= 0; j--) {
                    if (table.get(j + 1).charAt(i) == '.') {
                        points[W * j + i].down = points[W * (j + 1) + i].down + 1;
                    }
                }
            }

            int ans = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    ans = Math.max(ans, points[H * i + j].score());
                }
            }

            System.out.println(ans);
        };
    }

    static class Point {
        boolean open;
        int left;
        int right;
        int up;
        int down;

        Point(boolean open) {
            left = 0;
            right = 0;
            up = 0;
            down = 0;
            this.open = open;
        }

        int score() {
            return open ? 0 : left + right + up + down + 1;
        }
    }

}
