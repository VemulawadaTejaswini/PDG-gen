import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        );

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase();

        int i = list.indexOf(input);
        System.out.println(list.get(i + 1));
    }
}