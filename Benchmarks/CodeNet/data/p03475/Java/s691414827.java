import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[][] a = new int[n - 1][3];
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int time;
		for (int i = 0; i < n - 1; i++) {
			time = 0;
			for (int j = i; j < n - 1; j++) {
				if (time <= a[j][1]) {
					time = a[j][0] + a[j][1];
				} else if ((time - a[j][1]) % a[j][2] == 0) {
					time += a[j][0];
				} else {
					time += a[j][0] + (time - a[j][1]) % a[j][2];
				}
			}
			System.out.println(time);
		}
		System.out.println(0);
	}
}
