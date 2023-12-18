public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long a = n / k;
        long b = n / (k / 2) - a;
        System.out.println(a * a * a + ((k & 1) == 0 ? b * b * b : 0));
    }
}