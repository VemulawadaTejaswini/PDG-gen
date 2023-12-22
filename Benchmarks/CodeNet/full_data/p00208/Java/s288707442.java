import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		while ((num = in.nextInt()) != 0) {
			long ans = 0;
			for (int i = 27; i >= 0; i -= 3) {
				int v = Integer.rotateRight(num, i) & 7;
				if (v >= 6) {
					v += 2;
				} else if (v >= 4) {
					v++;
				}
				ans = ans * 10 + v;
			}
			System.out.println(ans);
		}
	}
}