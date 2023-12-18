import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        scanner.close();

        boolean isBeautiful = b - a == c - b;

        System.out.println(isBeautiful ? "YES" : "NO");
    }
}
