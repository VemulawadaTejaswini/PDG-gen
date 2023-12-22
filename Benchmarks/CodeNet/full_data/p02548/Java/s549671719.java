import java.util.Scanner;

public class Main {
    // A x B + C
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        parseAll(N);
//        System.out.println(parseMultiplication(N));
    }

    private static void parseAll(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            int rest = n - i;
            count += parseMultiplication(rest);
        }
        System.out.println(count);
    }

    private static int parseMultiplication(int n) {
        if (n == 1) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}