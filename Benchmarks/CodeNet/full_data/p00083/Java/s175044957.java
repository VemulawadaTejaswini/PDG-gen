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
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] values = line.split(" ");
            int y = Integer.parseInt(values[0]);
            int m = Integer.parseInt(values[1]);
            int d = Integer.parseInt(values[2]);
            int x = y * 10000 + m * 100 + d;
            String result = "pre-meiji";
            for (int i = 0; i < limits.length; i++) {
                if (x >= limits[i]) {
                    int year = y - limits[i] / 10000 + 1;
                    result = names[i] + " " + year + " " + m + " " + d;
                    break;
                }
            }
            out.println(result);
        }
    }

    private static int[] limits = { 19890108, 19261225, 19120730, 18680908 };

    private static String[] names = { "heisei", "showa", "taisho", "meiji" };
}