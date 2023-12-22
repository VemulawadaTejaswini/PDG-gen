

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            System.out.println(Main.LCSlength(s1, s2));
        }
		
	}
	
	/* Computes the length of the longest common subsequence of two given strings
	 Uses the algorithm from class with slight modifications to calculate the length of the longest common subsequence*/
	public static int LCSlength(String a, String b) {
		
		int m = a.length();
		int n = b.length();
		int[][] d = new int[m+1][n+1];
		/* Intialize the table. We initialize it with a value of 0 in the first row and column
		 because if one string is empty, then the length will be 0*/
		for (int i = 0; i <= m; i++) {
			d[i][0] = 0;
		}
		for (int j = 0; j <= n; j++) {
			d[0][j] = 0;
		}
		
		// Fill the table
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				/* If the characters at this spot are equal, then the current cell will take on the value of the of the previous
				 iteration plus 1 (since the length of the common subsequence is now increased by 1) */
				if (a.charAt(i-1) == b.charAt(j-1)) {
					d[i][j] = d[i-1][j-1] + 1;
				}
				/* If they are not equal, then we look to the other cells that have iterated over the same location of both strings
				 and take the max value. */
				else {
					d[i][j] = Math.max(d[i][j-1], d[i-1][j]);
				}
				
			}
		}
		// At the end, we should have the correct length
		return d[m][n];
	}
}

