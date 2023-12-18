import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] sortedInput = Stream.of(new Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int result = IntStream.rangeClosed(1,2).map(i -> {
            return sortedInput[i] - sortedInput[i-1];
        }).sum();
        System.out.println(result);
    }
}