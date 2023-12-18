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
        int H = scan.nextInt();
        int A = scan.nextInt();
        int ans = (int)Math.ceil((double)H/A);
        os.println(ans);
    }
}