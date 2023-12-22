import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean isPrime(int x) {
        if (x == 2) return true;

        if (x < 2 || x % 2 == 0) {
            return false;
        }

        int i = 3;
        double root = Math.sqrt(x);
        while (i <= root) {
            if (x % i == 0) return false;
            i += 2;
        }

        return true;
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());
            int ret = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(in.readLine());
                if (isPrime(x)) ret++;
            }

            System.out.println(ret);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

