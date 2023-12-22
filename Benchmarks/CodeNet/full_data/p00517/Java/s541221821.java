import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			int n = sc.nextInt();

			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = 0;
			for(int i = 1; i < n; i++) {
				int toX = sc.nextInt();
				int toY = sc.nextInt();
				sum += shortestPath( x, y, toX, toY);
				x = toX;
				y = toY;
			}
			System.out.println(sum);
		}
	}
	public static int shortestPath(int x, int y, int toX, int toY) {
		int slant = 0;
		if((toX - x) * (toY - y) > 0) {
			slant = Math.min(Math.abs(toX-x), Math.abs(toY-y));
		}
		return Math.abs(toX-x)+Math.abs(toY-y)-slant;
	}
}
