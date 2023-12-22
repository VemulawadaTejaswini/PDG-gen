
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            int[] values = new int[input.length()];
            int index = 0;
            for (char c : input.toCharArray()) {
                if (c == 'I') {
                    values[index] = 1;
                } else if (c == 'V') {
                    values[index] = 5;
                } else if (c == 'X') {
                    values[index] = 10;
                } else if (c == 'L') {
                    values[index] = 50;
                } else if (c == 'C') {
                    values[index] = 100;
                } else if (c == 'D') {
                    values[index] = 500;
                } else if (c == 'M') {
                    values[index] = 1000;
                }
                index++;
            }
            int sum = 0;
            int back = 0;
            for (int i = values.length - 1; i >= 0; i--) {
                if (back <= values[i]) {
                    sum += values[i];
                    back = values[i];
                } else {
                    for (int j = i; j >= 0 && back >= values[j]; j--) {
                        sum -= values[j];
                        i = j;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}