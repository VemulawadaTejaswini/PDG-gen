import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		int[] a = new int[3];
		int[] b = new int[3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for(int i = 0; i <= 100; i++) {
			for(int j = 0; j <= 100; j++) {
				a[0] = i; b[0] = j;
				if(a[0] + b[0] != c[0][0]) continue;
				else {
					a[1] = c[1][0] - b[0];
					a[2] = c[2][0] - b[0];
					b[1] = c[0][1] - a[0];
					b[2] = c[0][2] - a[0];
					for(int k = 1; k < 3; k++) {
						for(int l = 1; l < 3; l++) {
							if(c[k][l] == a[k] + b[l]) {
								count++;
							}else {
								count = 0;
							}
						}
					}
					if(count == 4) {
						System.out.println("Yes");
						return;
					}
					count = 0;
				}
			}
		}
		System.out.println("No");
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}