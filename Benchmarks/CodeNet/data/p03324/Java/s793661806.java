import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int x = 100;
		if (D == 2) {
			x *= 100;
		}
		if (N <= 99) {
			System.out.println(D > 0 ? x * N : N);
		} else {
			System.out.println(D > 0 ? x * 101 : 101);
		}
		sc.close();
	}
}