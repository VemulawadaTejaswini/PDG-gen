import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), p = scanner.nextInt();
        System.out.println(IntStream.range(0, n).allMatch(i -> scanner.nextInt() == 0) ? (p == 1 ? 0 : 1L << n) : 1L << --n);
    }
}