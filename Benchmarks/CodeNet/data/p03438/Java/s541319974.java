import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        System.out.println((IntStream.range(0, n).map(i -> scanner.nextInt()).sum() - IntStream.range(0, n).map(i -> scanner.nextInt()).sum()) % 2 == -1 ? "Yes" : "No");
    }
}