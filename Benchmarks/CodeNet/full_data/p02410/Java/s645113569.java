import java.util.Scanner;
  public class Main{
    public static void main(String[] args){
      Scanner scan = new Scanner();
    	int m,n = scan.nextInt();

    	int[][] A=new int[n][m];
    	int[] B=new int[m];
      int[] C=new int[n];

      for (int s = 0;s<n;s++) {
        for(int t =0;t<m;t++){
        A[s][t]=scan.nextInt();
      }}
    	for (int l = 0;l<m;l++) {
         B[l]=scan.nextInt();}

     
      C[n] +=A[n][m]*B[m];
      
      
        for(int j=0;j<2;j++){
          System.out.println(C[j]);

        }
      
}}