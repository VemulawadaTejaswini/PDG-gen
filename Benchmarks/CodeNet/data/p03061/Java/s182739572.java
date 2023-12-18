import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] values = new int[n];
        int[] lefts = new int[n];
        int[] rights = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            int current = 0;
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    continue;
                }
                current = gcd(current, values[j]);
            }

            result = current > result ? current : result;
        }

        System.out.println(result);
    }

    private static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        int tmp = m % n;
        return gcd(n, tmp);
    }
}