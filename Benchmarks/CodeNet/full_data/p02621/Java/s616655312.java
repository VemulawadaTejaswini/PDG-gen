import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        System.out.println(problem172a(m));
    }

    private static int problem172a(int a) {
        return a + a * a + a * a * a;
    }
}