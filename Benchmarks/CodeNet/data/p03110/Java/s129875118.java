public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        double ans = 0;
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            ans += scanner.next().equals("JPY") ? x : x * 380000;
        }
        System.out.println(ans);
    }
}