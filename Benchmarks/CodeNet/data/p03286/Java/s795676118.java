import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        final String s;
        try (BufferedReader reader =
                 new BufferedReader (new InputStreamReader (System.in))) {
            s = reader.readLine();
        }
        int           N    = Integer.parseInt (s);
        StringBuilder sb   = new StringBuilder();
        int           base = 2;
        while (0 != N) {
            // base = 3 でうまくいかない
            // 例えば 7
            // base = 2 は OK
            // sb.insert (0, String.valueOf (Math.abs (N % base)));
            // N -= Math.abs (N % base);
            // N /= -base;

            // base = 3 でもうまくいく
            // 最小非負剰余
            sb.insert (0, String.valueOf ((N % base + base) % base));
            N -= (N % base + base) % base;
            N /= -base;
        }
        if (sb.length() == 0) sb.append ("0");
        System.out.println (sb);
    }
}
