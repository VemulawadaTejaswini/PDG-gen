import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String ex = "19\n" +
        "100";

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));

//        System.out.println(solve(new Scanner(ex)));
    }

    private static int solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        int A = Integer.parseInt(scanner.nextLine());

        return N * N - A;
    }
}
