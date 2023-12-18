import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int a, b;
        try (Scanner cin = new Scanner(System.in)) {
            a = cin.nextInt();
            b = cin.nextInt();
        }
        System.out.println(IntStream.of(a + b, a - b, a * b).max().orElse(0));
    }
}
