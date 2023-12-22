import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while (!(line = br.readLine()).equals("-")) {
            String s = line;
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                int m = Integer.parseInt(br.readLine());
                s = s.substring(m, s.length()) + s.substring(0, m);
            }
            System.out.println(s);
        }
    }
}