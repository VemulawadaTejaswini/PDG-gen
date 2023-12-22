import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quant = input.nextInt();
		String[] seqs = new String[2*quant];
		for(int i = 0; i < 2 * quant; i++) {
			String sequence = input.next();
			seqs[i] = sequence;
		}
		int x = 0;
		while(x < seqs.length - 1) {
			System.out.println(lcs(seqs[x], seqs[x+1]));
			x += 2;
		}
	}
	public static int lcs(String str, String str1) {
		int n = str.length();
		int m = str1.length();		
		int[][] table = new int[n + 1][m + 1];
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= m; j++) {
				if(i == 0 || j == 0)
					table[i][j] = 0;
				else if(str.charAt(i-1) == str1.charAt(j - 1))
					table[i][j] = 1 + table[i-1][j-1];
				else
					table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
			}
		}
		return table[n][m];	
	}
}

