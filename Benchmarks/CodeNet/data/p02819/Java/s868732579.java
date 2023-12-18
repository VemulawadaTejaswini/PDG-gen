import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (true) {
			boolean judge = true;
			for (int i = 2; i <= Math.sqrt(N); i++) {
				if (N % i == 0) {
					judge = false;
					break;
				}
			}
			if (judge) {
				break;
			}
			N++;
		}
		System.out.print(N);
	}
}