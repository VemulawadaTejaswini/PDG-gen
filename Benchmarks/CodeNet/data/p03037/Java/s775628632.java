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

            // 18:24-

            int n = sc.nextInt();
            int m = sc.nextInt();
            int lm = -1;
            int rm = Integer.MAX_VALUE;
            
            for (int i = 0; i < m; i++) {
                lm = Math.max(lm, sc.nextInt());
                rm = Math.min(rm, sc.nextInt());
            }

            out.println(lm > rm ? 0 : rm - lm + 1);
        }
    }
}
