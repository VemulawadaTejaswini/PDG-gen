import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            char[] numbers = reader.readLine().toCharArray();
            Arrays.sort(numbers);
            int minValue = 0;
            int maxValue = 0;
            int minDigit = 10000000;
            int maxDigit = 1;
            for (int j = 0; j < 8; j++) {
                int number = numbers[j] - '0';
                minValue += number * minDigit;
                maxValue += number * maxDigit;
                minDigit /= 10;
                maxDigit *= 10;
            }
            out.println(maxValue - minValue);
        }
    }
}