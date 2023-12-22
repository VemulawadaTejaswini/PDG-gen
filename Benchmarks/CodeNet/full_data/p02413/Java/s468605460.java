import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int row = in.nextInt(), column = in.nextInt();
        int[][] M = new int[row + 1][column + 1];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                M[i][j] = Integer.parseInt(in.next());
                M[i][column] += M[i][j];
                M[row][j] += M[i][j];
                M[row][column] += M[i][j];
            }
        }

        for(int i = 0; i <= row; i++){
            for(int j = 0; j <= column; j++){
                System.out.printf("%d%s", M[i][j], (j == column) ? "\n" : " ");
            }
        }

    }
}
