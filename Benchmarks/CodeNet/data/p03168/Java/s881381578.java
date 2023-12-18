import javax.swing.*;
import java.io.*;
import java.sql.Struct;
import java.text.DecimalFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] board = new double[n];
        for(int i = 0; i < n; i++) {
            board[i] = sc.nextDouble();
        }
        double[][] probabilities = new double[n][n + 1];
        probabilities[0][0] = board[0];
        probabilities[0][1] = 1 - board[0];

        for(int i = 1 ; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                double res = 0;
                if (i > 0) {
                    res += probabilities[i - 1][j] * board[i];
                }
                if (j > 0 && i > 0) {
                    res += probabilities[i - 1][j - 1] * (1 - board[i]);
                }
                probabilities[i][j] = res;
            }
        }

        double res = 0;
        for (int j = 0; j <= n / 2 ; j++) {
            res += probabilities[n - 1][j];
        }

        System.out.println(String.format("%.9f", res));
    }
}