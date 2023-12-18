import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();
		long W = sc.nextInt();
		if (H % 2 == 0) {
			System.out.println(H / 2 * W);
		} else if (W % 2 == 0) {
			System.out.println(W / 2 * H);
		} else {
			System.out.println((W - 1) / 2 * H + (W + 1)/ 2);
		}
	}
}