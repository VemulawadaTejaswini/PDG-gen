import java.io.*;

/**
 * Created by Ayushi on 27/07/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        long a = Long.parseLong(temp[0]);
        long b = Long.parseLong(temp[1]);
        r.close();

        if ((a+b)%2 == 1) {
            System.out.println("IMPOSSIBLE");
        }
        else {
            System.out.println((a+b) / 2);
        }
    }
}
