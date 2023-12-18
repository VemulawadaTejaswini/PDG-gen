import java.io.PrintWriter;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int r = in.nextInt();
        out.println(2.0 * Math.PI * 1.0 * r);
        out.close();
    }
}