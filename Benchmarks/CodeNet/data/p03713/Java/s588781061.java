import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Solver {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();

        if (a % 3 == 0 || b % 3 == 0) {
            out.println(0);
            return;
        }

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int x1 = (int) Math.round(a / 3.0);
        int x2 = a - x1;
        int y1 = (int) Math.round(b / 2.0);
        int y2 = b - y1;

        int[] s = {x1 * b, x2 * y1, x2 * y2};
        Arrays.sort(s);

        out.println(s[s.length - 1] - s[0]);
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        new Solver().solve(in, out);

        in.close();
        out.flush();
    }
}