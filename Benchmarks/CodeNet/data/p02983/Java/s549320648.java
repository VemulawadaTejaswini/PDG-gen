import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int l = sc.nextInt();
		int r = sc.nextInt();
		if (r - l >= 2018) {
			System.out.println(0);
		} else {
			int min = Integer.MAX_VALUE;
			for (int i = l; i < r; i++) {
				for (int j = l + 1; j <= r; j++) {
					min = Math.min(min, (i * j) % 2019);
				}
			}
			System.out.println(min);
		}
	}
}
