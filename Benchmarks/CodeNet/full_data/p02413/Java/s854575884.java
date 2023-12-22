import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r, c;
        String data[];
        try {
            data = br.readLine().split(" ");
            r = Integer.parseInt(data[0]);
            c = Integer.parseInt(data[1]);
            String input[];
            int graph[][] = new int[r + 1][c + 1];
            int sum1 = 0, sum2 = 0;

            for (int i = 0; i < r; i++) {
                input = br.readLine().split(" ");
                for (int j = 0; j < c; j++) {
                    graph[i][j] = Integer.parseInt(input[j]);
                    sum1 += graph[i][j];
                    if (j == c - 1) {
                        graph[i][j + 1] = sum1;
                        sum1 = 0;
                    }
                }
            }
            for (int i = 0; i <= c; i++) {
                for (int j = 0; j < r; j++) {
                    sum2 += graph[j][i];
                    if (j == r - 1) {
                        graph[j + 1][i] = sum2;
                        sum2 = 0;
                    }
                }
            }

            for (int i = 0; i <= r; i++) {
                for (int j = 0; j <= c; j++) {
                    if (j != 0)
                        System.out.print(" ");
                    System.out.printf("%d", graph[i][j]);
                }
                System.out.print("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
