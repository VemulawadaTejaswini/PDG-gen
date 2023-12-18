import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        String S = scanner.next();
        scanner.close();

        if (S.matches(String.format("^[0-9]{%d}-[0-9]{%d}", A, B))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
