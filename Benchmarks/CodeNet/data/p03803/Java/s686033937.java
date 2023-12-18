import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Integer[] CARDS = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());

        int aIndex = Arrays.asList(CARDS).indexOf(A);
        int bIndex = Arrays.asList(CARDS).indexOf(B);

        scanner.close();

        if (aIndex > bIndex) {
            System.out.println("Alice");
        } else if (aIndex < bIndex) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
