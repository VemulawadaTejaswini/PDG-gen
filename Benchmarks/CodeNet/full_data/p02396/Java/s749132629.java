import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 10000; i++) {

                String input = br.readLine();
                int output = Integer.parseInt(input);

                if (output == 0) {
                    break;
                }
                System.out.println("Case " + i + ": " + output);

            }
    }
}