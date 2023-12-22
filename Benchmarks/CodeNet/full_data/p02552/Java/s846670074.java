import java.io.PrintWriter;
import java.util.Scanner;

public class A {

    void solve(Scanner in, PrintWriter out) {
        out.println(in.nextInt() ^ 1);
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new A().solve(in, out);
        }
    }
}
