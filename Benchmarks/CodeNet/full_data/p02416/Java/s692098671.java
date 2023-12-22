import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line.length() == 1 && line.charAt(0) == '0') {
                break;
            }

            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                sum += line.charAt(i) - '0';
            }
            System.out.println(sum);
        }

    }
}
