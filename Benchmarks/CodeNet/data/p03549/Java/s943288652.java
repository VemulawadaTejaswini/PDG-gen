public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int t;
        System.out.println((scanner.nextInt() + 18 * (t = scanner.nextInt())) * 100 * (1 << t));
    }
}