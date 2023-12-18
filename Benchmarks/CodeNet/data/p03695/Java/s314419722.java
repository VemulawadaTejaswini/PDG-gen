import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] color = new int[9];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			color[a / 400]++;
		}
		sc.close();

		int min = 0;
		for (int i = 0; i < color.length - 1; i++) {
			if (color[i] > 0) {
				min++;
			}
		}
		System.out.println(min + " " + (min + color[8]));
	}
}
