import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line);
            if (n == 0) {
                break;
            }
            int min = 1001, max = -1, sum = 0;
            for (int i = 0; i < n; i++) {
                int s = Integer.parseInt(br.readLine());
                sum += s;
                if (s < min) {
                    min = s;
                }
                if (s > max) {
                    max = s;
                }
            }
            System.out.println((sum - min - max) / (n - 2));
        }
    }
}