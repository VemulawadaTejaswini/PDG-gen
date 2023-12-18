import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final String originalString = SCANNER.nextLine();
        int countOperations = SCANNER.nextInt();

        char[] characters = originalString.toCharArray();

        for (int indexLetter = 0; indexLetter < characters.length; ++indexLetter) {
            char letter = characters[indexLetter];
            if (indexLetter != characters.length - 1) {
                int requiredOperations = letter == 'a' ? 0 : 'z' - letter + 1;
                if (requiredOperations <= countOperations) {
                    characters[indexLetter] = push(letter, requiredOperations);
                    countOperations -= requiredOperations;
                }
            } else {
                characters[indexLetter] = push(letter, countOperations);
            }
        }
        System.out.println(String.valueOf(characters));
    }

    private static char push(char letter, int countOperations) {
        letter += countOperations % 26;
        return letter > 'z' ? (char) ('a' + letter - 'z' - 1) : letter;
    }
}
