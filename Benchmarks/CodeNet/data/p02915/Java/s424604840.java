import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int value = Integer.parseInt(std.nextLine());
        int result = IntStream.range(0, 3)
                .map(it -> value)
                .reduce((acc, b) -> acc * b).getAsInt();
        System.out.println(result);
    }
}
