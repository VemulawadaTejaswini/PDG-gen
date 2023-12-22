import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(),  m = in.nextInt(), l = in.nextInt();
        int[][] m1 = new int[n][m], m2 = new int[m][l], m3 = new int[n][l];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m;j++) m1[i][j]= in.nextInt();
        }

        for(int i = 0; i<m;i++){
            for(int j = 0; j<l;j++) m2[i][j]= in.nextInt();
        }

        for(int i = 0; i<n;i++){
            for(int j = 0; j<l;j++){
                long sum = 0;
                for(int k = 0; k < m; k++)sum += m1[i][k] * m2[k][j];
                System.out.printf("%d%s", sum, (j==l-1) ? "\n":" ");
            }
        }


    }
}
