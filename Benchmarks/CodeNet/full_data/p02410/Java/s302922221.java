import java.util.*;
  public class Main{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);

    	int[][] A=new int[][];
    	int[] B=new int[];
      int C;

      for (int s = 0;s<n;s++) {
        for(int t =0;t<m;t++){
        A[s][t]=scan.nextInt();
      }}
    	for (int l = 0;l<m;l++)   {
         B[l]=scan.nextInt();}

     int i,j;
      C[n][1]+=A[n][m]*B[m][1];
      
      for(i=0;i<n;i++){
        for(j=0;j<2;j++){
          System.out.println(C[i][j]);

        }
      }
}}