public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long a = scanner.nextLong(), b = scanner.nextLong();
        System.out.println(a == 0 ? f(b) : f(b) ^ f(a - 1));
    }

    static long f(long x) {
        return (x & 1) == 1 ? x / 2 % 2 ^ 1 : x + x / 2 % 2;
    }
}