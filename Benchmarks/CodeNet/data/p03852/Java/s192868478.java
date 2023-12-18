import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static char[] VOWELS = {'a', 'i', 'u', 'e', 'o'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        scanner.close();

        if (Arrays.asList(VOWELS).contains(c)) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
