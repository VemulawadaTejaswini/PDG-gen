
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
        String N = scan.next();

        long sum = 0;
        for(int i = 0; i < N.length(); i++) {
            sum += Integer.valueOf(N.charAt(i)-'0');
        }

        if(sum % 9 == 0)
            os.println("Yes");
        else
            os.println("No");

    }
}