import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    // 11:07-
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            int N = sc.nextInt();
            int[] vs = new int[N];
            for (int i = 0; i < N; i++) vs[i] = sc.nextInt();

            int[] as = new int[N];
            int[] bs = new int[N];

            as[0] = vs[0];
            for (int i = 1; i < vs.length; i++) as[i] = gcd(as[i - 1], vs[i]);

            bs[N - 1] = vs[N - 1];
            for (int i = bs.length - 2; i >= 0; i--) bs[i] = gcd(bs[i + 1], vs[i]);

            int max = Math.max(bs[1], as[N - 2]);
            for (int i = 1; i < vs.length - 1; i++) max = Math.max(max, gcd(as[i - 1], bs[i + 1]));
            
            out.println(max);
        }
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

}
