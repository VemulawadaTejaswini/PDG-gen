import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int count = std.nextInt();

        int result = (int)((count - 1) * count / 2.0);

        System.out.println(result);
    }
}