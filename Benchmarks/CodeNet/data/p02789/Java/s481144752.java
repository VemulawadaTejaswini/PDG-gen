import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		if (H == W) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}