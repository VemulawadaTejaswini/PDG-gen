
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

        for(int i = A; i <= B; i++) {
            if (i % K == 0){
                os.println("OK");
                return;
            }
        }

        os.println("NG");
    }
}