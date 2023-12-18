import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        long ans = 0l;
        for (int a = 1; a <= input; a++) {
            for (int b = 1; b <= input; b++) {
                for (int c = 1; c <= input; c++) {
                    ans += gcd(a, b, c);
                }
            }

        }

        System.out.println(ans);

    }

    public static final int gcd(final int... param) {
        final int len = param.length;
        int g = gcd(param[0], param[1]); // gcd(a, b) は以前作ったもの
        for (int i = 1; i < len - 1; i++) {
            g = gcd(g, param[i + 1]); // gcd(a, b) は以前作ったもの
        }
        return g;
    }
}
