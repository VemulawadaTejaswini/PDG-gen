import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        Set<Point> blacks = new HashSet<>();
        for (int i = 0; i < N; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            blacks.add(new Point(a, b));
        }

        System.out.println(solve(H, W, blacks));

        sc.close();
    }

    static String solve(int H, int W, Set<Point> blacks) {
        Set<Point> centers = new HashSet<>();
        for (Point black : blacks) {
            for (int dr = -1; dr <= 1; ++dr) {
                for (int dc = -1; dc <= 1; ++dc) {
                    int centerR = black.r + dr;
                    int centerC = black.c + dc;

                    if (centerR >= 2 && centerR <= H - 1 && centerC >= 2 && centerC <= W - 1) {
                        centers.add(new Point(centerR, centerC));
                    }
                }
            }
        }

        long[] result = new long[10];
        for (Point center : centers) {
            int count = 0;
            for (int dr = -1; dr <= 1; ++dr) {
                for (int dc = -1; dc <= 1; ++dc) {
                    int r = center.r + dr;
                    int c = center.c + dc;
                    if (blacks.contains(new Point(r, c))) {
                        ++count;
                    }
                }
            }

            ++result[count];
        }

        result[0] = (H - 2L) * (W - 2) - Arrays.stream(result).sum();

        return Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining("\n"));
    }
}

class Point {
    int r;
    int c;

    Point(int r, int c) {
        this.r = r;
        this.c = c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, c);
    }

    @Override
    public boolean equals(Object obj) {
        Point other = (Point) obj;

        return r == other.r && c == other.c;
    }
}