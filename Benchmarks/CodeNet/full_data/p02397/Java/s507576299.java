import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
/**
 * @author penguin_410
 *         Date: 2014/03/06
 */
public class Main {
    public static void main(String... args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final String line = br.readLine();
            final int index = line.indexOf(" ");
            final int x = Integer.parseInt(line.substring(0, index));
            final int y = Integer.parseInt(line.substring(index+1, line.length()));
            if (x == 0 && y == 0) break;
            sb.append(x < y ? x + " " + y : y + " " + x).append("\n");
        }
        System.out.print(sb);
    }
}