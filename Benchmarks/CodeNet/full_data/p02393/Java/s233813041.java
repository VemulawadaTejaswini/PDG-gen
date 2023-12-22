import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        String line = readLine(System.in);
        String[] input = line.split(" ");
        int[] n = { Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]) };

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int tmp = n[i];
                    n[i] = n[j];
                    n[j] = tmp;
                }
            }
        }

        for (int i = 0; i < n.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(n[i]);
        }
        System.out.println();
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