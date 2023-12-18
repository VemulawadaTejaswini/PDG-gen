public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long n = scanner.nextInt(), m = scanner.nextInt(), n1 = 1, m1 = 1;
        for (int i = 2; i <= n; i++)
            n1 = mod1000000007(n1 * i);
        for (int i = 2; i <= m; i++)
            m1 = mod1000000007(m1 * i);
        if (n == m) System.out.println(mod1000000007(mod1000000007(n1 * m1) * 2L));
        else System.out.println(mod1000000007(n1 * m1));
    }

    public static int mod1000000007(long l) {
        return (int)((l %= 1000000007) < 0 ? l + 1000000007 : l);
    }
}