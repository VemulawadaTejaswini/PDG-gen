import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = in.readLine()) != null) {
            int d = Integer.parseInt(line);
            int x = 0;
            int s = 0;
            while (x <= 600 - d) {
                s += x * x * d;
                x += d;
            }
            
            System.out.println(s);
        }
    }
}

