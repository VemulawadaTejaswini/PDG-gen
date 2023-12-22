import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static int n, m;
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        while ((n = scanner.nextInt()) != 0) {
            m = scanner.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            IntStream.range(0, n)
                .map(d -> scanner.nextInt())
                .forEach(d -> map.put(d, Math.max(map.getOrDefault(d, 0), scanner.nextInt())));
            System.out.println(map.values().stream().mapToInt(i -> i).sum());
        }
    }
}

