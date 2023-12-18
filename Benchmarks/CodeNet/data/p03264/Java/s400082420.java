import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            final int K = Integer.parseInt(reader.readLine());
            System.out.println(K / 2 * (K - K / 2));
        }
    }
}
