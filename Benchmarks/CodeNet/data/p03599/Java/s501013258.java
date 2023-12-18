import java.util.*;

public class Main {
    private static final String ex = "17 19 22 26 55 2802";
//    private static final String ex = "2\n" +
//            "9\n" +
//            "3 6";
//    private static final String ex = "5\n" +
//            "20\n" +
//            "11 12 9 17 12";

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
//        System.out.println(solve(new Scanner(ex)));
    }

    private static String solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int C = Integer.parseInt(split[2]);
        int D = Integer.parseInt(split[3]);
        int E = Integer.parseInt(split[4]);
        int F = Integer.parseInt(split[5]);

        Set<Integer> X = new HashSet<>();
        Set<Integer> Y = new HashSet<>();

        for (int i = 0; i <= F / (100 * A); i ++) {
            int sum = i * A * 100;
            int j = 0;
            while (sum <= F) {
                X.add(sum);
                sum += j * B * 100;
                j ++;
            }
        }

        for (int i = 0; i <= F / C; i ++) {
            int sum = i * C;
            int j = 0;
            while (sum <= F) {
                Y.add(sum);
                sum += j * D;
                j ++;
            }
        }

        double max = 0;
        int maxXY = 0;
        int maxY = 0;
        for (Integer x: X) {
            for (Integer y: Y) {
                double m = (double) y / (double) (x + y);

                if (x == 0 || m > (double) E / (double) (x + E) || x + y > F) {
                    continue;
                }

                if (max < m) {
                    max = m;
                    maxXY = x + y;
                    maxY = y;
                }
            }
        }

        return maxXY + " " + maxY;
    }
}
