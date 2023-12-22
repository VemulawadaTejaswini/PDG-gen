import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int result = Integer.parseInt(scanner.next()) + Integer.parseInt(scanner.next());
            int length = String.valueOf(result).length();
            System.out.println(length);
        }
    }
}