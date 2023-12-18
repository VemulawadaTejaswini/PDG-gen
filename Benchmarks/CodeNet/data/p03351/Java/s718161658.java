import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		boolean flg = true;

		if (Math.abs(a - b) > d)
			flg = false;

		if (Math.abs(b - c) > d)
			flg = false;

		if (Math.abs(a - c) <=d)
			flg = true;
		System.out.println(flg ? "Yes" : "No");
	}

}