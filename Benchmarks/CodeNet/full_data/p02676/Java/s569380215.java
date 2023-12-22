import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var k = parseInt(sc.next());
        var s = sc.next();

        var writer = new PrintWriter(System.out);
        if (s.length() <= k) {
            writer.println(s);
        } else {
            writer.println(s.substring(0, k) + "...");
        }
        writer.flush();
    }
}
