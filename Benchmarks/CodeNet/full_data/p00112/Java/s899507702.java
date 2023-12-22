import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        for (int t, i; (t = s.nextInt() + 1) > 1;) {
            long[] x = new long[t + 1];
            for (i = t; i-- > 1;)
                x[i] = s.nextInt();
            for (Arrays.sort(x); i < t - 2;)
                x[0] += (x[++i + 1] += x[i]);
            System.out.println(x[0]);
        }
    }
}
