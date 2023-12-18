import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		if (H % A == 0) {
			System.out.print(H / A);
		} else {
			System.out.print(H / A + 1);
		}
	}
}