import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int set = sc.nextInt();

		for (int k = 0; k < set; k++) {
			String x = sc.next();
			String y = sc.next();
			int m = x.length();
			int n = y.length();
			int[][] cache = new int[m + 1][n + 1];

			for (int i = 0; i <= m + n; i++) {
				for (int j = 0; j <= n; j++) {
					if (i - j < 0 || i - j > m) {
						continue;
					}
					if (i - j == 0 || j == 0) {
						cache[i - j][j] = 0;
					} else {
						if (x.charAt(i - j - 1) == y.charAt(j - 1)) {
							cache[i - j][j] = cache[i - j - 1][j - 1] + 1;
						} else {
							cache[i - j][j] = Math.max(cache[i - j - 1][j], cache[i - j][j - 1]);
						}
					}
				}
			}

			System.out.println(cache[m][n]);
		}
		
         sc.close();
	}
}