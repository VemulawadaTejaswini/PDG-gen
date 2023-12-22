
import java.util.Scanner;

public class Main {
	static int max(int x, int y) {
		if (x>y) {
			return x;
		} else {
			return y;
		}
	}
	public static int LCS(char[] x, char[] y) {
		int m = x.length;
		int n = y.length;
		int[][] compArray = new int[m+1][n+1];
		for (int i=0; i<=m; i++ ) {
			for (int j=0; j<=n; j++) {
				compArray[i][j] = 0;
			}
		}
		for (int i=0; i<=m; i++) {
			for (int j=0; j<=n; j++) {
				if (i==0 || j==0) {
					continue;
				}
				else if (x[i-1]!=y[j-1]) {
					compArray[i][j] = max(compArray[i-1][j], compArray[i][j-1]);
					
				} else {
					compArray[i][j] = compArray[i-1][j-1] + 1;
				}
			}
		}
		return compArray[m][n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numCalls = in.nextInt();
		in.nextLine();
		for (int i=0; i<numCalls; i++) {
			String sample1text = in.nextLine();
			char[] sample1 = sample1text.toCharArray();
			String sample2text = in.nextLine();
			char[] sample2 = sample2text.toCharArray();
			System.out.println(LCS(sample1, sample2));
		}
	}

}

