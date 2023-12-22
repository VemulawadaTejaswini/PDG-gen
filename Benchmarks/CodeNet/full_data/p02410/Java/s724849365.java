import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int maxrow, maxcol;

        maxrow = scanner.nextInt();
        maxcol = scanner.nextInt();

        int[][] a = new int[maxrow][maxcol];

        for(int i = 0; i < maxrow; i++){
            for(int ii = 0; ii < maxcol; ii++){
                a[i][ii] = scanner.nextInt();
            }
        }

        int[] b = new int[maxcol];

        for(int i = 0; i < maxcol; i++){
            b[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int row = 0; row < maxrow; row++){
            sum = 0;
            for(int col = 0; col < maxcol; col++){
                sum += (a[row][col] * b[col]);
            }
            System.out.println(sum);
        }

        scanner.close();
    }
}

