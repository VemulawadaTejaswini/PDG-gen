import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hikigineer on 2017/03/04.
 */
public class Main {
    static Scanner in;
    static PrintWriter out;
    static String INPUT = "";

    public static void main(String[] args) throws Exception
    {
        in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
        out = new PrintWriter(System.out);
        int a = ni();
        int b = ni();
        int c = ni();

        out.println((b - a) == (c - b) ? "YES" : "NO");
        out.flush();
    }

    static int ni() {
        return Integer.parseInt(in.next());
    }
}