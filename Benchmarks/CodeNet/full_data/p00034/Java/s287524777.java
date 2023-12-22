
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
            String[] inputs = input.split(",");
            int[] l = new int[10];
            for (int i = 0; i < 10; i++) {
                l[i] = Integer.parseInt(inputs[i]) * 10000;
            }
            int[] v = {Integer.parseInt(inputs[10]),
                       Integer.parseInt(inputs[11])};
            int sumA = 0;
            int sumB = 0;
            for (int i : l) {
                sumB += i;
            }
            while (true) {
                if (sumA >= sumB) {
                    break;
                }
                sumA += v[0];
                sumB -= v[1];
            }
            for (int i = 0; i < l.length; i++) {
                if (sumA <= 0) {
                    System.out.println(i);
                    break;
                }
                sumA -= l[i];
            }
        }
    }
}