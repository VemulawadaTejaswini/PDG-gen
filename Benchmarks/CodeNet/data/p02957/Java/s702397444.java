import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
    public static final PrintStream err = System.err;

    public static void main(String[] args) {
        int Ai = in.nextInt();
        int Bi = in.nextInt();

        int K2 = Math.abs(Ai) + Math.abs(Bi);

        if (K2 % 2 == 0) {
            out.println(K2 / 2);
        } else {
            out.println("IMPOSSIBLE");
        }
    }
}
