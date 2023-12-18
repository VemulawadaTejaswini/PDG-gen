import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        System.out.println(problem104a(r));
    }

    private static String problem104a(int r) {
        if (r < 1200) {
            return "ABC";
        } else if (r < 2800) {
            return "ARC";
        }
        return "AGC";
    }
}