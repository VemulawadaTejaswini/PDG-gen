import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        int l = inp.nextInt();

        long aMatrix[][] = new long[n][m];
        long bMatrix[][] = new long[m][l];


        // Matrix A
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < m; j++) {
                aMatrix[k][j] = inp.nextInt();
            }
        }

        // Matrix B
        for (int k = 0; k < m; k++) {
            for (int j = 0; j < l; j++) {
                bMatrix[k][j] = inp.nextInt();
            }
        }

        long total[][] = matrixCalc(aMatrix, bMatrix, n, m, l);

        for (long[] item : total) {
            String s = "";
            for (long secondItem : item) {
                if (s != "") {
                    s += " ";
                }
                s += secondItem;
            }
            System.out.print(s + "\n");
        }
    }

    public static long[][] matrixCalc(long[][] aMatrix, long[][] bMatrix, int n, int m, int l) {
        long totals[][] = new long[n][l];

        long total;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                total = 0L;
                for(int k = 0; k < m; k++){
                    total += aMatrix[i][k]*bMatrix[k][j];
                }
                totals[i][j] = total;
            }
        }

        return totals;
    }
}

