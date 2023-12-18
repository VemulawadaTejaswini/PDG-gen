import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InputReader reader = new InputReader(System.in);
        int draws[] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).map(v -> v == 1 ? v = 14 : v).toArray();
        if(draws[0] > draws[1]) {
            System.out.println("Alice");
            return;
        } else if (draws[0] < draws[1]) {
            System.out.println("Bob");
            return;
        }
        System.out.println("Draw");
    }

    static class InputReader {
        private BufferedReader reader;

        public InputReader(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String readLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}