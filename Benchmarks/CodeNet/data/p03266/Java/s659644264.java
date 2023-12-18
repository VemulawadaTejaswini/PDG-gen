import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n, k;
		n = stdin.nextInt();
		k = stdin.nextInt();

		// int a, b, c;
		// int[][][] array = new int[n][n][n];
		int count = 0;
		for (int i = 1; i <= n; i++)
			for (int j = i; j <= n; j++)
				
				if ((i + j) % k == 0)
					for (int kk = j; kk <= n; kk++)
						if ((j + kk) % k == 0 && (i + kk) % k == 0) {
							if (i == j && j == kk && kk == i)
								count ++;
							else
								count += 3;
							
						}
		System.out.println(count);
	}
	/*
	 * 111 
	 * 112
	 * 113 
	 * 121x 
	 * 122 
	 * 123 
	 * 131x 
	 * 132x 
	 * 133 
	 * 6way
	 * 
	 * 211x 212x 213x 221x 222 223 231x 232x 233 3way
	 * 
	 * 311x 312x 313x 321x 322x 323x 331x 332x 333 1way
	 */

}
