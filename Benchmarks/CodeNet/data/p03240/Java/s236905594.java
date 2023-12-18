import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int pos[][] = new int[n][3];
		for (int i = 0; i < n; i++) {
			pos[i][0] = sc.nextInt();
			pos[i][1] = sc.nextInt();
			pos[i][2] = sc.nextInt();
		}

		for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				for (int i = 0; i < n; i++) {
					int h = 1;
					boolean b = true;
					if (Math.abs(x - pos[i][0]) + Math.abs(y - pos[i][1]) + pos[i][2] > 0) {
						h = Math.abs(x - pos[i][0]) + Math.abs(y - pos[i][1]) + pos[i][2];
					}
					for (int j = 0; j < n; j++) {
						if (h - Math.abs(x - pos[j][0]) - Math.abs(y - pos[j][1]) != pos[j][2]) {
							b = false;
							break;
						}
					}
					if (b) {
						System.out.println(x + " " + y + " " + h);
						return;
					}
				}
			}
		}
	}
}
