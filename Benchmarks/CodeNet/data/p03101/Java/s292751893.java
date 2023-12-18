public class Main {
    static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int h = scanner.nextInt(), w = scanner.nextInt();
        System.out.println((h - scanner.nextInt()) * (h - scanner.nextInt()));
    }
}