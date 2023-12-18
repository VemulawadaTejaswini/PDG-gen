import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(problem068a(n));
    }

    private static String problem068a(int n) {
        String title = "ABC";
        return String.format("%s%03d", title, n);
    }
}