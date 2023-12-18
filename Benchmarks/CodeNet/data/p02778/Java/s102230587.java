
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
        String S = scan.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            sb.append("x");
        }

        os.println(sb.toString());
    }
}