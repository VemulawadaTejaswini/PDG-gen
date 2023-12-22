import java.util.Scanner;

//20180510
//02

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int l = scanner.nextInt();
		long[][] a = new long[n][m];
		long[][] b = new long[m][l];
		long[][] c = new long[n][l];

		for(int x = 0;x < n;x++) {
			for (int y = 0; y < m; y++) {
				a[x][y] = scanner.nextLong();
			}
		}

		for(int x = 0;x < m;x++) {
			for (int y = 0; y < l; y++) {
				b[x][y] = scanner.nextLong();
			}
		}

		for(int x = 0;x < n;x++) {
			for (int y = 0; y < l; y++) {
				for (int z = 0; z < m; z++) {
					c[x][y] += a[x][z] * b[z][y];
				}
			}
		}

		for(int x = 0;x < n;x++) {
			for (int y = 0; y < l-1; y++) {
					System.out.printf("%d ",c[x][y]);
			}
			System.out.println(c[x][l-1]);
		}

		scanner.close();
    }
}
