import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = IntStream.range(0, 3 * n).map(i -> scanner.nextInt()).sorted().skip(n).toArray();
        System.out.println(IntStream.range(0, n).mapToLong(i -> a[i * 2]).sum());
    }
}