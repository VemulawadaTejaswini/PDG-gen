import java.awt.*;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), ans = 0;
        Point[] red = IntStream.range(0, n)
                .mapToObj(i -> new Point(scanner.nextInt(), scanner.nextInt()))
                .sorted(Comparator.comparingInt((Point p) -> p.y).reversed())
                .toArray(Point[]::new);
        Point[] blue = IntStream.range(0, n)
                .mapToObj(i -> new Point(scanner.nextInt(), scanner.nextInt()))
                .sorted(Comparator.comparingInt(p -> p.x))
                .toArray(Point[]::new);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (red[j] != null && blue[i].y > red[j].y && blue[i].x > red[j].x) {
                    ans++;
                    red[j] = null;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}