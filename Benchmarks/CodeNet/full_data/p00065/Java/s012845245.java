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
        int[] lastCounts = new int[1001];
        while (true) {
            String line = reader.readLine();
            if (line.isEmpty()) {
                break;
            }
            String[] values = line.split(",");
            int number = Integer.parseInt(values[0]);
            lastCounts[number]++;
        }
        int[] thisCounts = new int[1001];
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            String[] values = line.split(",");
            int number = Integer.parseInt(values[0]);
            thisCounts[number]++;
        }
        for (int i = 1; i <= 1000; i++) {
            if (lastCounts[i] > 0 && thisCounts[i] > 0) {
                out.println(i + " " + (lastCounts[i] + thisCounts[i]));
            }
        }
    }
}