import java.io.*;

public class Main {
    public static void main(String... args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringBuilder sb = new StringBuilder();
        final String space = " ";
        while (true) {
            final String[] lines = br.readLine().split(space);
            final int x = Integer.parseInt(lines[0]);
            final int y = Integer.parseInt(lines[1]);
            if (x == 0 && y == 0) break;
            sb.append(x < y ? x + space + y : y + space + x).append("\n");
        }
        System.out.print(sb);
    }
}