public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int j = (int)Math.max(Math.ceil(a / (double)(a = scanner.nextInt())), Math.ceil(b / (double)(b = scanner.nextInt())));
            a *= j;
            b *= j;
        }
        System.out.println(a + b);
    }
}