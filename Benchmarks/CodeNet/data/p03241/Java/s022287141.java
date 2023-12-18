import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();

            long max = 0;
            for (Integer d : divisor(M)) {
                if (M / d.intValue() >= N) {
                    max = Math.max(max, d.intValue());
                }
            }
            System.out.println(max);
        }
    }

    public static final ArrayList<Integer> divisor(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                if (n / i != i) {
                    res.add(n / i);
                }
            }
        }
        return res;
    }
}
