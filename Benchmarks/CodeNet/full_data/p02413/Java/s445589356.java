import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] n = new int[r + 1][c + 1];

        for (int[] i : n) {
            for (int j : i) {
                j = 0;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                n[i][j] = sc.nextInt();
                n[i][c] += n[i][j];
                n[r][j] += n[i][j];
            }
        }
        for (int j = 0; j < c; j++) {
            n[r][c] += n[r][j];
        }

        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println(n[i][c]);
        }

    }

}
