import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break;

            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
            }

            double m = 0;
            for (double d : s) m += d;
            m /= n;
            double sigma = 0;
            for (double d : s) sigma += (d - m) * (d - m);
            sigma /= n;

            System.out.println(Math.sqrt(sigma));
        }
    }
}