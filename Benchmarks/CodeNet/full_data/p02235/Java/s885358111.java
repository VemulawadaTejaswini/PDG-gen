import java.util.Scanner;

public class Main {
	public static int longestSub(String str1, String str2) {
		int[][] table = new int[str1.length()][str2.length()];
		for (int r = 0; r < table.length; r++) {
			for (int c = 0; c < table[r].length; c++) {
				if (str1.charAt(r) == str2.charAt(c)) {
					if (r == 0 || c == 0) table[r][c] = 1;
					else table[r][c] = table[r-1][c-1] + 1;
				}
				else {
					int upMax = 0;
					int leftMax = 0;
					if (r != 0) upMax = table[r-1][c];
					if (c != 0) leftMax = table[r][c-1];
					table[r][c] = Math.max(upMax, leftMax);
				}
			}
		}
		
		return table[str1.length()-1][str2.length()-1];
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numPairs = scanner.nextInt();
		for (int i = 0; i < numPairs; i++) {
			System.out.println(longestSub(scanner.next(), scanner.next()));
		}
		scanner.close();
	}
}

