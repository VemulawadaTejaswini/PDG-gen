import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);

    void solve() {
        int r, c;
        int[][] input, output;
        r = sc.nextInt();
        c = sc.nextInt();
        input = new int[r][];
        for (int i = 0; i < r; ++i) {
            input[i] = new int[c];
            for (int j = 0; j < c; ++j) {
                input[i][j] = sc.nextInt();
            }
        }

        output = new int[r + 1][c + 1];
        int sum = 0;
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                output[i][j] = input[i][j];
                sum += input[i][j];
            }
        }

        //h sum
        for (int i = 0; i < r; ++i) {
            int hsum = 0;
            for (int j = 0; j < c; ++j) {
                hsum += output[i][j];
            }
            output[i][c] = hsum;
        }

        //v sum
        for (int j = 0; j < c; ++j) {
            int vsum = 0;
            for (int i = 0; i < r; ++i) {
                vsum += output[i][j];
            }
            output[r][j] = vsum;
        }

        //sum
        output[r][c] = sum;

        for (int i = 0; i <= r; ++i) {
            for (int j = 0; j < c; ++j) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println(output[i][c]);
        }

    }
}
