import java.util.Scanner;


public class Main {

	private static int[][] cache;
	private static char[] x;
	private static char[] y;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int set = sc.nextInt();

		for (int k = 0; k < set; k++) {
			x = sc.next().toCharArray();
			y = sc.next().toCharArray();
			int m = x.length;
			int n = y.length;
			
			// ボトムアップ型、メモリ節約
			cache = new int[2][Math.min(m, n) + 1];
			// 初期化不要(0)

			for (int i = 1; i <= Math.max(m, n); i++) {
				for (int j = 1; j <= Math.min(m, n); j++) {
					if (x[i - 1] == y[j - 1]) {
						cache[i % 2][j] = cache[(i - 1) % 2][j - 1] + 1;
					} else {
						cache[i % 2][j] = Math.max(cache[(i - 1) % 2][j], cache[i % 2][j - 1]);
					}
				}
			}
			
			System.out.println(cache[m % 2][n]);
		}
		
         sc.close();
	}
}