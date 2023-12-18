public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            float j = scanner.nextInt();
            while ((j /= 2) % 1 == 0) ans++;
        }
        System.out.println(ans);
    }
}