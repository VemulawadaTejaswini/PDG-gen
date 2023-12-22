
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
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        long d = scan.nextInt();

        long bc = b*c;
        long bd = b*d;
        long ac = a*c;
        long ad = a*d;

        long maxb = Math.max(bc, bd);
        long maxa = Math.max(ac, ad);


        os.println(Math.max(maxa,maxb));
    }
}