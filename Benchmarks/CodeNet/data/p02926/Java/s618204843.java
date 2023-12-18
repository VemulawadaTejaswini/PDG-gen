import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static class Vector implements Comparable<Vector> {
        long x, y;
        double length, angle;

        public Vector(long x, long y) {
            this.x = x;
            this.y = y;
            length = Math.sqrt(x * x + y * y);
            if (x == 0 && y == 0) angle = 0;
            else if (x == 0) angle = y > 0 ? Math.PI / 2 : (3 * Math.PI) / 2;
            else if (y == 0) angle = x > 0 ? 0 : Math.PI;
            else if (x > 0 && y > 0) angle = Math.acos(x / length);
            else if (x < 0 && y > 0) angle = Math.PI / 2 + Math.asin(-x / length);
            else if (x < 0 && y < 0) angle = Math.PI + Math.acos(-x / length);
            else if (x > 0 && y < 0) angle = (3 * Math.PI) / 2 + Math.asin(x / length);
        }

        @Override
        public int compareTo(Vector other) {
            if (this.angle < other.angle) return -1;
            if (this.angle > other.angle) return 1;
            return 0;
        }

        @Override
        public String toString() {
            return "Vector{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Vector[] vectors = new Vector[N];

        for (int i = 0 ; i < N; i++) {
            vectors[i] = new Vector(sc.nextLong(), sc.nextLong());
        }

        Arrays.sort(vectors);

        double best = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i; j < i + N; j++) {
                long x = 0;
                long y = 0;
                for (int k = i; k <= j; k++) {
                    x += vectors[k % N].x;
                    y += vectors[k % N].y;
                }
                best = Math.max(Math.sqrt(x * x + y * y), best);
            }
        }

        System.out.println(best);
    }
}
