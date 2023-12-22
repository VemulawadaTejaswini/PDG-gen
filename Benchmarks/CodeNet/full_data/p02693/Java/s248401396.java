
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
        int K = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();

        int low = A/K;
        int high = B/K;

        if(low != 0 && (high - low > 0 || A%K == 0))
            os.println("OK");
        else
            os.println("NG");

    }
}