import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);

        if (input >= 'a' && input <= 'z') {
            System.out.println('a');
        } else {
            System.out.println('A');
        }

    }
}
