import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int K = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int temp = 0;
		boolean flag = false;

		while (temp <= B) {
			temp += K;
			if (A <= temp && temp <= B) {
				System.out.println("OK");
				flag = true;
				break;
			}
		}

		if (!flag) System.out.println("NG");
	}
}