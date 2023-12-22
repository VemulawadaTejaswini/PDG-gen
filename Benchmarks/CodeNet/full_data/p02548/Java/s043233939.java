import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int cpt = 0;
        for (int c = 1; c < n; ++c) {
            cpt += divisors (n - c);
        }
        out.println(cpt);
    }

    int divisors(int n) {
        int cpt = 0;
        for (int i = 1; i * i <= n; i++)
            if (n % i == 0) {
                cpt++;
                if (i != n / i)
                    cpt++;
            }
        return cpt;
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
