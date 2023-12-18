import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

//    private static final String ex = "5\n" +
//            "3 10\n" +
//            "48 17\n" +
//            "31 199\n" +
//            "231 23\n" +
//            "3 2";
//    private static final String ex = "4\n" +
//            "1 1\n" +
//            "1 1\n" +
//            "1 5\n" +
//            "1 100";
    private static final String ex = "3\n" +
            "2 3\n" +
            "1 1\n" +
            "3 2";

    private static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());

        String[] split = scanner.nextLine().split(" ");

        long T = Long.parseLong(split[0]);
        long A = Long.parseLong(split[1]);

        long total = T + A;
        long aTotal = A;
        long tTotal = T;

        for (int i = 1; i < N; i ++) {
            split = scanner.nextLine().split(" ");
            T = Long.parseLong(split[0]);
            A = Long.parseLong(split[1]);

            long aTotalTmp = A;
            long tTotalTmp = T;
            long totalTmp = A + T;
            while (total > totalTmp || aTotal > aTotalTmp || tTotal > tTotalTmp) {
                aTotalTmp += A;
                tTotalTmp += T;
                totalTmp = aTotalTmp + tTotalTmp;
            }

            total = totalTmp;
            aTotal = aTotalTmp;
            tTotal = tTotalTmp;
        }

        System.out.println(total);
    }
}

