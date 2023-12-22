import java.io.PrintWriter;
import java.util.Scanner;

public class B {

    void solve(Scanner in, PrintWriter out) {
        in.nextInt();
        int b = in.nextInt();
        in.nextInt();
        out.println(b * in.nextInt());
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new B().solve(in, out);
        }
    }
}
