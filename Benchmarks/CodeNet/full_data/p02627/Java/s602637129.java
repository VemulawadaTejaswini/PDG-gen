
import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String lower = input.toLowerCase();

        System.out.println( ( lower.equals(input) ) ? 'a': 'A');
    }
}