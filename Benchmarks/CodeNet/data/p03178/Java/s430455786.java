import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int modulo = scanner.nextInt();
        long lots = 1000000007;

        long[][] exact = new long[number.length() + 1][modulo];
        long[][] less = new long[number.length() + 1][modulo];
        exact[0][0] = 1;

        for (int i = 1; i <= number.length(); ++i) {
            for (int m = 0; m < modulo; ++m) {
                for (int d = 0; d <= 9; ++d) {
                    less[i][m] += less[i - 1][mod(m - d, modulo)];
                    less[i][m] %= lots;
                }

                int digit = number.charAt(i - 1) - '0';
                for (int d = 0; d < digit; ++d) {
                    less[i][m] += exact[i - 1][mod(m - d, modulo)];
                    less[i][m] %= lots;
                }

                exact[i][m] += exact[i - 1][mod(m - digit, modulo)];
                exact[i][m] %= lots;
            }
        }

        long res = exact[number.length()][0] + less[number.length()][0];
        res = (res + lots - 1) % lots;

        System.out.println(res);
    }

    public static int mod(int val, int modulo) {
        int res = val % modulo;
        return res < 0 ? res + modulo : res;
    }

}
