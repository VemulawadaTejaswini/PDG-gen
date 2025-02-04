import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		while ((t = in.nextInt()) > 0) {
			int n = in.nextInt();
			int time = 0;
			while (n-- > 0) {
				if (time < t) {
					time -= in.nextInt();
					time += in.nextInt();
				} else {
					in.next();
					in.next();
				}
			}
			if (time >= t) {
				System.out.println("OK");
			} else {
				System.out.println(t - time);
			}
		}
	}
}