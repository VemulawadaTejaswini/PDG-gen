import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int sumH = 0;
        int sumV = 0;
        int[][] l = new int[r + 1][c + 1];

        for (int v = 0; v < r; v++) {
            for (int h = 0; h < c; h++) {
                l[v][h] = scan.nextInt();
            }
        }

        for (int v = 0; v < r; v++) {
            for (int h = 0; h < c; h++) {
                sumH += l[v][h];
            }
            l[v][c] = sumH;
            sumH = 0;
        }


        for (int h = 0; h < c +1; h++) {
            for (int v = 0; v < r +1; v++) {
                sumV += l[v][h];
            }
            l[r][h] = sumV;
            sumV = 0;
        }

        for (int v = 0; v < r + 1; v++) {
            for (int h = 0; h < c + 1; h++) {
                if (h == c) {
                    System.out.print(l[v][h]);
                } else {
                    System.out.print(l[v][h] + " ");
                }
            }
            System.out.println();
        }
    }
}