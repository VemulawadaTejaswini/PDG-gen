import java.io.PrintWriter;
import java.util.Scanner;

class E {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        if (K == 1) {
            final PrintWriter pw = new PrintWriter(System.out);
            for (int i = 0; i < N; i++)
                pw.format("%d %d %d\n", K + i, K + N + i, K + 2 * N + i);
            pw.close();
        } else {
            System.out.println(-1);
        }
    }
}
public class Main {
    public static void main(String...args) {
        E.main();
    }
}
