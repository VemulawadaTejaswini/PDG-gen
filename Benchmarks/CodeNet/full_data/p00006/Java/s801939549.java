import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            char[] str = line.toCharArray();
            int u;
            char c;
            for (int i = 0; i < str.length / 2; i++) {
                u = str.length - 1 - i;
                c = str[i];
                str[i] = str[u];
                str[u] = c;
            }
            System.out.println(str);
        }
    }
}