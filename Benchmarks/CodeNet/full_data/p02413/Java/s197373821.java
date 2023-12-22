import java.util.Scanner;
import java.util.Arrays;

public class Main { 
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in); 
			
		int rows = sc.nextInt(); 
		int columns = sc.nextInt(); 
		int[][] data = new int[rows][columns];
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				data[i][j]=sc.nextInt();
			}
		}
		
		int[] rowSums = new int[rows];
		int[] colSums = new int[columns];
		int sum = 0;
		Arrays.fill(rowSums, 0);
		Arrays.fill(colSums, 0);
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<columns; j++ ) {
				rowSums[i]+= data[i][j];
				colSums[j]+= data[i][j];
				sum+= data[i][j];
			}
		}
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				System.out.print(""+data[i][j]+" ");
			}
			System.out.println(""+ rowSums[i]);
		}
		for(int j=0; j<columns; j++){
			System.out.print(""+colSums[j]+" ");
		}
		System.out.println(sum);

		 
	} 
}



