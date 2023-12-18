import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        final String[] sl = s.split(" ");
        int N = Integer.parseInt(sl[0]);
        int M = Integer.parseInt(sl[1]);

        if (N != 1) N -= 2;
        if (M != 1) M -= 2;

        out.println(N * M < 0 ? 0 : N * M);

        out.flush();
    }
}
