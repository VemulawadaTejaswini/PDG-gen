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
        int N = scan.nextInt();

        for(int i = 0; i < N; i ++){
            int A = scan.nextInt();
            if(A%2 == 0 && (A%3 != 0 && A%5 != 0)) {
                os.println("DENIED");
                return;
            }
        }

        os.println("APPROVED");
    }
}