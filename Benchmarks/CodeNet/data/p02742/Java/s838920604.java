import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();
		long W = sc.nextInt();
		if (H * W % 2 == 1) {
			System.out.println(H * W / 2 + 1);
		} else {
			System.out.println(H * W / 2);
		}
	}
}
