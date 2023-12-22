import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String line = stdin.readLine();
        int x = Integer.parseInt(line);

        if(x>=30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
