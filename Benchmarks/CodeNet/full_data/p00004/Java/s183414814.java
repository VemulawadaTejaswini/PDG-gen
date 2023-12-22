import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        while (in.hasNext()) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), e = in.nextInt(),
                    f = in.nextInt();
            double x, y;
            x = (double) (c * e - b * f) / (double) (a * e - b * d);
            y = (double) (c - (a * x)) / (double) (b);

            System.out.println(String.format("%.3f", x + 0.0) + " " + String.format("%.3f", y + 0.0));
        }
    }
}