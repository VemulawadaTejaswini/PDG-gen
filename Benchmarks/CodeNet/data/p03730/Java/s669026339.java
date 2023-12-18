import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] input = reader.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        // ax - by === -c

        for (int x = 1; x < 1000; x++) {
            int xx = x;
            int y = 1;
            long res = a*xx - b*y;

            if (res < -c) {
                while (res < -c) {
                    xx++;
                    res += a;
                }
                if (res == -c) {
                    System.out.println("YES");
                    return;
                }
            } else if (res > -c) {
                while (res > -c) {
                    y++;
                    res -= b;
                }
                if (res == -c) {
                    System.out.println("YES");
                    return;
                }
            } else {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("No");






//        PrintWriter writer = new PrintWriter(System.out);
//
//        writer.close();


    }
}
