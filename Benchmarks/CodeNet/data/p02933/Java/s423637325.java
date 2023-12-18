import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String s = sc.next();
        PrintWriter out = new PrintWriter(System.out);

        if (a >= 3200) {
            out.println(s);

        } else {
            out.println("red");
        }

        out.flush();
        sc.close();

    }
}