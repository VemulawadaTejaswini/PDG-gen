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

        for (int x = 1; x < 10000; x++) {

            long res = a*x - b;

            if (res < -c) {
                while (res < -c) {
                    res += a;
                }
                if (res == -c) {
                    System.out.println("YES");
                    return;
                }
            } else if (res > -c) {
                while (res > -c) {
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
