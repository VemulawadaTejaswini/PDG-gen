
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean bool = true;
		for (int i = 0; i <= 1000; i++) {
			Double d1 = a / 0.08;
			Double d2 = b / 0.1;
			int i1 = d1.intValue();
			int i2 = d2.intValue();
			if (i1 == i2) {
				System.out.println(i1);
				bool = false;
				break;
			}
		}
		if (bool) {
			System.out.println("-1");
		}
		sc.close();
	}
}