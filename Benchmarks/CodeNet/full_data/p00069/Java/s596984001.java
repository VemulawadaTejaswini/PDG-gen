import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            int n = Integer.parseInt(line);
            if (n == 0) {
                break;
            }
            int m = Integer.parseInt(reader.readLine());
            int g = Integer.parseInt(reader.readLine());
            int d = Integer.parseInt(reader.readLine());
            int[][] data = new int[d + 1][n + 2];
            for (int i = 1; i <= n; i++) {
                data[0][i] = i;
            }
            String[] lines = new String[d + 1];
            for (int i = 1; i <= d; i++) {
                line = "0" + reader.readLine() + "0";
                lines[i] = line;
                for (int j = 1; j <= n; j++) {
                    data[i][j] = data[i - 1][j];
                }
                for (int j = 1; j < n; j++) {
                    if (line.charAt(j) == '1') {
                        data[i][j] = data[i - 1][j + 1];
                        data[i][j + 1] = data[i - 1][j];
                        j++;
                    }
                }
            }
            int x = data[d][g];
            if (x == m) {
                out.println(0);
                continue;
            }
            String result = "1";
            for (int i = 1; i <= d; i++) {
                int editIndex = 0;
                for (int j = 1; j <= n; j++) {
                    if (data[i][j] == m) {
                        if (data[i][j - 1] == x) {
                            editIndex = j - 1;
                            break;
                        } else if (data[i][j + 1] == x) {
                            editIndex = j;
                            break;
                        }
                    }
                }
                if (editIndex != 0) {
                    boolean found = false;
                    for (int j = editIndex - 1; j <= editIndex + 1; j++) {
                        if (lines[i].charAt(j) == '1') {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        result = i + " " + editIndex;
                        break;
                    }
                }

            }
            out.println(result);
        }
    }
}