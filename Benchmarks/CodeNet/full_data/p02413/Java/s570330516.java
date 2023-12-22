import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input;

            input = in.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            int c = Integer.parseInt(input[1]);

            int[][] table = new int[r + 1][c + 1];

            for (int i = 0; i < r; i++) {
                String[] arr = in.readLine().split(" ");
                int[] tmp = new int[c + 1];
                for (int j = 0; j < c; j++) {
                    tmp[j] = Integer.parseInt(arr[j]);
                }
                tmp[c] = Arrays.stream(tmp).sum();
                table[i] = tmp;
            }

            int[] sumRow = new int[c + 1];
            Arrays.fill(sumRow, 0);
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c + 1; j++) {
                   int x = table[i][j];
                   sumRow[j] += x;
                }
            }
            table[r] = sumRow;

            StringBuilder out = new StringBuilder();
            for (int i = 0; i < r + 1; i++) {
                List<String> sarr = Arrays.stream(table[i]).mapToObj(String::valueOf).collect(Collectors.toList());
                out.append(String.join(" ", sarr));
                out.append("\n");
            }
            System.out.print(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}

