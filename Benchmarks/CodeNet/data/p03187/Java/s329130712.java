import java.util.ArrayList;
import java.util.List;

/**
 * Burning trees.
 */
public class Main {

    public static class Tree {
        int coord;
        boolean burned;

        Tree(int coord) {
            this.coord = coord;
            this.burned = false;
        }
    }

    private int N, L;
    private List<Tree> trees;
    private int maxPath = 0;
    private String direction;
    private int maxPrefix;

    void solve(InputReader in) {

        L = in.nextInt();
        N = in.nextInt();

        trees = new ArrayList<>(N);
        for (int i = 0; i < N; ++i) {
            int coord = in.nextInt();
            trees.add(new Tree(coord));
        }


        checkCCW();
        checkCW();

        System.out.println(maxPath);
//        System.out.println("Direction: " + direction);
//        System.out.println("Prefix: " + maxPrefix);
    }

    private void checkCW() {
        // Number of one directional nodes to test
        for (int j = N; j >= 1; --j) {
            int left = 0;
            int right = j - 1;

            int curPath = L - trees.get(right).coord;

            // Get zigzagging pattern

            int count = 0;
            while (left < right) {
                curPath += trees.get(left).coord + L - trees.get(right).coord;
                if ((count++ & 1) == 1) {
                    left++;
                } else {
                    right--;
                }
            }

            if (maxPath < curPath) {
                direction = "Clockwise";
                maxPrefix = j;
                maxPath = curPath;
            }
        }
    }

    private void checkCCW() {

        // Number of one directional nodes to test
        for (int j = 1; j < N; ++j) {
            int left = j - 1;
            int right  = N - 1;

            int curPath = trees.get(left).coord;

            // Get zigzagging pattern

            int count = 0;
            while (left < right) {
                curPath += trees.get(left).coord + L - trees.get(right).coord;
                if ((count++ & 1) == 1) {
                    right--;
                } else {
                    left++;
                }
            }

            if (maxPath < curPath) {
                direction = "CounterClockwise";
                maxPrefix = j;
                maxPath = curPath;
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
//        InputReader reader = new InputReader(new FileInputStream("in.txt"));
        InputReader reader = new InputReader(System.in);
        Main m = new Main();
        m.solve(reader);
        reader.close();
    }
}
