import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		if (N % Math.max(H, W) == 0) {
			System.out.print(N / Math.max(H, W));
		} else {
			System.out.print(N / Math.max(H, W) + 1);
		}
	}
}