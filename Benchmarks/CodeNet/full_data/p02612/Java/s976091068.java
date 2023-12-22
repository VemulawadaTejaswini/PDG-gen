import java.util.Scanner;
import java.io.PrintWriter;

public class APayment {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        if(n%1000==0) {
            out.println("0");
        }
        else {
            int y = n%1000;
            out.println(1000-y);
        }
    }
}
