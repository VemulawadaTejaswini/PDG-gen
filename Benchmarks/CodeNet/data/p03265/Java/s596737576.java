import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int dx = x2 - x1;
		int dy = y2 - y1;
		
		System.out.println((x2 - dy) + " " + (y2 + dx) + " " + (x1 - dy) + " " + (y1 + dx));
	}
}