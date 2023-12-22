
import java.util.Scanner;

public class Main {
	
	public static int findLCS(String a, String b) {
		
		int m = a.length();
		int n = b.length();
		
		int[][] matrix = new int[m + 1][n + 1];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == 0 || j == 0) {
					matrix[i][j] = 0;
				} else if (a.charAt(i - 1) == b.charAt(j - 1)) {
					// Get value diagonally from the left then add 1
					matrix[i][j] = matrix[i - 1][j - 1] + 1;
				} else {
					// Get Max value from left or top
					matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
				}
			}
		}
		
		return matrix[m][n];
	}
	
	public static void main(String[] args) {
		String ans = "";
		Scanner scan  = new Scanner(System.in);
		int queries = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < queries; i++) {
			String a = scan.next();
			scan.nextLine();
			String b = scan.next();
			System.out.println(findLCS(a, b));
		}

	}

}

