import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D, N;
		D = sc.nextInt();
		N = sc.nextInt();
		sc.close();

		switch (D) {
		case 0:
			System.out.println(N);
			break;
		case 1:
			System.out.println(N + "00");
			break;
		default:
			System.out.println(N + "0000");
			break;
		}
	}
}
