import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static final List<IntegralRectangle> RECTANGLES;

    static {
        RECTANGLES = new ArrayList<>();
        Main main = new Main();
        for(int y = 1; y < 150; y++) {
            for(int x = -~y; x < 150; x++) {
                RECTANGLES.add(main.new IntegralRectangle(y, x));
            }
        }
        Collections.sort(RECTANGLES);
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        int height;
        int width;
        while((height = scn.nextInt()) > 0 | (width = scn.nextInt()) > 0) {
            IntegralRectangle base = new IntegralRectangle(height, width);
            for(IntegralRectangle rectangle : RECTANGLES) {
                if(base.compareTo(rectangle) < 0) {
                    System.out.println(rectangle);
                    break;
                }
            }
        }
    }

    class IntegralRectangle implements Comparable<IntegralRectangle> {
        int height;
        int width;

        public IntegralRectangle(int height, int width) {
            this.height = height;
            this.width  = width;
        }

        private int squareDiagonal() {
            return height * height + width * width;
        }

        @Override
        public int compareTo(IntegralRectangle another) {
            if(this.squareDiagonal() > another.squareDiagonal()) {
                return 1;
            } else if(this.squareDiagonal() < another.squareDiagonal()) {
                return -1;
            } else {
                if(this.height != another.height) {
                    return this.height > another.height ? 1 : -1;
                } else {
                    return 0;
                }
            }
        }

        @Override
        public String toString() {
            return height + " " + width;
        }
    }
}