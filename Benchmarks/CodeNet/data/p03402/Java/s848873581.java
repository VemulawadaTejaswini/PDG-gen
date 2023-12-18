import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = 100;
		char[][] field = new char[n][n];
		for (int i = 0; i < n / 2; i++) {
		    Arrays.fill(field[i], '#');
		}
		for (int i = n / 2; i < n; i++) {
		    Arrays.fill(field[i], '.');
		}
		int wCount = 1;
		for (int i = 0; i < n / 2 && wCount < a; i += 2) {
		    for (int j = 0; j < n && wCount < a; j += 2) {
		        field[i][j] = '.';
		        wCount++;
		    }
		}
		int bCount = 1;
		for (int i = n - 1; i >= n / 2 && bCount < b; i -= 2) {
		    for (int j = 0; j < n && bCount < b; j += 2) {
		        field[i][j] = '#';
		        bCount++;
		    }
		}
		StringBuilder sb = new StringBuilder();
		sb.append("100 100\n");
		for (int i = 0; i < n; i++) {
		    sb.append(field[i]).append("\n");
		}
	    System.out.print(sb);
   }
}


