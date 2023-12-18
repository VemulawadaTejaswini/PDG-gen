import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        System.out.println(IntStream.range(0, 3).map(i -> scanner.nextInt()).distinct().count());
    }
}