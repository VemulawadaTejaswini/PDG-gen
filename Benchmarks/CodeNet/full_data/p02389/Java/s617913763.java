import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        String line = readLine(System.in);
        StringTokenizer token = new StringTokenizer(line, " ");
        int v = Integer.parseInt(token.nextToken());
        int h = Integer.parseInt(token.nextToken());
        System.out.println((v * h) + " " + (v * 2 + h * 2));
    }

    private static String readLine(InputStream in) {
        String line = null;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(in));
            line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return line;
    }
}