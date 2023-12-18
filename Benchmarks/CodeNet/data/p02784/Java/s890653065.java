import java.util.*;
import java.lang.*;

// 10 3
// 4 5 6
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(inputStr(sc, " "), inputStr(sc, " ")) ? "Yes" : "No");
    }

    private static String[] inputStr(Scanner sc, String... delimiter) {
        return sc.nextLine().split(delimiter == null ? " " : delimiter[0]);
    }

    private static boolean solve(String[]... inputs) {
        int h = Integer.parseInt(inputs[0][0]);
        return h <= Arrays.stream(inputs[1]).reduce(0, (sum, e) -> sum += Integer.parseInt(e),
                (sum1, sum2) -> sum1 + sum2);

    }
}
