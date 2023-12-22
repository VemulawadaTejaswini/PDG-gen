import java.util.Scanner;


public class Main {

	public class Turtle {
		double x, y;
		int theta;

		public Turtle() {
			this.x = 0; this.y = 0;
			this.theta = 90;
		}

		public void move(int dist, int rotation) {
			double rad = Math.toRadians(this.theta);
			this.x += dist * Math.cos(rad);
			this.y += dist * Math.sin(rad);
			this.theta -= rotation;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Turtle turtle = (new Main()).new Turtle();
		while (sc.hasNext()) {
			String[] s = sc.nextLine().split(",");
			int d = Integer.parseInt(s[0]),
				r = Integer.parseInt(s[1]);
			if (d == 0 && r == 0) {
				System.out.println(String.format("%d\n%d", (int) turtle.x, (int) turtle.y));
			} else {
				turtle.move(d, r);
			}
		}

	}
}