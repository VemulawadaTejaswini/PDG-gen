import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int R = scanner.nextInt();
        System.out.println(2 * R * Math.PI);
        scanner.close();
    }
}
