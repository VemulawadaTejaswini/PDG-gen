import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int s = Integer.parseInt(line);
        System.out.printf("%d:%d:%d%n", s / 3600, s % 3600 / 60, s % 3600 % 60);
    }
}
