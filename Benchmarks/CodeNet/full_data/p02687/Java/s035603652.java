import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        System.out.println(S.equals("ABC") ? "ARC" : "ABC");
    }
}
