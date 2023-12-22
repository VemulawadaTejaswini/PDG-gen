import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.next());
        int h = Integer.parseInt(scanner.next());
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        int r = Integer.parseInt(scanner.next());

        String answer = (x - r >= 0) && (x + r <= w) && (y - r >= 0) && (y + r <= h) ? "Yes" : "No";

        System.out.println(answer);
    }
}