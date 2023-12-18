import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        double d = sc.nextDouble();

        out.print(d*d*d*Math.pow(27, -1));
        out.flush();

    }

}
