import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int x = Integer.parseInt(s[0]), y = Integer.parseInt(s[1]);
        if (y >= 2 * x && y <= 4 * x) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
