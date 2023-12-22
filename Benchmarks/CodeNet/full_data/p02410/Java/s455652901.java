import java.util.Arrays;
import java.util.Scanner;



public class Main{


	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();
		int m=scan.nextInt();

		int[][] matrix_nm=new int[n][m];
		int[] matrix_m1=new int[m];
		int[] matrix_n1=new int[n];
		Arrays.fill(matrix_n1, 0);

		for(int i=0;i<n;i++){
		  for(int j=0;j<m;j++){
			matrix_nm[i][j]=scan.nextInt();
		  }
		}

		for(int j=0;j<m;j++){
			matrix_m1[j]=scan.nextInt();
		}

		for(int j=0;j<n;j++){
		  for(int i=0;i<m;i++){
			matrix_n1[j]+=matrix_nm[j][i]*matrix_m1[i];
		  }System.out.println(matrix_n1[j]);
		}

		scan.close();
	}

}