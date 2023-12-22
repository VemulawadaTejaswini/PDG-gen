
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		while((n = scan.nextInt()) != 0){
			int[][] matrix = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = scan.nextInt();
				}
			}

			HashSet<Integer> set = new HashSet<Integer>();

			for (int i = 0; i < n; i++) {

				int min = -1,no = -1;
				for (int j = 0; j < n ; j++) {
					if(min==-1 || min>matrix[i][j]){
						min = matrix[i][j];
						no = i*n+j;
					}
				}
				if(set.contains(no)) {
					System.out.println(matrix[no/n][no%n]);
					break;
				}
				set.add(no);

				int max = 0;
				for (int j = 0; j < n; j++) {
					if(max<matrix[j][i]){
						max = matrix[j][i];
						no = j*n+i;
					}
				}
				if(set.contains(no)) {
					System.out.println(matrix[no/n][no%n]);
					break;
				}
				set.add(no);
			}
		}
	}
}