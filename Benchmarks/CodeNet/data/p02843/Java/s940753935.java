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
        int X = scan.nextInt();

        int shou = (int)Math.floor(X/100);
        int amari = X%100;

        if(shou*5 < amari) {
            os.println(0);
            return;
        } else {
            os.println(1);
            return;
        }
    }
}