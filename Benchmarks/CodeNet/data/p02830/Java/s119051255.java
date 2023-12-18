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
        String S = scan.next();
        String T = scan.next();

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < N; i++) {
            builder.append(S.charAt(i));
            builder.append(T.charAt(i));
        }

        os.println(builder.toString());
    }
}