import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int X = x2 - x1;
		int Y = y2 - y1;
		System.out.println((x2 - Y) + " " + (y2 + X) + " " + (x1 - Y) + " " + (y1 + X));
	}
}
