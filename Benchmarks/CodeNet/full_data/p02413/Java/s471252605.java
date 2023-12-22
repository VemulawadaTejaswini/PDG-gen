import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int r, c, sum;
        int[][] table;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        table = new int[r + 1][c + 1];
        for (int i = 0; i < r; i++) {
            sum = 0;
            for (int j = 0; j < c; j++) {
                table[i][j] = sc.nextInt();
                sum += table[i][j];
            }
            table[i][c] = sum;
        }

        for (int i = 0; i < c + 1; i++) 
                table[r][i] = 0;

        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < c + 1; j++) {
                System.out.print(table[i][j]);
                table[r][j] += table[i][j];
                if (j != c)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
