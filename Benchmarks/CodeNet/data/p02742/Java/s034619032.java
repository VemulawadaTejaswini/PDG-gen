import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = Integer.parseInt(sc.next());
        long W = Integer.parseInt(sc.next());
        double N = (double) H * W / 2;
        long result = 1;
        PrintWriter out = new PrintWriter(System.out);

        if (H == 1 || W == 1) {
            out.println(0);
            out.flush();
            sc.close();
            return;
        }

        result = (long) Math.ceil(N);

        out.println(result);
        out.flush();
        sc.close();
    }
}