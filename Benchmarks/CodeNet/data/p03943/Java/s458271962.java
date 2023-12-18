import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    static void solve(Scanner in) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] can = { a, b, c };

        Arrays.sort(can);
        int max = can[2];
        int sum = can[0] + can[1];
        if (max == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}