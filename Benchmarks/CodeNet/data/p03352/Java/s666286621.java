import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = x; i >= 1; i--) {
			int a = (int) Math.sqrt(i);
			if (a * a == i) {
				System.out.println(i);
				return;
			}
		}
	}
}
