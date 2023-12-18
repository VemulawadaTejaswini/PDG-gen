import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int[] t = IntStream.range(0, scanner.nextInt()).map(i -> scanner.nextInt() * 2).toArray(), s = IntStream.concat(IntStream.of(0), IntStream.concat(Arrays.stream(t).flatMap(i -> Collections.nCopies(i, scanner.nextInt() * 2).stream().mapToInt(Integer::intValue)), IntStream.of(0))).toArray();
        IntStream.rangeClosed(0, s.length - 2).peek(i -> s[i + 1] = Math.min(s[i + 1], s[i] + 1)).map(i -> s.length - 2 - i).forEach(i -> s[i] = Math.min(s[i], s[i + 1] + 1));
        System.out.println(IntStream.rangeClosed(0, s.length - 2).mapToDouble(i -> Math.min(s[i], s[i + 1]) + Integer.compare(s[i + 1], s[i]) / 2d).sum() / 4);
    }
}