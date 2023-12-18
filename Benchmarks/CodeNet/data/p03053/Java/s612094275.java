import java.util.*;

class Main {

    final static int vi[] = { -1,  0, 1, 0 };
    final static int vj[] = {  0, -1, 0, 1 };

    static class Tuple {
        int d, i, j;
        Tuple(int d, int i, int j) {
            this.d = d;
            this.i = i;
            this.j = j;
        }
    };

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        String[] A = new String[H];
        for (int i = 0; i < H; i++) {
            A[i] = scanner.next();
        }

        System.out.println(solve(H, W, A));
    }

    public static int solve(int H, int W, String[] A) {
        Queue<Tuple> worklist = new LinkedList<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (A[i].charAt(j) == '#') {
                    worklist.add(new Tuple(0, i, j));
                }
            }
        }

        int[][] table = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                table[i][j] = -1;
            }
        }

        int m = 0;
        while (! worklist.isEmpty()) {
            Tuple t = worklist.remove();
            int d = t.d;
            int i = t.i;
            int j = t.j;
            if (table[i][j] < 0) {
                table[i][j] = t.d;
                if (m < d) {
                    m = d;
                }
                for (int k = 0; k < 4; k++) {
                    if (0 <= i + vi[k] && i + vi[k] < H &&
                        0 <= j + vj[k] && j + vj[k] < W)
                    {
                        worklist.add(new Tuple(d + 1, i + vi[k], j + vj[k]));
                    }
                }
            }
        }

        return m;
    }

}
