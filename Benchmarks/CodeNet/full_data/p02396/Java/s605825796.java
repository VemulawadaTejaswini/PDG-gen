
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int i = 1;
            int str = Integer.parseInt(br.readLine());
            if (str == 0) {
                break;
            }
            System.out.println("Case " + i++ + ": " + str);
        }
    }
}

