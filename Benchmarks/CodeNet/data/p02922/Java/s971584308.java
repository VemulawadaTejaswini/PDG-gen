import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (B == 1) {
			System.out.println(0);
			System.exit(0);
		}
		if ((B % A) != 0) {
			System.out.println(B / A + 1);
		} else {
			System.out.println(B / A);
		}
	}
}
