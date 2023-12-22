import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n, count;;
        StringBuilder sb = new StringBuilder("");

        while (sc.hasNextInt()) {
            n = sc.nextInt();

            count = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) count++;
            }

            sb.append(count);
            sb.append('\n');
        }
        System.out.print(sb);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        else if (n <= 3) return true;
        else if (n % 2 == 0 || n % 3 == 0) return false;

        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i+2) == 0) return false;
            i += 6;
        }

        return true;
    }
}