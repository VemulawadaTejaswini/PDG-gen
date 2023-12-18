import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        int stop = -1;

        PrintWriter out = new PrintWriter(System.out);

        if (X == 2) {
            out.println(2);
            sc.close();
            out.flush();
            return;
        }

        while (true) {
            stop = -1;

            for (int i = 2; i < X; i++) {
                if (X % i == 0) {
                    stop = 0;
                    break;
                }
            }

            if (stop == 0) {
                X++;
            } else {
                break;
            }
        }

        out.println(X);

        sc.close();
        out.flush();
    }
}