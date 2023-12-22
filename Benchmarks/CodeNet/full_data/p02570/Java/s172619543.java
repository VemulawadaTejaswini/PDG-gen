import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String[] str = in.readLine().split(" ");
        long d = Long.parseLong(str[0]);
        long t = Long.parseLong(str[1]);
        long s = Long.parseLong(str[2]);

        if(d > t*s) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}