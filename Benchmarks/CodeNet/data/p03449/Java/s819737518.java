import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[2][n];
        int candySum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int i, j;
        int max = 0;
        for (; n >= 0; n--) {
            candySum = 0;
            for (i = 0; i < n; i++) {
                candySum += array[0][i];
            }
            for (j = i; j < n; j++) {
                candySum += array[1][j];
            }
            if (candySum > max)
                max = candySum;
        }
        System.out.println(max);
    }
}
