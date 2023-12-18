import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        try(final Scanner scanner = new Scanner(System.in);) {
            final String first = scanner.next();
            System.out.println(first.chars().parallel().filter(i -> '1' == (char) i).count());
        }
    }
}
