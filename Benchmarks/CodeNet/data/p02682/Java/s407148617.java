
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();

        if(K <= A) {
            os.println(K);
            return;
        }

        if(K <= A+B) {
            os.println(A);
            return;
        }

        os.println(2*A + B -K);

    }

}