import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //2個
		int d = scan.nextInt(); //3次元

		int[][] index = new int[n][d];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				index[i][j] = scan.nextInt();
			}
		}
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				
				int sum = 0;
				for (int k = 0; k < d; k++) {
					sum += Math.pow((index[i][k] - index[j][k]), 2);
				}
				
				int root = (int) Math.sqrt(sum);
				
				if (root * root == sum) count++;
			}
		}
		
		System.out.println(count);
	}
}