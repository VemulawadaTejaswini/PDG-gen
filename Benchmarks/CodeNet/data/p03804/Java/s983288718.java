import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		for (int i = 1; i <= n; i++) {
			String c;
			c = sc.next();
			for (int j = 1; j <= n; j++) {
				a[i][j] = c.charAt(0);
			}
		}
		for (int i = 1; i <= m; i++) {
			String c;
			c = sc.next();
			for (int j = 1; j <= m; j++) {
				b[i][j] = c.charAt(0);
			}
		}
		if (n < m) {
			System.out.println("No");
		}
	}
}
	