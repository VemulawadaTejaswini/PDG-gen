import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	
	public static int LCS(String x, String y) {
		int[][] table = new int[x.length()+1][y.length()+1];
		
		for (int i = 1; i < x.length()+1; i++) {
			for(int j = 1; j < y.length()+1; j++) {
				if(x.charAt(i-1) != y.charAt(j-1)) {
					table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
				} else {
					table[i][j] = 1+table[i-1][j-1];
				}
			}

		}
		return table[x.length()][y.length()];
	}
	public static void main(String args[]) {
		Scanner k = new Scanner(System.in);
		int n = k.nextInt();
		for(int x = 0; x < n; x++) {
			String s1 = k.next();
			String s2 = k.next();
			System.out.println(LCS(s1,s2));
		}
		
	}
}

