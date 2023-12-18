import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine());
        final byte h = Byte.parseByte(tok.nextToken());
        final byte w = Byte.parseByte(tok.nextToken());

        char[][] mat = new char[h][w];
        boolean[] row = new boolean[h];
        boolean[] col = new boolean[w];

        for (byte i = 0; i < h; i++) {
            String str = br.readLine();
            for (byte j = 0; j < w; j++) {
                char c = str.charAt(j);
                mat[i][j] = c;
                if (c == '#') {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        for (byte i = 0; i < h; i++) {
            if (!row[i]) continue;
            for (byte j = 0; j < w; j++) {
                if (col[j]) {
                    out.print(mat[i][j]);
                }
            }
            out.print("\n");
        }
        out.flush();
    }
}
