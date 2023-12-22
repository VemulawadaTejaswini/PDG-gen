import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
//            while (true)
                solve(in);
        }
    }

    private static void solve(Scanner in) {
        int n = in.nextInt();
        int[] R = new int[n];
        for (int i = 0; i < n; i++) {
            R[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int diff = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (diff < R[i] - min) {
                diff = R[i] - min;
            }
            if (min > R[i]) {
                min = R[i];
            }
        }
        System.out.println(diff);
    }
}