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

        if(A <= 9 && A >= 1 && B <= 9 && 1 <= B)
            os.println(A*B);
        else
            os.println(-1);
    }
}