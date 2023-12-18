import java.util.Scanner;

class Solver {
    void solve(Scanner in) {
        int N = in.nextInt();
        double x1 = 0, y1 = 0;
        double x2 = 0, y2 = 0;
        double x3 = 0, y3 = 0;
        double x4 = 0, y4 = 0;
        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (x >= 0 && y >= 0) {
                x1 += x;
                y1 += y;
            }
            if (x <= 0 && y >= 0) {
                x2 += x;
                y2 += y;
            }
            if (x <= 0 && y <= 0) {
                x3 += x;
                y3 += y;
            }
            if (x >= 0 && y <= 0) {
                x4 += x;
                y4 += y;
            }
        }
        System.out.println(Math.sqrt(Math.max(x1 * x1 + y1 * y1, Math.max(x2 * x2 + y2 * y2, Math.max(x3 * x3 + y3 * y3, x4 * x4 + y4 * y4)))));
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}