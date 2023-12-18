import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by mixnector on 2017/03/04.
 */
public class Main {
    static Scanner in;
    static PrintWriter out;
    static String INPUT = "";

    public static void main(String[] args) throws Exception
    {
        in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
        out = new PrintWriter(System.out);
        int X = ni();
        double digit = 1;
        for(int i = 1; digit <= X; i++) {
            digit = Math.pow(2, i);
        }
        int maxDig = (int)digit / 2;
        if(X == 1)
            out.println(1);
        else if(X == 2)
            out.println(2);
        else
            out.println(maxDig / 2 + 1);
        out.flush();
    }

    static int ni() {
        return Integer.parseInt(in.next());
    }

    static long nl() {
        return Long.parseLong(in.next());
    }
}