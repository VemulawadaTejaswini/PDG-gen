import java.util.*;
import java.util.function.ToDoubleFunction;


public class Main {
    private static final String ex = "3 4";

    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static void solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");

        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        System.out.println((N - 1) * (M - 1));
    }
}
