import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }

        for (int i = 1; i < n; i++) {
            if (words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                System.out.println("No");
                return;
            }
        }

        final HashSet<String> wordsSet = new HashSet<>(Arrays.asList(words));
        if (words.length != wordsSet.size()) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }

}
