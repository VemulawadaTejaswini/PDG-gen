import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/09/30 21:01.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.next().replaceAll("0", "");
            System.out.println(s.length());
        }
    }
}