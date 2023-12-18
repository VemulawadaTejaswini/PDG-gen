import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int area = w * h;
		int multi;

		if (w/2.0 == x && h/2.0 == y ) {
			multi = 1;
		} else {
			multi = 0;
		}

		System.out.println(area / 2.0);

		System.out.println(multi);
	}

}
