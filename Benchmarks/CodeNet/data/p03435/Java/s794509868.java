import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i <= 100 ; i++) {
			int[] a = new int[3];
			int[] b = new int[3];
			for(int j = 0 ; j < 3 ; j++) a[j] = c[j][0] - i;
			for(int j = 0 ; j < 3 ; j++) b[j] = c[0][j] - a[0];
			boolean ok = true;
			for(int j = 0 ; j < 3 ; j++) {
				for(int k = 0 ; k < 3 ; k++) {
					if(c[j][k] != a[j] + b[k]) ok = false;
				}
			}
			if(ok) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
