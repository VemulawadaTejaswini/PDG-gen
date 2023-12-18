import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(problem099a(n));
    }

    private static String problem099a(int n) {
        if (n <= 999) {
            return "ABC";
        }
        return "ABD";
    }
}