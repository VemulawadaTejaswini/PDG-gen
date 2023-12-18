import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Iterator<String> stringIterator = br.lines().iterator();
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() throws IOException {
        if(inputs.isEmpty()){
            if(!stringIterator.hasNext()) throw new IOException();
            inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));
        }
    }

    Integer parseInt() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Integer.parseInt(inputs.pollFirst());
        }
        throw new IOException();
    }

    Double parseDouble() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Double.parseDouble(inputs.pollFirst());
        }
        throw new IOException();
    }

    String parseString() throws IOException {
        fill();
        return inputs.pollFirst();
    }

}

public class Main {

    static class Point implements Comparable<Point> {
        int x;
        int y;
        int idx;

        public Point(int x, int y, int idx){
            this.x = x;
            this.y = y;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point o) {
            if(y != o.y){
                return Integer.compare(y, o.y);
            }
            return Integer.compare(x, o.x);
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof Point)){
                return false;
            }

            Point o = (Point)obj;

            return x == o.x && y == o.y && idx == o.idx;
        }
    }

    public static void main(String[] args) throws IOException {

        Parser parser = new Parser();
        int R = parser.parseInt();
        int C = parser.parseInt();
        int N = parser.parseInt();

        List<Point> externalPoints = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int sx = parser.parseInt();
            int sy = parser.parseInt();
            int ex = parser.parseInt();
            int ey = parser.parseInt();

            if((sx != 0 && sx != C) && (sy != 0 && sy != R)) continue;
            if((ex != 0 && ex != C) && (ey != 0 && ey != R)) continue;

            externalPoints.add(new Point(sx, sy, i));
            externalPoints.add(new Point(ex, ey, i));
        }

        Stream<Point> pointStream = Stream.of(externalPoints.stream()
                .filter(p -> p.y == 0)
                .sorted(),
                externalPoints.stream()
                .filter(p -> p.x == C)
                .sorted(),
                externalPoints.stream()
                .filter(p -> p.y == R)
                .sorted(Comparator.reverseOrder()),
                externalPoints.stream()
                .filter(p -> p.x == 0)
                .sorted(Comparator.reverseOrder())).flatMap(i -> i);

        List<Point> sortedExternalPoints = pointStream.distinct().collect(Collectors.toList());

        Stack<Point> pointStack = new Stack<>();
        for(Point p : sortedExternalPoints){
            if(pointStack.isEmpty() || pointStack.peek().idx != p.idx){
                pointStack.push(p);
            }else pointStack.pop();
        }

        if(pointStack.empty()){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}