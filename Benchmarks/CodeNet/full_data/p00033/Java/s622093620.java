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
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[10];
        for (int i = 0; i < n; i++) {
            String[] values = reader.readLine().split(" ");
            for (int j = 0; j < 10; j++) {
                numbers[j] = Integer.parseInt(values[j]);
            }
            int small = 0;
            int large = numbers[0];
            String result = "YES";
            for (int j = 1; j < 10; j++) {
                int number = numbers[j];
                if (number < small) {
                    result = "NO";
                    break;
                }
                if (number < large) {
                    small = number;
                } else {
                    large = number;
                }
            }
            out.println(result);
        }
    }
}