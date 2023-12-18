import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean flg = false;
		for (int i = 0; i < n; i++) {
			if (scan.next().equals("Y")) {
				flg = true;
				break;
			}
		}

		if (flg) {
			System.out.println("Four");
		} else {
			System.out.println("Three");
		}
		scan.close();
	}

}
