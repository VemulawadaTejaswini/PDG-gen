import java.util.Scanner;
  public class Main{
    public static void main(String[] args){
      Scanner scan = new Scanner();
    	int m,n = scan.nextInt();

    	int[][] A=new int[n][m];
    	int[][] B=new int[m][1];
      int[][] C=new int[n][1];
      
      int A[][]=scan.nextInt[][];
    	int B[][]=scan.nextInt[][];
      int C[][]=scan.nextInt[][];
      
      C[n][1]+=A[n][m]*B[m][1];
      int i,j,k;
      for(i=0;i<n;i++){
        for(j=0;j<2;j++){
          System.out.println(C[i][j]);  
          
        }
      }
}}