import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int x4 = y1-y2+x1;
		int y4 = x2-x1+y1;
		int x3 = y1-y2+x2;
		int y3 = x2-x1+y2;

		System.out.print(x3+" "+y3+" "+x4+" "+y4);

	}
}
