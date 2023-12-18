
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int k = in.nextInt();
        double[] all = new double[n];
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            all[i] = (1 + p) * p / (double) 2 / (double) p;
        }

        double current = 0;

        for (int i = 0; i < k; i++) {
            current += all[i];
        }
        double max = current;
        for (int i = k; i < n; i++) {
            current = current - all[i - k] + all[i ];
            max = Double.max(current, max);
        }
        System.out.println(max);
    }
}
