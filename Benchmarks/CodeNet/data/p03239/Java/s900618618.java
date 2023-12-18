import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static class Route {
        int c, t;

        Route(int c, int t) {
            this.c = c;
            this.t = t;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), t = scanner.nextInt();
        Route result = IntStream.range(0, n)
                .mapToObj(i -> new Route(scanner.nextInt(), scanner.nextInt()))
                .filter(route -> route.t <= t)
                .min(Comparator.comparingInt(route -> route.c))
                .orElse(null);
        System.out.println(result == null ? "TLE" : result.c);
    }
}