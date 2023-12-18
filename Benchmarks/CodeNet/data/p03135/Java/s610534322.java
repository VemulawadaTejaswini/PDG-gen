import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.next());
        int X = Integer.parseInt(scanner.next());
        scanner.close();

        System.out.println((double) T / X);
    }
}
