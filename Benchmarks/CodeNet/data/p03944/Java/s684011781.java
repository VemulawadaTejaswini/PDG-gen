import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

//    private static final String ex = "5 4 2\n" +
//            "2 1 1\n" +
//            "3 3 4";
//    private static final String ex = "5 4 3\n" +
//            "2 1 1\n" +
//            "3 3 4\n" +
//            "1 4 2";
    private static final String ex = "10 10 5\n" +
        "1 6 1\n" +
        "4 1 3\n" +
        "6 9 4\n" +
        "9 4 2\n" +
        "3 1 3";

    private static void solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");

        int W = Integer.parseInt(split[0]);
        int H = Integer.parseInt(split[1]);
        int N = Integer.parseInt(split[2]);

        int xMin = 0;
        int yMin = 0;
        int xMax = W;
        int yMax = H;

        for (int i = 0; i < N; i ++) {
            split = scanner.nextLine().split(" ");

            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);
            int a = Integer.parseInt(split[2]);

            if (a == 1) {
                xMin = x;
            } else if (a == 2) {
                xMax = x;
            } else if (a == 3) {
                yMin = y;
            } else if (a == 4) {
                yMax = y;
            }
        }

        int result;
        if (xMax - xMin < 0 || yMax - yMin < 0) result = 0;
        else result = (xMax - xMin) * (yMax - yMin);
        System.out.println(result);
    }
}
