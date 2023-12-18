import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String[] sl = s.split(" ");
            int a = Integer.parseInt(sl[0]);
            int b = Integer.parseInt(sl[1]);

            int dif = b - a;

            int sm = 0;
            for (int i = 1; i < dif; i++) sm += i;

            System.out.println(sm - a);
        }
    }
}
