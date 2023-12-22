import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] arr1 = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr1[i][j] = scanner.nextInt();
			}
		}
		int[] arr2 = new int[m];
		for(int i=0;i<m;i++) {
			arr2[i] = scanner.nextInt();
		}
		scanner.close();
		int[] arr3 = new int[n];
		for(int i=0;i<n;i++) {
			arr3[i] = 0;
			for(int j=0;j<m;j++) {
				arr3[i] += arr1[i][j]*arr2[j]; 
			}
			System.out.println(arr3[i]);
		}
	}
}
