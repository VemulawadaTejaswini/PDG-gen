import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int w = Integer.parseInt(in[0]);
        int h = Integer.parseInt(in[1]);
        int x = Integer.parseInt(in[2]);
        int y = Integer.parseInt(in[3]);

        System.out.printf("%.11f %d\n", 1.0 * w * h / 2, x * 2 == w && y * 2 == h? 1 : 0);
    }
}