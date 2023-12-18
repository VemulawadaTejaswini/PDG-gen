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
        long X = Long.parseLong(sl[0]);
        long Y = Long.parseLong(sl[1]);

        int len = 0;

        do {
            X = X << 1;
            len++;
        } while (X <= Y);

        out.println(len);

        out.flush();
    }
}
