import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		String s = (x == W/2 && y == H/2) ? "1" : "0";
		double area = W*H/2;
		System.out.println(area+" "+s);
	}
}
