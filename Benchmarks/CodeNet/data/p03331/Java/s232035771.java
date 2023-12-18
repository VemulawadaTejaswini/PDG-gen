
import java.util.stream.Stream;

public class Main {
    public static void main(final String[] args) {
        final java.util.Scanner scanner = new java.util.Scanner(System.in);
        final String line = scanner.nextLine();

        if (line.matches("10+")) {
            System.out.println("10");
        } else {
            final int sum = Stream.of(line.split("")).mapToInt(Integer::valueOf).sum();
            System.out.println(sum);
        }
    }
}