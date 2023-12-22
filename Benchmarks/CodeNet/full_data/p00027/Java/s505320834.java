import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while (true) {
            String[] values = reader.readLine().split(" ");
            int month = Integer.parseInt(values[0]);
            if (month == 0) {
                break;
            }
            int day = Integer.parseInt(values[1]);
            int total = totals[month] + day;
            out.println(monthNames[total % 7]);
        }
    }

    private static final int[] totals = { 0, 0, 31, 60, 91, 121, 152, 182, 213,
            244, 274, 305, 335 };

    private static final String[] monthNames = { "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday", "Monday", "Tuesday" };
}