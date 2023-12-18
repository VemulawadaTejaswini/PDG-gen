import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());

		//		int[] d = new int[n];
		//
		//		for (int i = 0; i < n; i++) {
		//			d[i] = Integer.parseInt(sc.next());
		//		}

		int sum = a + b + c;
		if (sum >= 22) {
			System.out.println("bust");
		} else {
			System.out.println("win");
		}
		sc.close();
	}
}