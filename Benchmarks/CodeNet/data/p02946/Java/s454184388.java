import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int X = sc.nextInt();

        IntStream stones = IntStream.range(X - (K - 1), X + K);

        stones.forEach(stone -> System.out.print(stone + " "));
    }
}