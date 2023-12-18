import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        int r = 1;
        for (int i = 0; i < m; i++) {
            r *= 2;
        }
        int y = (n - m) * 100;
        y += m * 1900;
        y *= r;
        out.print(y);
        out.close();
    }
}
