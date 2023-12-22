import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int m = scanner.nextInt();

     int[][] A = new int[n][m];
     int[] B = new int[m];

     for(int i=0;i<n;i++){
       for(int j=0;j<m;j++){
         A[i][j] = scanner.nextInt();
       }
     }

     for(int i=0;i<m;i++){
       B[i] = scanner.nextInt();
     }


     for(int i=0;i<n;i++){
       int sum = 0;
       for(int j=0;j<m;j++){
         sum = sum + (A[i][j]*B[j]);
       }
       System.out.println(sum);
     }
  }
}

