import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		while ((num = in.nextInt()) != 0) {
			long ans = 0;
			for (int i = 0; i < 10; i++) {
				int v = Integer.rotateRight(num, i * 3) & 7;
				if (v >= 4) {
					v++;
				}
				if (v >= 6) {
					v++;
				}
				ans += (v * Math.pow(10, i));
			}
			System.out.println(ans);
		}
	}
}