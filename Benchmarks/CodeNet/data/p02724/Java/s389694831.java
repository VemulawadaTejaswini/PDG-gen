import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {


        int x = sc.nextInt();

        long ans = 0;

        long tmp500 = x/500 * 1000;
        long diff = x - 500 * (x/500);
        long tmp5 = diff/5 * 5;


        out.print(tmp500+tmp5);
        out.flush();



    }

}
