import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int abc = Integer.parseInt(scanner.next() + scanner.next() + scanner.next());

        System.out.println((abc % 4) == 0 ? "YES" : "NO");
    }
}