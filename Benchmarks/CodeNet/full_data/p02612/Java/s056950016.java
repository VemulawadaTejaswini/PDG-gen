import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        int x = 0;
        x = (int) Math.round((double) N / 1000);

        PrintWriter out = new PrintWriter(System.out);
        out.println(1000 * x - N);
        sc.close();
        out.flush();
    }
}