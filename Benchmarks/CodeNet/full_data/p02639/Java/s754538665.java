import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("0")) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
