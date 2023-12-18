import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BAcCepted solver = new BAcCepted();
        solver.solve(1, in, out);
        out.close();
    }

    static class BAcCepted {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            out.println(s.chars().filter(Character::isUpperCase).count() == 2
                    && s.substring(2, s.length() - 1).chars().anyMatch(c -> c == 'C')
                    && s.charAt(0) == 'A' ? "AC" : "WA");
        }

    }
}

