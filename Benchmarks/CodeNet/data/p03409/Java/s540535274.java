import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        ArrayList<Point> bluePoints = new ArrayList<>();
        ArrayList<Point> redPoints = new ArrayList<>();
        HashMap<Point, ArrayList<Point>> candidates = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            redPoints.add(new Point(y,x));
        }

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            bluePoints.add(new Point(y,x));
        }

        for (Point redPoint : redPoints) {
            int xinRed = redPoint.x;
            int yinRed = redPoint.y;

            ArrayList<Point> blueCandidates = new ArrayList<>();

            for (Point bluePoint : bluePoints) {
                int xinBlue = bluePoint.x;
                int yinBlue = bluePoint.y;
                if (xinRed < xinBlue && yinRed < yinBlue) {
                    blueCandidates.add(bluePoint);
                }
                candidates.put(redPoint, blueCandidates);
            }
        }

        Map<Point, ArrayList<Point>> sorted = candidates.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingInt(ArrayList::size)))
                .collect(Collectors
                        .toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (a, b) -> { throw new AssertionError(); },
                                LinkedHashMap::new));

        int count = 0;

        for (Map.Entry<Point, ArrayList<Point>> entry : sorted.entrySet()) {
            //System.out.println(String.format("redPoint: %s, bluePoints: %s", entry.getKey(), entry.getValue()));
            List<Point> blues = entry.getValue();

            for (Point blue : blues) {
                if (bluePoints.contains(blue)) {
                    count++;
                    bluePoints.remove(blue);
                    break;
                }
            }
        }
        System.out.println(count);
    }

    static class Point {
        int x, y;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point pair = (Point) o;
            return x == pair.x &&
                    y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}