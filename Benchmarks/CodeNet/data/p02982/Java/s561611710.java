
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //2個
		int dimension = scan.nextInt(); //3次元

		int[][] index = new int[n][dimension];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < dimension; j++) {
				index[i][j] = scan.nextInt();
			}
		}
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = 0; k < dimension; k++) {
					sum += Math.pow(index[i][k] - index[j][k], 2);
				}
			}
			
			int root = (int) Math.sqrt(sum);
			if (root * root == sum) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
}