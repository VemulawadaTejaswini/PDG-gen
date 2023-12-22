import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int direction = 90;
		double x = 0;
		double y = 0;
		while(true) {
			String s = sc.next();
			String[] sp = s.split(",");
			int step = Integer.valueOf(sp[0]);
			int rotation = -Integer.valueOf(sp[1]);
			if (step == 0) {
				break;
			}
			x += Math.cos(Math.toRadians(direction)) * step;
			y += Math.sin(Math.toRadians(direction)) * step;
			direction += rotation;
		}
		System.out.println((int) x);
		System.out.println((int) y);
	}

}