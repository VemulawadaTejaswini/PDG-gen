import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int a = Integer.parseInt(String.valueOf(str.charAt(0)));
		int b = Integer.parseInt(String.valueOf(str.charAt(1)));
		int c = Integer.parseInt(String.valueOf(str.charAt(2)));
		int d = Integer.parseInt(String.valueOf(str.charAt(3)));

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					int ans = a;
					ans += i == 0 ? b : (-b);
					ans += j == 0 ? c : (-c);
					ans += k == 0 ? d : (-d);

					if (ans == 7) {
						// end
						String out = "";
						out += a;
						out += i == 0 ? "+" : "-";
						out += b;
						out += j == 0 ? "+" : "-";
						out += c;
						out += k == 0 ? "+" : "-";
						out += d + "=7";
						System.out.println(out);
						return;
					}
					
				}
			}

		}
	}

	static double calcDistance(Pair p1, Pair p2) {
		return Math.pow(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2), 0.5);
	}

}

class Pair {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Pair() {

	}

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
