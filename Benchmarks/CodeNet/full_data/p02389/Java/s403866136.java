import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(area(x, y) + " " + circumference(x, y));
    }

    private static int area(int x, int y) { return x * y; }
    private static int circumference(int x, int y) { return 2 * (x + y); }
}