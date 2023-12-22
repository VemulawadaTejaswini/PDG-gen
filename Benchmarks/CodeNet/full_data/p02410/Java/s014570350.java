import java.util.Scanner;

//20180509
//02

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] a = new int[n][m];
		int[] b = new int[m];

		for(int y = 0;y < n;y++) {
			for (int x = 0; x < m; x++) {
				a[y][x] = scanner.nextInt();
			}
		}

		for(int y = 0;y < m;y++) {
			b[y] = scanner.nextInt();
		}

		for(int y = 0;y < n;y++) {
			int ans = 0;
			for (int x = 0; x < m; x++) {
				ans += a[y][x] * b[x];
			}
			System.out.println(ans);
		}

		scanner.close();
    }
}
