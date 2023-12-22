
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int i = 1;
            String str = br.readLine();
            System.out.println("Case " + i++ + ": " + str);
            if (Integer.valueOf(str) == 0) {
                break;
            }
        }
    }
}

