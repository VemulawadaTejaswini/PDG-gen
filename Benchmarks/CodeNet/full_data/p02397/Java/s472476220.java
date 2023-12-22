
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String out;
        int a = 0;
        int b = 0;
        while ((line = br.readLine()) != null) {
            java.util.StringTokenizer st = new StringTokenizer(line, " ");

            while (st.hasMoreTokens()) {
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                if (a < b) {
                    out = a + " " + b;
                } else {
                    out = b + " " + a;
                }
            }
            if (a == b) {
                break;

            }

        }

    }
}
