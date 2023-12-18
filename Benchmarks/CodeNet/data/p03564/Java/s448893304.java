import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

//    private static final String ex = "4\n" +
//        "3";
    private static final String ex = "10\n" +
        "10";
}

class Solver {
    void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        int K = Integer.parseInt(scanner.nextLine());

        System.out.println(min(1, N, K));
    }

    private long min(int cur, int N, int K) {
        if (N == 0) return cur;

        long A = min(cur * 2, N - 1, K);
        long B = min(cur + K, N - 1, K);

        return Math.min(A, B);
    }

    private int[] splitInt(String s) {
        String[] split = s.split(" ");
        int[] splitInt = new int[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        return splitInt;
    }

    private long[] splitLong(String s) {
        String[] split = s.split(" ");
        long[] splitLong = new long[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitLong[i] = Long.parseLong(split[i]);
        }
        return splitLong;
    }
}
