import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		boolean f = false;
		for(int i=a;i<=b;i++) {
			if (i % k == 0) {
				System.out.println("OK");
				f = true;
				break;
			}
		}
		if (!f)
		System.out.println("NG");
	}
}
