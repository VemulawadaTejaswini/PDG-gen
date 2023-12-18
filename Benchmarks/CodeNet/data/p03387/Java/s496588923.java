import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(solve(A, B, C));
    }

    private static int solve(int A, int B, int C) {
        int[] list = {A, B, C};
        Arrays.sort(list);
        int count = 0;

        count += (list[2] - list[1]) + (list[2] - list[0] - (list[2] - list[1]))/2;
        if ((list[2] - list[0] - (list[2] - list[1])) % 2 != 0) {
            count += 2;
        }

        return count;
    }
}