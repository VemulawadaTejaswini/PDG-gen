import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String sl[] = s.split(" ");
            int X = Integer.parseInt(sl[0]);
            int A = Integer.parseInt(sl[1]);
            int B = Integer.parseInt(sl[2]);

            System.out.println(
                B - A <= 0 ? "delicious" : B - A <= X ? "safe" : "dangerous");
        }
    }
}
