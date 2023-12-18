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
        String day = scan.next();

        switch (day) {
            case "SUN":
                os.println(7);
                break;

            case "MON":
                os.println(6);
                break;

            case "TUE":
                os.println(5);
                break;

            case "WED":
                os.println(4);
                break;

            case "THU":
                os.println(3);
                break;

            case "FRI":
                os.println(2);
                break;

            case "SAT":
                os.println(1);
                break;
        }
    }
}