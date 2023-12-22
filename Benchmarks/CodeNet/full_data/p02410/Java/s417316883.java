
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 
		 int A[][]= new int [n][m];
		 int B[]= new int [m];
		 int C[]= new int [n];

			 for(int i =0;i<n;i++){
				 for(int j =0;j<m;j++){
				 int a = sc.nextInt();
				 A[i][j]=a;
				 }
			 }
				 for(int k =0;k<m;k++){
					 int b = sc.nextInt();
					 B[k]=b;
					 }
				 
			for(int g=0;g<n;g++){
			 for(int l=0;l<m;l++){
				 C[g]=C[g]+A[g][l]*B[l];
			 }
			 System.out.println(C[g]);
			}
			
		 
		//System.out.println("");
	}
	

}

