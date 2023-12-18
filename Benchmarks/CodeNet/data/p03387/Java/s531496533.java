public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int i = Math.max(Math.max(a, b), c) * 3 - a - b - c;
        System.out.println(((i & 1) == 0 ? i : i + 3) / 2);
    }
}