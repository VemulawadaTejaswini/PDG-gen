import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int ab = Integer.parseInt(a + b);

        double sqrt_num = Math.sqrt(ab);

        PrintWriter out = new PrintWriter(System.out);
        if (sqrt_num == (int) sqrt_num) {
            out.println("Yes");
        } else {
            out.println("No");
        }

        out.flush();
        sc.close();
    }
}