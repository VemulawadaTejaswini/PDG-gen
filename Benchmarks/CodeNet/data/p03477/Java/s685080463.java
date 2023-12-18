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
            int A = Integer.parseInt(sl[0]);
            int B = Integer.parseInt(sl[1]);
            int C = Integer.parseInt(sl[2]);
            int D = Integer.parseInt(sl[3]);

            int AB = A + B;
            int CD = C + D;
            System.out.println(
                AB < CD ? "Right" : CD < AB ? "Left" : "Balanced");
        }
    }
}
