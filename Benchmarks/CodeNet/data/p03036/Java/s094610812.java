import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static long n;

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 18:18-

            int r = sc.nextInt();
            int D = sc.nextInt();
            long x = sc.nextInt();

            for (int i = 0; i < 10; i++) {
                x = x * r - D;
                out.println(x);
            }
        }
    }
}
