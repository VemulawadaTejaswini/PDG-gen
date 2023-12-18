import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        List<Long> list = IntStream.range(0, 3 * n).mapToObj(i -> scanner.nextLong()).collect(Collectors.toList());
        Collections.sort(list);
        System.out.println(list.subList(n, 2 * n).stream().mapToLong(Long::longValue).sum());
    }
}