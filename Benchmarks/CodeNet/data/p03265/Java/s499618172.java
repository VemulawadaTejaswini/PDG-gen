import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int x1 = Integer.parseInt(tokens[0]);
		int y1 = Integer.parseInt(tokens[1]);
		int x2 = Integer.parseInt(tokens[2]);
		int y2 = Integer.parseInt(tokens[3]);
		int dx = x2 - x1;
		int dy = y2 - y1;
		int x3 = x2 - dy;
		int y3 = y2 + dx;
		int x4 = x1 - dy;
		int y4 = y1 + dx;
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
		in.close();
	}
}