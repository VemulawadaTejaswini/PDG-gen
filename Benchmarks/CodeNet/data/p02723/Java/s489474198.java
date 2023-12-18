import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        String s = sc.next();
        char[] arr = s.toCharArray();

        if ((arr[2]==arr[3]) && (arr[4]==arr[5])) {
            out.print("Yes");
            out.flush();
            return;
        }


        out.print("No");
        out.flush();



    }

}
