import java.util.stream.Collectors;

public class Main {

    public static void main(String... args) throws Exception {
        var inputText = AtCoderReader.readInputText();
        var inputLines = inputText.lines().collect(Collectors.toList());
        var d = Long.parseLong(inputLines.get(0).split(" ")[1]);
        var pointList = inputLines.subList(1, inputLines.size()).parallelStream().map(t -> t.split(" "))
                .map(a -> new Point(Integer.parseInt(a[0]), Integer.parseInt(a[1]))).collect(Collectors.toList());
        long squaredDistance = d * d;
        var count = pointList.parallelStream().filter(p -> p.squaredDistanceFromOrigin() <= squaredDistance).count();
        System.out.println(count);
    }

    public static class Point {
        private final long x;
        private final long y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public long squaredDistanceFromOrigin() {
            return x * x + y * y;
        }
    }

    public static class AtCoderReader {
        public static String readInputText() {
            try (var input = System.in) {
                return new String(System.in.readAllBytes()).trim();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}