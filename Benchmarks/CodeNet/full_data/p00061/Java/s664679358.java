import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Map<Integer, Integer> scoreMap = new HashMap<Integer, Integer>();
        int[] occurrences = new int[31];
        while (true) {
            String[] values = reader.readLine().split(",");
            int number = Integer.parseInt(values[0]);
            int score = Integer.parseInt(values[1]);
            if (number == 0 && score == 0) {
                break;
            }
            scoreMap.put(number, score);
            occurrences[score] = 1;
        }
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            int number = Integer.parseInt(line);
            int score = scoreMap.get(number);
            int rank = 0;
            for (int i = 30; i >= score; i--) {
                rank += occurrences[i];
            }
            out.println(rank);
        }
    }
}