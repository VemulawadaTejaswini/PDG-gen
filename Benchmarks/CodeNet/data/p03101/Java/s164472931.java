import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		int all = H * W;
		all -= (h * W);
		all -= w * (H - h);

		System.out.println(all);
	}
}