import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] arg) {
        Main m = new Main();
        m.run();
        m.close();
    }

    private Scanner sc;

    private Main() {
        sc = new Scanner(System.in);
    }
    private void close() {
        sc.close();
    }

    private void run() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] v = IntStream.range(0, n).mapToDouble(i -> sc.nextDouble()).sorted().toArray();
        double d = v[0];
        for (int i = 1; i < n; i++) {
            d = (d + v[i]) / 2;
        }

        System.out.println(d);
    }
}
